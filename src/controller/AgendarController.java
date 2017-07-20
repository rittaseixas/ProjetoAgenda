package controller;

import DAO.AgendarDAO;
import model.Tarefa;

/**
 *
 * @author ritta
 */
public class AgendarController {
    AgendarDAO agendardao = new AgendarDAO();
    
    public void agendarTarefas(Tarefa tarefa){
        agendardao.registrarTarefas(tarefa);
    }
}
