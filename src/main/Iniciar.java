package main;

import view.Home;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import static javax.swing.UIManager.getSystemLookAndFeelClassName;
import javax.swing.UnsupportedLookAndFeelException;

public class Iniciar {

    public static void main(String[] args) {
        try {
            // pega aparencia do SO
            UIManager.setLookAndFeel(getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Iniciar.class.getName()).log(Level.SEVERE, null, ex);
        }
        //Instancia e mostra a tela
        new Home().setVisible(true);

    }

}
