/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

/**
 *
 * @author lucasR
 */
//Classe para controlar o tamanho do texto digitado.
public class MaximumSize extends PlainDocument {

    private final int maxChar = 250;

    @Override
    public void insertString(int offs, String str, AttributeSet a) throws BadLocationException {
        if (str != null && (str.length() + getLength() < maxChar)) {
            super.insertString(offs, str, a);
        }
    }
}
