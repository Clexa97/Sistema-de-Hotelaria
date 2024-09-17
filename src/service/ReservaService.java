package service;

import exception.QuartoIndisponivelException;
import model.Quarto;
import model.Reserva;

import java.util.ArrayList;
import java.util.List;

public class ReservaService {

    private List<Reserva> reservas;

    public ReservaService() {
        this.reservas = new ArrayList<>();
    }

    public void fazerReserva(Reserva reserva) throws QuartoIndisponivelException {
        Quarto quarto = reserva.getQuarto();

        if (quarto.isOcupado()) {
            throw new QuartoIndisponivelException("O quarto " + quarto.getNumero() + " está indisponível.");
        }
        reservas.add(reserva);
        quarto.setOcupado(true);
        System.out.println("Reserva feita com sucesso para o quarto " + quarto.getNumero() + "!");
    }

    public void cancelarReserva(int idReserva) {
        Reserva reservaCancelada = null;

        for (Reserva reserva : reservas) {
            if (reserva.getIdReserva() == idReserva) {
                reservaCancelada = reserva;
                break;
            }
        }
        if (reservaCancelada != null) {
            reservaCancelada.getQuarto().setOcupado(false);
            reservas.remove(reservaCancelada);
            System.out.println("Reserva cancelada para o quarto " + reservaCancelada.getQuarto().getNumero() + "!");
        } else {
            System.out.println("Reserva não encontrada.");
        }
    }
    public List<Reserva> listarReservas() {
        return reservas;
    }
}
