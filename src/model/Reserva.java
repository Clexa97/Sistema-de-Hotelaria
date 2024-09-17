package model;

import java.util.Date;

public class Reserva {
    private int idReserva;
    private Cliente cliente;
    private Quarto quarto;
    private Date dataReserva;
    private Date dataFimReserva;

    public Reserva(Cliente cliente, Quarto quarto) {
    }

    public void confirmarReserva() {
        // Lógica para confirmar a reserva
    }

    public void cancelarReserva() {
        // Lógica para cancelar a reserva
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
}
