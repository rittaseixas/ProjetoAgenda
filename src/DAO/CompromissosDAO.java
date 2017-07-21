package DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Compromissos;
import util.BDConnect;

/**
 *
 * @author ritta
 */
public class CompromissosDAO {

    public ArrayList<Compromissos> proximasTarefas(String data) {
        ArrayList<Compromissos> tarefas = new ArrayList<>();
        try {
            PreparedStatement pst = BDConnect.getConnection().prepareStatement("SELECT * FROM tarefa WHERE dia = ? order by horario");
            pst.setString(1, data);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                Compromissos compromisso = new Compromissos();
                compromisso.setNomeTarefa(rs.getString("nome"));
                compromisso.setHorarioTarefa(rs.getString("horario"));
                tarefas.add(compromisso);
            }
        } catch (SQLException ex) {
            Logger.getLogger(CompromissosDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return tarefas;
    }

    public ArrayList<Compromissos> tarefasDoDia(String data) {
        ArrayList<Compromissos> tarefas = new ArrayList<>();
        try {
            PreparedStatement pst = BDConnect.getConnection().prepareStatement("SELECT * FROM tarefa where dia = ?");
            pst.setString(1, data);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                Compromissos compromisso = new Compromissos();
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
}
