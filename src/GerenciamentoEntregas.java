import models.*;

public class GerenciamentoEntregas {

    public static void main(String[] args) {
        Frota frota = new Frota();

        // Adicionando veículos à frota
        frota.adicionarVeiculo(new Motocicleta("Moto 1"));
        frota.adicionarVeiculo(new Van("Van 1"));
        frota.adicionarVeiculo(new Caminhao("Caminhão 1"));

        // Criando encomendas
        Encomenda encomenda1 = new Encomenda(10, 0.5, 1, "Hoje"); // Prioridade alta
        Encomenda encomenda2 = new Encomenda(450, 4, 2, "Amanhã");
        Encomenda encomenda3 = new Encomenda(4800, 28, 3, "Em 3 dias");

        // Atribuindo veículos às encomendas
        Veiculo veiculo1 = frota.atribuirVeiculo(encomenda1);
        if (veiculo1 != null) {
            System.out.println("Encomenda 1 atribuída a: " + veiculo1.tipoVeiculo());
            veiculo1.iniciarRota();
        } else {
            System.out.println("Nenhum veículo disponível para encomenda 1.");
        }

        Veiculo veiculo2 = frota.atribuirVeiculo(encomenda2);
        if (veiculo2 != null) {
            System.out.println("Encomenda 2 atribuída a: " + veiculo2.tipoVeiculo());
            veiculo2.iniciarRota();
        } else {
            System.out.println("Nenhum veículo disponível para encomenda 2.");
        }

        Veiculo veiculo3 = frota.atribuirVeiculo(encomenda3);
        if (veiculo3 != null) {
            System.out.println("Encomenda 3 atribuída a: " + veiculo3.tipoVeiculo());
            veiculo3.iniciarRota();
        } else {
            System.out.println("Nenhum veículo disponível para encomenda 3.");
        }

        // Finalizando rotas
        veiculo1.finalizarRota();
        veiculo2.finalizarRota();
        veiculo3.finalizarRota();
    }
}