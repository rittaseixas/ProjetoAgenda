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
public class ModeloTabelaProximos extends AbstractTableModel {
    
    CompromissosController compromissosController;
    private ArrayList<Compromissos> compromissos;
    private final String[] colunas;
    
    public ModeloTabelaProximos(String data) {
        compromissosController = new CompromissosController();
//        this.compromissos = compromissosController.buscarTarefa()
        this.colunas = new String[]{"Compromisso", "Horário"};
        compromissos = compromissosController.buscarTarefa(data);
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
                return compromisso.getHorarioTarefa();
            
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
