package DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Compromisso;
import util.BDConnect;

//Classe responsável por salvar e buscar os compromissos
public class CompromissosDAO {

    public ArrayList<Compromisso> proximasTarefas(String data) {
        //Método que busca os compromissos nos próximos dias
        ArrayList<Compromisso> tarefas = new ArrayList<>();
        try {
            PreparedStatement pst = BDConnect.getConnection().prepareStatement("SELECT * FROM tarefa WHERE dia = ? order by horario");
            pst.setString(1, data);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                Compromisso compromisso = new Compromisso();
                compromisso.setNomeTarefa(rs.getString("nome"));
                compromisso.setHorarioTarefa(rs.getString("horario"));
                tarefas.add(compromisso);
            }
        } catch (SQLException ex) {
            Logger.getLogger(CompromissosDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return tarefas;
    }

    public ArrayList<Compromisso> tarefasDoDia(String data) {
        //Método que busca os compromissos do dia determinado
        ArrayList<Compromisso> tarefas = new ArrayList<>();
        try {
            PreparedStatement pst = BDConnect.getConnection().prepareStatement("SELECT * FROM tarefa where dia = ?");
            pst.setString(1, data);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                Compromisso compromisso = new Compromisso();
                compromisso.setCodigoTarefa(rs.getInt("cod_tarefa"));
                compromisso.setNomeTarefa(rs.getString("nome"));
                compromisso.setDescricaoTarefa(rs.getString("descricao"));
                compromisso.setDataTarefa(rs.getString("dia"));
                compromisso.setHorarioTarefa(rs.getString("horario"));
                compromisso.setCodMateria(rs.getInt("materia_cod_materia"));
                compromisso.setPrioridadeTarefa(rs.getInt("prioridade_cod_prioridade"));
                compromisso.setTipoTarefa(rs.getInt("tipo_atividade_cod_tipo"));
                tarefas.add(compromisso);
            }
        } catch (SQLException ex) {
            Logger.getLogger(CompromissosDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return tarefas;
    }

    public String registrarTarefas(Compromisso tarefa) {
        //Método que registra as tarefas no banco
        try {
            PreparedStatement pst = BDConnect.getConnection().prepareStatement("INSERT INTO tarefa VALUES (null, ?, ?, ?, ?, ?, ?, ?)");
            pst.setString(1, tarefa.getNomeTarefa());
            pst.setString(2, tarefa.getDescricaoTarefa());
            pst.setString(3, tarefa.getDataTarefa());
            pst.setString(4, tarefa.getHorarioTarefa());
            pst.setInt(5, tarefa.getCodMateria());
            pst.setInt(6, tarefa.getPrioridadeTarefa());
            pst.setInt(7, tarefa.getTipoTarefa());
            pst.execute();
            return "sucesso";
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return "erro";
    }

    public Compromisso getTarefa(int cod) {
        //Método que busca os compromissos nos próximos dias
        Compromisso compromisso = new Compromisso();
        try {
            PreparedStatement pst = BDConnect.getConnection().prepareStatement("SELECT * FROM tarefa WHERE cod_tarefa = ?");
            pst.setInt(1, cod);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                compromisso.setCodigoTarefa(rs.getInt("cod_tarefa"));
                compromisso.setNomeTarefa(rs.getString("nome"));
                compromisso.setDescricaoTarefa(rs.getString("descricao"));
                compromisso.setHorarioTarefa(rs.getString("horario"));
                compromisso.setDataTarefa(rs.getString("dia"));
                compromisso.setHorarioTarefa(rs.getString("horario"));
                compromisso.setCodMateria(rs.getInt("materia_cod_materia"));
                compromisso.setPrioridadeTarefa(rs.getInt("prioridade_cod_prioridade"));
                compromisso.setTipoTarefa(rs.getInt("tipo_atividade_cod_tipo"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(CompromissosDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return compromisso;
    }

    public String atualizarTarefa(Compromisso tarefa) {
        try {
            PreparedStatement pst = BDConnect.getConnection().prepareStatement("UPDATE tarefa SET nome = ?, descricao = ?, "
                    + "dia = ?, horario = ?, materia_cod_materia = ?, prioridade_cod_prioridade = ?, tipo_atividade_cod_tipo = ? "
                    + "where cod_tarefa = ?");
            pst.setString(1, tarefa.getNomeTarefa());
            pst.setString(2, tarefa.getDescricaoTarefa());
            pst.setString(3, tarefa.getDataTarefa());
            pst.setString(4, tarefa.getHorarioTarefa());
            pst.setInt(5, tarefa.getCodMateria());
            pst.setInt(6, tarefa.getPrioridadeTarefa());
            pst.setInt(7, tarefa.getTipoTarefa());
            pst.setInt(8, tarefa.getCodigoTarefa());
            pst.execute();
            return "sucesso";
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return "erro";
    }

}
