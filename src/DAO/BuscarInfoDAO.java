package DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import util.BDConnect;

//Classe responsável por buscar as PK e alguns atributos das tabelas.
public class BuscarInfoDAO {

    PreparedStatement pst;

    //Busca o código da matéria através do nome
    public int getCodMateriaByName(String materia) {
        try {
            pst = BDConnect.getConnection().prepareStatement("SELECT cod_materia FROM MATERIA WHERE NOME = ?");
            pst.setString(1, materia);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                return rs.getInt("cod_materia");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao consultar");
        }
        return 0;
    }

    //Buca o codigo da prioridade pelo nome
    public int getCodPrioridadeByName(String prioridade) {
        try {
            pst = BDConnect.getConnection().prepareStatement("SELECT cod_prioridade FROM prioridade WHERE descricao = ?");
            pst.setString(1, prioridade);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                return rs.getInt("cod_prioridade");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao consultar");
        }
        return 0;
    }

    //Busca o codigo do tipo de tarefa pelo nome
    public int getCodTipoTarefaByName(String tipoTarefa) {
        try {
            pst = BDConnect.getConnection().prepareStatement("SELECT cod_tipo FROM tipo_atividade WHERE descricao = ?");
            pst.setString(1, tipoTarefa);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                return rs.getInt("cod_tipo");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao consultar");
        }
        return 0;
    }

    //Busca o tipo de tarefa pelo codigo
    public String getTipoTarefaByCod(int tipoTarefa) {
        try {
            pst = BDConnect.getConnection().prepareStatement("SELECT descricao FROM tipo_atividade WHERE cod_tipo = ?");
            pst.setInt(1, tipoTarefa);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                return rs.getString("descricao");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao consultar");
        }
        return null;
    }

    //Busca o nome da materia pelo codigo
    public String getMateriaByCod(int codMateria) {
        try {
            pst = BDConnect.getConnection().prepareStatement("SELECT nome FROM materia WHERE cod_materia = ?");
            pst.setInt(1, codMateria);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                return rs.getString("nome");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao consultar");
        }
        return null;
    }

    //Busca a prioridade pelo codigo
    public String getPrioridadeByCod(int codPrioridade) {
        try {
            pst = BDConnect.getConnection().prepareStatement("SELECT descricao FROM prioridade WHERE cod_prioridade = ?");
            pst.setInt(1, codPrioridade);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                return rs.getString("descricao");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao consultar");
        }
        return null;
    }

    //Busca todas as materias cadastradas
    public ArrayList<String> getMateriasCadastradas() {
        ArrayList<String> materias = new ArrayList<>();
        try {
            pst = BDConnect.getConnection().prepareStatement("Select nome from materia order by nome");
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                materias.add(rs.getString("nome"));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao consultar");
        }
        return materias;
    }

    //Busca os tipos de tarefas cadastrados
    public ArrayList<String> getTiposCadastrados() {
        ArrayList<String> tiposAtividade = new ArrayList<>();
        try {
            pst = BDConnect.getConnection().prepareStatement("Select descricao from tipo_atividade");
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                tiposAtividade.add(rs.getString("descricao"));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao consultar");
        }
        return tiposAtividade;
    }

    //Busca os tipos de prioridades cadastrados
    public ArrayList<String> getPrioridadesCadstradas() {
        ArrayList<String> prioridades = new ArrayList<>();
        try {
            pst = BDConnect.getConnection().prepareStatement("Select descricao from prioridade");
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                prioridades.add(rs.getString("descricao"));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao consultar");
        }
        return prioridades;
    }
}
