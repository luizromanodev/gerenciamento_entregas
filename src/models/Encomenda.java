package models;

public class Encomenda {
    private double peso;
    private double volume;
    private int prioridade; // 1 para alta, 2 para média, 3 para baixa
    private String prazo;

    public Encomenda(double peso, double volume, int prioridade, String prazo) {
        this.peso = peso;
        this.volume = volume;
        this.prioridade = prioridade;
        this.prazo = prazo;
    }

    public double getPeso() {
        return peso;
    }

    public double getVolume() {
        return volume;
    }

    public int getPrioridade() {
        return prioridade;
    }

    public String getPrazo() {
        return prazo;
    }
}