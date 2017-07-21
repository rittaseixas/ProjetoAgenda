package util;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

//Classe para controlar o tamanho do texto digitado.
public class MaximumSize extends PlainDocument {

    private static final int MAX_CHAR = 250; //Máximo de caracteres disponíveis.

    @Override
    public void insertString(int offs, String str, AttributeSet a) throws BadLocationException {
        if (str != null && (str.length() + getLength() < MAX_CHAR)) {
            super.insertString(offs, str, a);
        }
    }
}
