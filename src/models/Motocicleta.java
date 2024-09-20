package models;

public class Motocicleta extends Veiculo {

    public Motocicleta(String modelo) {
        super(modelo, 30, 1); // Capacidade de 30kg e 1m³
    }

    @Override
    public String tipoVeiculo() {
        return "Motocicleta";
    }
}