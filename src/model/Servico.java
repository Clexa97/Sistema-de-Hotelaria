package model;


public class Servico {
    private TipoServico tipo;
    private double preco;


    public Servico(TipoServico tipo, double preco) {
        this.tipo = tipo;
        this.preco = preco;
    }

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

    @Override
    public String toString() {
        return "Serviço: " + tipo + ", Preço: R$ " + preco;
    }
}
