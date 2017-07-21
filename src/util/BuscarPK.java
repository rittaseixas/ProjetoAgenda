/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lucas
 */
public class BuscarPK {

    static PreparedStatement pst;

    public static int buscarCodMateria(String materia) {
        try {
            pst = BDConnect.getConnection().prepareStatement("SELECT cod_materia FROM MATERIA WHERE NOME = ?");
            pst.setString(1, materia);
            ResultSet rs = pst.executeQuery();
            if(rs.next()){
               return rs.getInt("cod_materia");
            }
        } catch (SQLException ex) {
            Logger.getLogger(BuscarPK.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }
    public static int buscarCodPrioridade(String prioridade){
         try {
            pst = BDConnect.getConnection().prepareStatement("SELECT cod_prioridade FROM prioridade WHERE descricao = ?");
            pst.setString(1, prioridade);
            ResultSet rs = pst.executeQuery();
            if(rs.next()){
               return rs.getInt("cod_prioridade");
            }
        } catch (SQLException ex) {
            Logger.getLogger(BuscarPK.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }
    public static int buscarCodTipoTarefa(String tipoTarefa){
        try {
            pst = BDConnect.getConnection().prepareStatement("SELECT cod_tipo FROM tipo_atividade WHERE descricao = ?");
            pst.setString(1, tipoTarefa);
            ResultSet rs = pst.executeQuery();
            if(rs.next()){
               return rs.getInt("cod_tipo");
            }
        } catch (SQLException ex) {
            Logger.getLogger(BuscarPK.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }
}
