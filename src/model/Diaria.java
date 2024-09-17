package model;

import java.util.Date;

public class Diaria {
    private int idDiaria;
    private Date data;
    private double valor;
    private Hospede hospede;

    public Diaria(int idDiaria, Date data, double valor, Hospede hospede) {
        this.idDiaria = idDiaria;
        this.data = data;
        this.valor = valor;
        this.hospede = hospede;
    }

    public int getIdDiaria() {
        return idDiaria;
    }

    public void setIdDiaria(int idDiaria) {
        this.idDiaria = idDiaria;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Hospede getHospede() {
        return hospede;
    }

    public void setHospede(Hospede hospede) {
        this.hospede = hospede;
    }
}
