package controller;

import DAO.CompromissosDAO;
import java.util.ArrayList;
import model.Compromissos;

/**
 *
 * @author ritta
 */
public class CompromissosController {

    CompromissosDAO buscardao = new CompromissosDAO();

    public ArrayList<Compromissos> buscarTarefa(String data) {
        ArrayList<Compromissos> listaTarefa = buscardao.listaTarefas(data);
        return listaTarefa;
    }
}
