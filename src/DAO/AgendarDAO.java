package DAO;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Compromissos;
import util.BDConnect;

/**
 *
 * @author ritta
 */
public class AgendarDAO {

    public String registrarTarefas(Compromissos tarefa) {
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
}
