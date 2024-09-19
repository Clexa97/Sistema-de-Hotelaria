package model;

import java.util.Date;

public class Reserva {
    private int idReserva;
    private Cliente cliente;
    private Quarto quarto;
    private Date dataReserva;
    private Date dataFimReserva;
    private boolean confirmada;
    private boolean cancelada;

    public Reserva(Cliente cliente, Quarto quarto) {
    }

    public Reserva(Cliente cliente, Quarto quarto, Date dataReserva, Date dataFimReserva) {
        this.cliente = cliente;
        this.quarto = quarto;
        this.dataReserva = dataReserva;
        this.dataFimReserva = dataFimReserva;
        this.confirmada = false;
        this.cancelada = false;
    }

    public void confirmarReserva() {

        if (cancelada) {
            System.out.println("Não é possível confirmar uma reserva cancelada.");
            return;
        }

        if (confirmada) {
            System.out.println("A reserva já está confirmada.");
        } else {
            confirmada = true;
            System.out.println("Reserva confirmada com sucesso para o quarto " + quarto.getNumero());
        }
    }

    public void cancelarReserva() {

        if (confirmada && !cancelada) {
            cancelada = true;
            confirmada = false;
            System.out.println("Reserva cancelada com sucesso.");
        } else if (cancelada) {
            System.out.println("A reserva já foi cancelada anteriormente.");
        } else {
            System.out.println("A reserva não pode ser cancelada pois não foi confirmada.");
        }
    }

    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Quarto getQuarto() {
        return quarto;
    }

    public void setQuarto(Quarto quarto) {
        this.quarto = quarto;
    }

    public Date getDataReserva() {
        return dataReserva;
    }

    public void setDataReserva(Date dataReserva) {
        this.dataReserva = dataReserva;
    }

    public Date getDataFimReserva() {
        return dataFimReserva;
    }

    public void setDataFimReserva(Date dataFimReserva) {
        this.dataFimReserva = dataFimReserva;
    }

    public boolean isConfirmada() {
        return confirmada;
    }

    public void setConfirmada(boolean confirmada) {
        this.confirmada = confirmada;
    }

    public boolean isCancelada() {
        return cancelada;
    }

    public void setCancelada(boolean cancelada) {
        this.cancelada = cancelada;
    }
}
