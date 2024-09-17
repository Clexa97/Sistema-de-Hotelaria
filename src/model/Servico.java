package model;

import java.util.List;

public class Servico {
    private int idServico;
    private TipoServico tipoServico;
    private double preco;

    public Servico(int idServico, TipoServico tipoServico, double preco) {
        this.idServico = idServico;
        this.tipoServico = tipoServico;
        this.preco = preco;
    }

    public double calcularPrecoServico() {
        return preco;
    }

    public int getIdServico() {
        return idServico;
    }

    public void setIdServico(int idServico) {
        this.idServico = idServico;
    }

    public TipoServico getTipoServico() {
        return tipoServico;
    }

    public void setTipoServico(TipoServico tipoServico) {
        this.tipoServico = tipoServico;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Servico{" +
                "idServico=" + idServico +
                ", tipoServico=" + tipoServico +
                ", preco=" + preco +
                '}';
    }
}
