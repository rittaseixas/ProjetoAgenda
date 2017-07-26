package controller;

import DAO.CompromissosDAO;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Compromisso;

//Classe responsável por intermediar a view com o DAO para fazer consultas e inserções das tarefas registradas
public class CompromissosController {
    //Declaração dos atributos

    CompromissosDAO compromissosDAO;

    public ArrayList<Compromisso> buscarTarefasProximas(String data) {
        compromissosDAO = new CompromissosDAO();
        //Controller que lista as tarefas dos proximos dias

        //Envia os dados para o DAO fazer a consulta no banco e salva os dados em uma lista
        ArrayList<Compromisso> listaTarefas = compromissosDAO.proximasTarefas(data);

        //retorna a lista
        return listaTarefas;
    }

    public ArrayList<Compromisso> buscarTarefasDoDia(String data) {
        //Controller que lista as tarefas do dia especificado

        compromissosDAO = new CompromissosDAO();

        //Envia os dados para o DAO fazer a consulta no banco e salva os dados em uma lista
        ArrayList<Compromisso> listaTarefas = compromissosDAO.tarefasDoDia(data);

        //retorna a lista
        return listaTarefas;
    }

    public void agendarTarefas(Compromisso tarefa) {
        //Controller que cadastra as tarefas no banco

        compromissosDAO = new CompromissosDAO();

        //Envia os dados para serem salvos no banco e recebe uma mensagem
        String status = compromissosDAO.registrarTarefas(tarefa);

        //Se a mensagem for "sucesso", uma mensagem é mostrada ao usuário informando que a tarefa foi registrada
        if (status.equals("sucesso")) {
            JOptionPane.showMessageDialog(null, "Tarefa cadastrada com sucesso");
        } else {
            //Caso o registro não tenha sido bem sucedido, mostra uma mensagem de erro ao usuário
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar a tarefa");
        }
    }

    public Compromisso getTarefa(int cod) {
        compromissosDAO = new CompromissosDAO();
        Compromisso tarefa = compromissosDAO.getTarefa(cod);
        return tarefa;
    }

    public String atualizarTarefa(Compromisso tarefa) {
        compromissosDAO = new CompromissosDAO();
        String status = compromissosDAO.atualizarTarefa(tarefa);
        if (status.equals("sucesso")) {
            JOptionPane.showMessageDialog(null, "Tarefa atualizada com sucesso");
        } else {
            //Caso o registro não tenha sido bem sucedido, mostra uma mensagem de erro ao usuário
            JOptionPane.showMessageDialog(null, "Erro ao atualizar a tarefa");
        }
        return status;
    }

    public String excluirTarefa(Compromisso tarefa) {
        compromissosDAO = new CompromissosDAO();
        String status = compromissosDAO.excluirTarefa(tarefa);
        if (status.equals("sucesso")) {
            JOptionPane.showMessageDialog(null, "Tarefa excluída com sucesso");
        } else {
            //Caso o registro não tenha sido bem sucedido, mostra uma mensagem de erro ao usuário
            JOptionPane.showMessageDialog(null, "Erro ao excluir a tarefa");
        }
        return status;
    }
}
