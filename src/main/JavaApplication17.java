
package main;

import view.Home;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import static javax.swing.UIManager.getSystemLookAndFeelClassName;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author lucas
 */
public class JavaApplication17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
             // pega aparencia do SO
            UIManager.setLookAndFeel(getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            Logger.getLogger(JavaApplication17.class.getName()).log(Level.SEVERE, null, ex);
        }

        new Home().setVisible(true);
    }

}
