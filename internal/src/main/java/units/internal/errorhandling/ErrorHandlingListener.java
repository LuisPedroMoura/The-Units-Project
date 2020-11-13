package units.internal.errorhandling;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

/**
 * Error handling ANTLR listener.
 *
 * <p>After parser object creation add the following instructions:
 * <ul>
 * <li>{@code parser.removeErrorListeners();}</li>
 * <li>{@code parser.addErrorListener(new ErrorHandlingListener());}</li>
 * </ul></p>
 *
 * @author  Miguel Oliveira e Silva (mos@ua.pt)
 * @version 1.0
 * @since   2016-05-19
 */
public final class ErrorHandlingListener extends BaseErrorListener {
    @Override
    public void syntaxError(final Recognizer<?, ?> recognizer,
                            final Object offendingSymbol,
                            final int line,
                            final int charPositionInLine,
                            final String msg,
                            final RecognitionException e) {
        ErrorHandling.printError(line, msg);
    }
}

