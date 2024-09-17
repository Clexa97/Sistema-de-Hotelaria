package controller;

import exception.QuartoIndisponivelException;
import model.Cliente;
import model.Quarto;
import model.Reserva;
import service.ReservaService;

public class ReservaController {
    private ReservaService reservaService;

    public ReservaController(ReservaService reservaService) {
        this.reservaService = reservaService;
    }

    public void fazerReserva(Cliente cliente, Quarto quarto) {
        Reserva reserva = new Reserva(cliente, quarto);
        try {
            reservaService.fazerReserva(reserva);
        } catch (QuartoIndisponivelException e) {
            System.out.println(e.getMessage());
        }
    }

    public void cancelarReserva(int idReserva) {
        reservaService.cancelarReserva(idReserva);
    }
}
