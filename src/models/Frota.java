package models;

import java.util.ArrayList;
import java.util.List;

public class Frota {
    private List<Veiculo> veiculos;

    public Frota() {
        veiculos = new ArrayList<>();
    }

    public void adicionarVeiculo(Veiculo veiculo) {
        veiculos.add(veiculo);
    }

    public Veiculo atribuirVeiculo(Encomenda encomenda) {
        for (Veiculo veiculo : veiculos) {
            if (veiculo.estaDisponivel() &&
                    veiculo.capacidadePeso >= encomenda.getPeso() &&
                    veiculo.capacidadeVolume >= encomenda.getVolume()) {

                if (encomenda.getPrioridade() == 1 && veiculo instanceof Motocicleta) {
                    return veiculo; // Alta prioridade, usar motocicleta se possível
                }
                if (!(veiculo instanceof Motocicleta)) {
                    return veiculo; // Outros veículos para encomendas maiores
                }
            }
        }
        return null; // Nenhum veículo disponível
    }
}