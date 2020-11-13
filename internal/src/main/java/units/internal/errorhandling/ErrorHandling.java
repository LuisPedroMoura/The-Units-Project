package units.internal.errorhandling;

import static java.lang.System.out;

import java.io.PrintStream;

import org.antlr.v4.runtime.ParserRuleContext;

/**
 * Error handling module for uniform error handling within ANTLR4.
 *
 * @author  Miguel Oliveira e Silva (mos@ua.pt)
 * @version 2.0
 * @since   2013-02-20
 */
@SuppressWarnings("checkstyle:hiddenfield")
public abstract class ErrorHandling {

    /**
     * The attribute logFile.
     */
    private static PrintStream logFile = out; // default
    /**
     * The attribute errorCount.
     */
    private static int errorCount = 0;
    /**
     * The attribute warningCount.
     */
    private static int warningCount = 0;

    /**
     * The color constant RED.
     */
    public static final String RED = "\033[0;31m";
    /**
     * The color constant YELLOW.
     */
    public static final String YELLOW = "\033[0;33m";
    /**
     * The color constant BLUE.
     */
    public static final String BLUE = "\033[0;34m";

    /**
     * The color constant RESET.
     */
    public static final String RESET = "\033[0m";

    /**
     * The constant INFO.
     */
    protected static final String INFO = "INFO";
    /**
     * The constant WARNING.
     */
    protected static final String WARNING = "WARNING";
    /**
     * The constant ERROR.
     */
    protected static final String ERROR = "ERROR";


    /**
     * Log a new line.
     */
    public static void newLine() {
        logFile.println();
        logFile.flush();
    }

    /**
     * Log a new message.
     *
     * <p><dl><dt><b>Precondition:</b></dt>
     *    <dd>{@code text != null && text.length() > 0}</dd>
     * </dl></p>
     *
     * @param text message
     */
    public static void printInfo(final String text) {
        assert text != null && text.length() > 0;

        printMessage(text, BLUE, INFO);
    }

    /**
     * Log a new warning.
     *
     * <p><dl><dt><b>Precondition:</b></dt>
     *    <dd>{@code text != null && text.length() > 0}</dd>
     * </dl></p>
     *
     * @param text message
     */
    public static void printWarning(final String text) {
        assert text != null && text.length() > 0;

        warningCount++;
        printMessage(text, YELLOW, WARNING);
    }

    /**
     * Log a new error.
     *
     * <p><dl><dt><b>Precondition:</b></dt>
     *    <dd>{@code text != null && text.length() > 0}</dd>
     * </dl></p>
     *
     * @param text message
     */
    public static void printError(final String text) {
        assert text != null && text.length() > 0;

        errorCount++;
        printMessage(text, RED, ERROR);
    }

    /**
     * Log a new message.
     *
     * <p><dl><dt><b>Precondition:</b></dt>
     *    <dd>{@code line > 0}</dd>
     *    <dd>{@code text != null && text.length() > 0}</dd>
     * </dl></p>
     *
     * @param line line number
     * @param text message
     */
    public static void printInfo(final int line, final String text) {
        assert line > 0;
        assert text != null && text.length() > 0;

        printMessage(line, text, BLUE, INFO);
    }

    /**
     * Log a new warning.
     *
     * <p><dl><dt><b>Precondition:</b></dt>
     *    <dd>{@code line > 0}</dd>
     *    <dd>{@code text != null && text.length() > 0}</dd>
     * </dl></p>
     *
     * @param line line number
     * @param text message
     */
    public static void printWarning(final int line, final String text) {
        assert line > 0;
        assert text != null && text.length() > 0;

        warningCount++;
        printMessage(line, text, YELLOW, WARNING);
    }

    /**
     * Log a new error.
     *
     * <p><dl><dt><b>Precondition:</b></dt>
     *    <dd>{@code line > 0}</dd>
     *    <dd>{@code text != null && text.length() > 0}</dd>
     * </dl></p>
     *
     * @param line line number
     * @param text message
     */
    public static void printError(final int line, final String text) {
        assert line > 0;
        assert text != null && text.length() > 0;

        errorCount++;
        printMessage(line, text, RED, ERROR);
    }

    /**
     * Log a new message.
     *
     * <p><dl><dt><b>Precondition:</b></dt>
     *    <dd>{@code ctx != null}</dd>
     *    <dd>{@code text != null && text.length() > 0}</dd>
     * </dl></p>
     *
     * @param ctx parser tree node reference
     * @param text message
     */
    public static void printInfo(final ParserRuleContext ctx,
                                 final String text) {
        assert ctx != null;
        assert text != null && text.length() > 0;

        printMessage(ctx, text, BLUE, INFO);
    }

    /**
     * Log a new warning.
     *
     * <p><dl><dt><b>Precondition:</b></dt>
     *    <dd>{@code ctx != null}</dd>
     *    <dd>{@code text != null && text.length() > 0}</dd>
     * </dl></p>
     *
     * @param ctx parser tree node reference
     * @param text message
     */
    public static void printWarning(final ParserRuleContext ctx,
                                    final String text) {
        assert ctx != null;
        assert text != null && text.length() > 0;

        warningCount++;
        printMessage(ctx, text, YELLOW, WARNING);
    }

    /**
     * Log a new error.
     *
     * <p><dl><dt><b>Precondition:</b></dt>
     *    <dd>{@code ctx != null}</dd>
     *    <dd>{@code text != null && text.length() > 0}</dd>
     * </dl></p>
     *
     * @param ctx parser tree node reference
     * @param text message
     */
    public static void printError(final ParserRuleContext ctx,
                                  final String text) {
        assert ctx != null;
        assert text != null && text.length() > 0;

        errorCount++;
        printMessage(ctx, text, RED, ERROR);
    }

    /**
     * Regist a new error.
     *
     */
    public static void registerError() {
        errorCount++;
    }

    /**
     * Exists at least one error?
     *
     * @return {@code boolean} true, in the presence of a registered error
     */
    public static boolean error() {
        return errorCount > 0;
    }

    /**
     * Number of registered errors.
     *
     * @return {@code int} number of errors
     */
    public static int errorCount() {
        return errorCount;
    }

    /**
     * Number of registered warnings.
     *
     * @return {@code int} number of warnings
     */
    public static int warningCount() {
        return warningCount;
    }

    /**
     * Redirect log to a new stream file.
     *
     * <p><dl><dt><b>Precondition:</b></dt>
     *    <dd>{@code printStream != null}</dd>
     * </dl></p>
     *
     * @param printStream stream
     */
    @SuppressWarnings("HiddenField")
    public static void redirectLogFile(final PrintStream printStream) {
        assert printStream != null;

        ErrorHandling.logFile = printStream;
    }

    /**
     * Reset regist of all errors and warnings.
     */
    public static void reset() {
        errorCount = 0;
        warningCount = 0;
    }



    /**
     * Prints a message.
     *
     * @param text  the text to print.
     * @param color the color of the message.
     * @param type  the type of message.
     */
    protected static void printMessage(final String text,
                                       final String color,
                                       final String type) {
        logFile.printf("[%s%s%s] %s\n", color, type, RESET, text);
        logFile.flush();
    }

    /**
     * Prints a message.
     *
     * @param line  the line to what the message refers to.
     * @param text  the text to print.
     * @param color the color of the message.
     * @param type  the type of message.
     */
    protected static void printMessage(final int line,
                                       final String text,
                                       final String color,
                                       final String type) {
        logFile.printf("[%s%s%s at line %d] %s\n", color, type, RESET, line,
                text);
        logFile.flush();
    }

    /**
     * Prints a message.
     *
     * @param ctx   the context to what the message refers to.
     * @param text  the text to print.
     * @param color the color of the message.
     * @param type  the type of message.
     */
    protected static void printMessage(final ParserRuleContext ctx,
                                       final String text,
                                       final String color,
                                       final String type) {
        printMessage(ctx.getStart().getLine(), text, color, type);
    }
}

