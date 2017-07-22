package util;

import controller.CompromissosController;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import model.Compromisso;

//Classe responsável por implementar o modelo da tabela que mostra as atividades próximas
//Utilizada no painel Comromissos
public class ModeloTabelaProximos extends AbstractTableModel {
    //Definição dos atributos

    CompromissosController compromissosController;
    private ArrayList<Compromisso> compromissos;
    private final String[] colunas;

    public ModeloTabelaProximos(String data) {
        //O construtor necessita da data.

        //Instancia os atributos
        compromissosController = new CompromissosController();
        this.colunas = new String[]{"Compromisso", "Horário"};

        //Busca os compromissos para aquele dia
        compromissos = compromissosController.buscarTarefasProximas(data);
    }

    @Override
    public int getRowCount() {
        //Retorna o numero de linhas
        return compromissos.size();
    }

    @Override
    public int getColumnCount() {
        //Retorna o numero de colunas
        return colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        //Retorna os valores para exibir na tabela
        Compromisso compromisso = compromissos.get(rowIndex);
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
        //Retorna o nome da coluna
        return colunas[columnIndex];
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        //Define as células da tabela como não editáveis
        return false;
    }

}
