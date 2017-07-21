/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import controller.CompromissosController;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import model.Compromissos;

/**
 *
 * @author lucas
 */
public class ModeloTabelaDiaSelecionado extends AbstractTableModel {
    
    CompromissosController compromissosController;
    private ArrayList<Compromissos> compromissos;
    private final String[] colunas;
    
    public ModeloTabelaDiaSelecionado(String data) {
        compromissosController = new CompromissosController();
        this.colunas = new String[]{"Compromisso","Descrição","Tipo","Matéria", "Horário", "Prioridade"};
        compromissos = compromissosController.buscarTarefasDoDia(data);
    }
    
    @Override
    public int getRowCount() {
        return compromissos.size();
    }
    
    @Override
    public int getColumnCount() {
        return colunas.length;
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Compromissos compromisso = compromissos.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return compromisso.getNomeTarefa();
            case 1:
                return compromisso.getDescricaoTarefa();
            case 2:
                return BuscarPK.buscarTipoTarefa(compromisso.getTipoTarefa());
            case 3:
                return BuscarPK.buscarNomeMateria(compromisso.getCodMateria());
            case 4:
                 return compromisso.getHorarioTarefa();
            case 5:
                return BuscarPK.buscarPrioridade(compromisso.getPrioridadeTarefa());
        }
        return null;
    }
    
    @Override
    public String getColumnName(int columnIndex) {
        return colunas[columnIndex];
    }
    
    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }
    
}
