package models;

public class Van extends Veiculo {

    public Van(String modelo) {
        super(modelo, 500, 5); // Capacidade de 500kg e 5m³
    }

    @Override
    public String tipoVeiculo() {
        return "Van";
    }
}