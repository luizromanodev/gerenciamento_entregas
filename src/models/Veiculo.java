package models;

public abstract class Veiculo {
    protected String modelo;
    protected double capacidadePeso;
    protected double capacidadeVolume;
    protected boolean emManutencao;
    protected boolean emRota;

    public Veiculo(String modelo, double capacidadePeso, double capacidadeVolume) {
        this.modelo = modelo;
        this.capacidadePeso = capacidadePeso;
        this.capacidadeVolume = capacidadeVolume;
        this.emManutencao = false;
        this.emRota = false;
    }

    public boolean estaDisponivel() {
        return !emManutencao && !emRota;
    }

    public void iniciarRota() {
        if (estaDisponivel()) {
            emRota = true;
        }
    }

    public void finalizarRota() {
        emRota = false;
    }

    public void enviarParaManutencao() {
        emManutencao = true;
    }

    public void retirarDeManutencao() {
        emManutencao = false;
    }

    public abstract String tipoVeiculo();
}