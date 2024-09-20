import model.*;
import teste.Teste;

import java.util.List;

import static teste.Teste.inicializarHospedes;
import static teste.Teste.inicializarQuartos;

public class Main {
    public static void main(String[] args) {

        List<Hospede> hospedes = inicializarHospedes();
        List<Quarto> quartos = inicializarQuartos();
        List<Reserva> reservas = Teste.inicializarReservas(hospedes, quartos);
        List<Servico> servicos = Teste.inicializarServicos();
        List<Item> itens = Teste.inicializarItens();

        if (hospedes.isEmpty() || quartos.isEmpty() || reservas.isEmpty() || servicos.isEmpty() || itens.isEmpty()) {
            System.out.println("Erro: Listas de hóspedes, quartos, reservas, serviços ou itens estão vazias.");
            return;
        }

        System.out.println("Teste: Solicitação de Serviços");
        if (hospedes.size() > 1 && servicos.size() > 1) {
            hospedes.get(0).solicitarServico(servicos.get(0));
            hospedes.get(1).solicitarServico(servicos.get(1));
        } else {
            System.out.println("Não há hóspedes ou serviços suficientes para o teste.");
        }

        System.out.println("\nTeste: Adicionar Consumo");
        if (hospedes.size() > 0 && itens.size() > 1) {
            hospedes.get(0).adicionarConsumo(itens.get(0));
            hospedes.get(0).adicionarConsumo(itens.get(1));
        } else {
            System.out.println("Não há hóspedes ou itens suficientes para o teste.");
        }

        System.out.println("\nCálculo total de consumo para " + hospedes.get(0).getNome() + ": R$ " + hospedes.get(0).calcularTotalConsumo());
        System.out.println("Cálculo total de serviços para " + hospedes.get(0).getNome() + ": R$ " + hospedes.get(0).calcularTotalServicos());

        System.out.println("\nTeste: Reservas");
        if (!reservas.isEmpty()) {
            reservas.get(0).confirmarReserva();

            if (reservas.size() > 1) {
                reservas.get(1).cancelarReserva();
            }
        } else {
            System.out.println("Não há reservas suficientes para o teste.");
        }
    }
}