package models;

public class Caminhao extends Veiculo {

    public Caminhao(String modelo) {
        super(modelo, 5000, 30); // Capacidade de 5000kg e 30m³
    }

    @Override
    public String tipoVeiculo() {
        return "Caminhão";
    }
}