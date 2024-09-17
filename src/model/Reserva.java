package model;

import java.util.Date;

public class Reserva {
    private int idReserva;
    private Cliente cliente;
    private Date dataReserva;
    private Date dataInicio;
    private Date dataFim;
    private Quarto quarto;

    public Reserva(int idReserva, Cliente cliente, Date dataReserva, Date dataInicio, Date dataFim, Quarto quarto) {
        this.idReserva = idReserva;
        this.cliente = cliente;
        this.dataReserva = dataReserva;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.quarto = quarto;
    }

    public void confirmarReserva() {
        // Lógica de confirmação da reserva
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

    public Date getDataReserva() {
        return dataReserva;
    }

    public void setDataReserva(Date dataReserva) {
        this.dataReserva = dataReserva;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Date getDataFim() {
        return dataFim;
    }

    public void setDataFim(Date dataFim) {
        this.dataFim = dataFim;
    }

    public Quarto getQuarto() {
        return quarto;
    }

    public void setQuarto(Quarto quarto) {
        this.quarto = quarto;
    }

    @Override
    public String toString() {
        return "Reserva{" +
                "idReserva=" + idReserva +
                ", cliente=" + cliente +
                ", dataReserva=" + dataReserva +
                ", dataInicio=" + dataInicio +
                ", dataFim=" + dataFim +
                ", quarto=" + quarto +
                '}';
    }
}
