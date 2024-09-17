package model;

import java.util.List;

public class Servico {
    private TipoServico tipo;
    private double preco;

    public double calcularPrecoServico() {
        return preco;
    }

    public TipoServico getTipo() {
        return tipo;
    }

    public void setTipo(TipoServico tipo) {
        this.tipo = tipo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
