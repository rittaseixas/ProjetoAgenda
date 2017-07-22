package util;

import DAO.BuscarInfoDAO;
import controller.CompromissosController;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import model.Compromisso;

//Classe responsável por implementar o modelo da tabela que mostra as atividades do dia determinado pelo usuário
//Utilizada no painel Buscar
public class ModeloTabelaDiaSelecionado extends AbstractTableModel {

    //Definição dos atributos
    private CompromissosController compromissosController;
    private BuscarInfoDAO buscarInfo;
    private ArrayList<Compromisso> compromissos;
    private final String[] colunas;

    public ModeloTabelaDiaSelecionado(String data) {
        //O construtor necessita da data.

        //Instancia os atributos
        buscarInfo = new BuscarInfoDAO();
        compromissosController = new CompromissosController();
        this.colunas = new String[]{"Compromisso", "Descrição", "Tipo", "Matéria", "Horário", "Prioridade", "Número"};

        //Busca os compromissos para aquele dia
        compromissos = compromissosController.buscarTarefasDoDia(data);

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
                return compromisso.getDescricaoTarefa();
            case 2:
                return buscarInfo.getTipoTarefaByCod(compromisso.getTipoTarefa());
            case 3:
                return buscarInfo.getMateriaByCod(compromisso.getCodMateria());
            case 4:
                return compromisso.getHorarioTarefa();
            case 5:
                return buscarInfo.getPrioridadeByCod(compromisso.getPrioridadeTarefa());
            case 6:
                return compromisso.getCodigoTarefa();
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
