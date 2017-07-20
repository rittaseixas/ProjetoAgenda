package controller;

import DAO.NotasDAO;
import java.util.ArrayList;
import model.Nota;

/**
 *
 * @author ritta
 */
public class NotasController {
    NotasDAO notasdao = new NotasDAO();
    
    public void registrarNotas(Nota nota){
        notasdao.cadastrarNota(nota);
    }

    public ArrayList<Nota> listarNotas(){
        ArrayList<Nota> notas = notasdao.bucarNota();
        return notas;
    }
}
