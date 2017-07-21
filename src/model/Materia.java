package model;

//Classe Matéria
//As matérias de cada compromisso do usuário
public class Materia {

    //Declaração dos atributos
    private int codMateria;
    private String nomeMateria;

    //========================Getters e Setters=================================
    public int getCodMateria() {
        return codMateria;
    }

    public void setCodMateria(int codMateria) {
        this.codMateria = codMateria;
    }

    public String getNomeMateria() {
        return nomeMateria;
    }

    public void setNomeMateria(String nomeMateria) {
        this.nomeMateria = nomeMateria;
    }
}
