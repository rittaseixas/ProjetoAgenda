/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAO.MateriaDAO;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Materia;

/**
 *
 * @author lucas
 */
public class MateriaController {

    MateriaDAO materiaDAO;

    public void cadastrarMateria(Materia materia) {
        materiaDAO = new MateriaDAO();
        String status = materiaDAO.cadastrarMateria(materia);
        switch (status) {
            case "já cadastrada":
                JOptionPane.showMessageDialog(null, "A matéria " + materia.getNomeMateria() + " já está cadastrada!");
                break;
            case "sucesso":
                JOptionPane.showMessageDialog(null, "A matéria " + materia.getNomeMateria() + " foi cadastrada com sucesso!");
                break;
            case "erro":
                JOptionPane.showMessageDialog(null, "Erro ao cadastrar a matéria");
                break;
        }
    }

    public ArrayList<Materia> buscarMaterias() {
        materiaDAO = new MateriaDAO();
        ArrayList<Materia> materias = materiaDAO.buscarMaterias();
        return materias;
    }

    public String editarMateria(Materia materia) {
        materiaDAO = new MateriaDAO();
        String status = materiaDAO.editarMateria(materia);
        if (status.equals("sucesso")) {
            JOptionPane.showMessageDialog(null, "Matéria editada com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Erro ao editar a matéria");
        }
        return status;
    }

    public String excluirMateria(Materia materia) {
        materiaDAO = new MateriaDAO();
        String status = materiaDAO.excluirMateria(materia);
           if (status.equals("sucesso")) {
            JOptionPane.showMessageDialog(null, "Matéria excluída com sucesso");
        } else {
            //Caso o registro não tenha sido bem sucedido, mostra uma mensagem de erro ao usuário
            JOptionPane.showMessageDialog(null, "Erro ao excluir a matéria");
        }
        return status;
    }
}
