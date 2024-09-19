package model;

import exception.QuartoIndisponivelException;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Cliente extends Hospede{

    private List<Reserva> reservas;

    public Cliente(String nome, String cpf, Date dataNascimento, String contato) {
        super(nome, cpf, dataNascimento, contato);
        this.reservas = new ArrayList<>();
    }

    public void fazerReserva(Reserva reserva, List<Quarto> quartosDisponiveis) {
        if (quartosDisponiveis.contains(reserva.getQuarto())) {
            this.reservas.add(reserva);
            System.out.println("Reserva feita com sucesso!");
        } else {
            throw new QuartoIndisponivelException("O quarto solicitado não está disponível.");
        }
    }

    public void cancelarReserva(Reserva reserva) {
        if (reservas.remove(reserva)) {
            System.out.println("Reserva cancelada com sucesso!");
        } else {
            System.out.println("Reserva não encontrada.");
        }
    }

    public List<Reserva> getReservas() {
        return reservas;
    }

}
