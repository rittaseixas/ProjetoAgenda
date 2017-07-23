package util;

import controller.MateriaController;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import model.Materia;

//Classe responsável por implementar o modelo da tabela que mostra as atividades próximas
//Utilizada no painel Comromissos
public class ModeloTabelaMaterias extends AbstractTableModel {
    //Definição dos atributos

    MateriaController materiaController;
    private ArrayList<Materia> materias;
    private final String[] colunas;

    public ModeloTabelaMaterias() {
        //O construtor necessita da data.

        //Instancia os atributos
        materiaController = new MateriaController();
        this.colunas = new String[]{"Código", "Matéria"};

        //Busca os compromissos para aquele dia
        materias = materiaController.buscarMaterias();
    }

    @Override
    public int getRowCount() {
        //Retorna o numero de linhas
        return materias.size();
    }

    @Override
    public int getColumnCount() {
        //Retorna o numero de colunas
        return colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        //Retorna os valores para exibir na tabela
        Materia materia = materias.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return materia.getCodMateria();
            case 1:
                return materia.getNomeMateria();
        }
        return null;
    }

    @Override
    public String getColumnName(int columnIndex) {
        //Retorna o nome da coluna
        return colunas[columnIndex];
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        //Define as células da tabela como não editáveis
        return false;
    }

}
