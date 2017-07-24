/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Materia;
import util.BDConnect;

/**
 *
 * @author lucas
 */
public class MateriaDAO {

    PreparedStatement pst;

    public String cadastrarMateria(Materia materia) {
        try {
            pst = BDConnect.getConnection().prepareStatement("SELECT * FROM materia WHERE nome = ?");
            pst.setString(1, materia.getNomeMateria());
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                return "já cadastrada";
            } else {
                pst = BDConnect.getConnection().prepareStatement("INSERT INTO materia values(null, ?)");
                pst.setString(1, materia.getNomeMateria());
                pst.execute();
                return "sucesso";
            }
        } catch (SQLException ex) {
            return "erro";
        }
    }

    public ArrayList<Materia> buscarMaterias() {
        ArrayList<Materia> materias = new ArrayList<>();
        try {
            pst = BDConnect.getConnection().prepareStatement("Select * from materia order by nome");
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                Materia materia = new Materia();
                materia.setCodMateria(rs.getInt("cod_materia"));
                materia.setNomeMateria(rs.getString("nome"));
                materias.add(materia);
            }
        } catch (SQLException ex) {
            Logger.getLogger(MateriaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return materias;
    }

    public String editarMateria(Materia materia) {
        try {
            pst = BDConnect.getConnection().prepareStatement("update materia set nome = ? where cod_materia = ?");
            pst.setString(1, materia.getNomeMateria());
            pst.setInt(2, materia.getCodMateria());
            pst.execute();
            return "sucesso";
        } catch (SQLException ex) {
            return "erro";
        }

    }

    public String excluirMateria(Materia materia) {
         try {
            PreparedStatement pst = BDConnect.getConnection().prepareStatement("DELETE FROM materia WHERE cod_materia = ?");
            pst.setInt(1, materia.getCodMateria());
            pst.execute();
            return "sucesso";
        } catch (SQLException ex) {

        }
        return "erro";
    }

}
