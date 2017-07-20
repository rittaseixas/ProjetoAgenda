package controller;

import DAO.BuscarDAO;
import java.util.ArrayList;
import model.Tarefa;

/**
 *
 * @author ritta
 */
public class BuscarController {

    BuscarDAO buscardao = new BuscarDAO();

    public ArrayList<Tarefa> buscarTarefa(String data) {
        ArrayList<Tarefa> listaTarefa = buscardao.listaTarefas(data);
        return listaTarefa;
    }
}
