package teste;

import model.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Teste {

    public static List<Hospede> inicializarHospedes() {
        List<Hospede> hospedes = new ArrayList<>();

        Cliente cliente1 = new Cliente("Carlos Silva", "12345678910", new Date(1985, 5, 10), "carlos@email.com");
        Cliente cliente2 = new Cliente("Ana Souza", "98765432100", new Date(1990, 8, 22), "ana@email.com");

        hospedes.add(cliente1);
        hospedes.add(cliente2);

        return hospedes;
    }

    public static List<Quarto> inicializarQuartos() {
        List<Quarto> quartos = new ArrayList<>();


        Quarto quarto1 = new Quarto(101, CategoriaQuarto.SIMPLES, false);
        Quarto quarto2 = new Quarto(102, CategoriaQuarto.LUXO, false);


        quartos.add(quarto1);
        quartos.add(quarto2);

        return quartos;
    }

    public static List<Reserva> inicializarReservas(List<Hospede> hospedes, List<Quarto> quartos) {
        List<Reserva> reservas = new ArrayList<>();

        if (hospedes.get(0) instanceof Cliente) {
            Reserva reserva1 = new Reserva((Cliente) hospedes.get(0), quartos.get(0), new Date(), new Date());
            reserva1.confirmarReserva();
            reservas.add(reserva1);
        } else {
            System.out.println("O hóspede no índice 0 não é um Cliente. Não foi possível criar a reserva.");
        }

        if (hospedes.get(1) instanceof Cliente) {
            Reserva reserva2 = new Reserva((Cliente) hospedes.get(1), quartos.get(1), new Date(), new Date());
            reserva2.confirmarReserva();
            reservas.add(reserva2);
        } else {
            System.out.println("O hóspede no índice 1 não é um Cliente. Não foi possível criar a reserva.");
        }

        return reservas;
    }

    public static List<Servico> inicializarServicos() {
        List<Servico> servicos = new ArrayList<>();


        Servico servico1 = new Servico(TipoServico.LAVANDERIA, 30.0);
        Servico servico2 = new Servico(TipoServico.SERVICO_QUARTO, 20.0);


        servicos.add(servico1);
        servicos.add(servico2);

        return servicos;
    }

    public static List<Item> inicializarItens() {
        List<Item> itens = new ArrayList<>();


        Item item1 = new Item("Refrigerante", 5.0, 1);
        Item item2 = new Item("Água", 2.0, 1);


        itens.add(item1);
        itens.add(item2);

        return itens;
    }
}
