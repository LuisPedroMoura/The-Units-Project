package units.internal.errorhandling;

import java.awt.Color;
import java.awt.Container;
import java.util.Collections;
import java.util.List;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

public final class DialogErrorListener extends BaseErrorListener {

    @Override
    public void syntaxError(final Recognizer<?, ?> recognizer,
                            final Object offendingSymbol,
                            final int line,
                            final int charPositionInLine,
                            final String msg,
                            final RecognitionException e) {
        final Parser p = ((Parser) recognizer);
        final List<String> stack = p.getRuleInvocationStack();
        Collections.reverse(stack);
        final StringBuilder buf = new StringBuilder();
        buf.append("rule stack: " + stack + " ");
        buf.append("line " + line + ":" + charPositionInLine + " at "
                + offendingSymbol + ": " + msg);
        final JDialog dialog = new JDialog();
        final Container contentPane = dialog.getContentPane();
        contentPane.add(new JLabel(buf.toString()));
        contentPane.setBackground(Color.white);
        dialog.setTitle("Syntax error");
        dialog.pack();
        dialog.setLocationRelativeTo(null);
        dialog.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        dialog.setVisible(true);
    }
}

