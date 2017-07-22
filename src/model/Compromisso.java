package model;

//Classe compromisso
//Guarda as informações dos compromissos
public class Compromisso {
    //Atributos da classe

    private int codigoTarefa;
    private String nomeTarefa;
    private String descricaoTarefa;
    private int tipoTarefa;
    private String dataTarefa;
    private String horarioTarefa;
    private int prioridadeTarefa;
    private int codMateria;

    //===================================Getters e Setters===================================================
    public int getCodigoTarefa() {
        return codigoTarefa;
    }

    public void setCodigoTarefa(int codigoTarefa) {
        this.codigoTarefa = codigoTarefa;
    }

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

    public String getDataTarefa() {
        return dataTarefa;
    }

    public void setDataTarefa(String dataTarefa) {
        this.dataTarefa = dataTarefa;
    }

    public int getCodMateria() {
        return codMateria;
    }

    public void setCodMateria(int codMateria) {
        this.codMateria = codMateria;
    }

    public void setTipoTarefa(int tipoTarefa) {
        this.tipoTarefa = tipoTarefa;
    }

    public String getHorarioTarefa() {
        return horarioTarefa;
    }

    public void setHorarioTarefa(String horarioTarefa) {
        this.horarioTarefa = horarioTarefa;
    }

    public int getPrioridadeTarefa() {
        return prioridadeTarefa;
    }

    public void setPrioridadeTarefa(int prioridadeTarefa) {
        this.prioridadeTarefa = prioridadeTarefa;
    }
}
