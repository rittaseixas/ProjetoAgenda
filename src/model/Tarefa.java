package model;

/**
 *
 * @author ritta
 */
public class Tarefa {
    private String nomeTarefa;
    private String descricaoTarefa;
    private int tipoTarefa;
    private String inicioTarefa;
    private int prioridadeTarefa;
    private Materia materia;

    public String getNomeTarefa() {
        return nomeTarefa;
    }

    public void setNomeTarefa(String nomeTarefa) {
        this.nomeTarefa = nomeTarefa;
    }

    public String getDescricaoTarefa() {
        return descricaoTarefa;
    }

    public void setDescricaoTarefa(String descricaoTarefa) {
        this.descricaoTarefa = descricaoTarefa;
    }

    public int getTipoTarefa() {
        return tipoTarefa;
    }

    public void setTipoTarefa(int tipoTarefa) {
        this.tipoTarefa = tipoTarefa;
    }

    public String getInicioTarefa() {
        return inicioTarefa;
    }

    public void setInicioTarefa(String inicioTarefa) {
        this.inicioTarefa = inicioTarefa;
    }

    public int getPrioridadeTarefa() {
        return prioridadeTarefa;
    }

    public void setPrioridadeTarefa(int prioridadeTarefa) {
        this.prioridadeTarefa = prioridadeTarefa;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }
    
    
}

