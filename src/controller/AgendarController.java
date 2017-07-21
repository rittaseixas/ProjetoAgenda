package controller;

import DAO.AgendarDAO;
import javax.swing.JOptionPane;
import model.Compromissos;

/**
 *
 * @author ritta
 */
public class AgendarController {

    AgendarDAO agendardao = new AgendarDAO();

    public void agendarTarefas(Compromissos tarefa) {
        String status = agendardao.registrarTarefas(tarefa);
        if (status.equals("sucesso")) {
            JOptionPane.showMessageDialog(null, "Tarefa cadastrada com sucesso");
        } else {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar a tarefa");
        }
    }
}
