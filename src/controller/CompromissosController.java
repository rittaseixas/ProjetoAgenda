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
        ArrayList<Compromissos> listaTarefa = buscardao.proximasTarefas(data);
        return listaTarefa;
    }

    public ArrayList<Compromissos> buscarTarefasDoDia(String data) {
        ArrayList<Compromissos> listaTarefa = buscardao.tarefasDoDia(data);
        return listaTarefa;
    }
}
