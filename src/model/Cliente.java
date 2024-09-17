package model;

import exception.QuartoIndisponivelException;
import service.ReservaService;

import java.util.List;

public class Cliente extends Hospede{

    public Cliente(String nome, String cpf, String contato) {
        this.nome = nome;
        this.cpf = cpf;
        this.contato = contato;
    }
    public void fazerReserva(Reserva reserva, ReservaService reservaService) {
        try {
            reservaService.fazerReserva(reserva);
            System.out.println("Reserva feita com sucesso!");
        } catch (QuartoIndisponivelException e) {
            System.out.println("Erro ao fazer reserva: " + e.getMessage());
        }
    }

    public void cancelarReserva(Reserva reserva, ReservaService reservaService) {
        reservaService.cancelarReserva(reserva.getIdReserva());
        System.out.println("Reserva cancelada com sucesso!");
    }


}
