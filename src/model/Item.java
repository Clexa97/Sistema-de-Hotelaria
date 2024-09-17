package model;

public class Item {
    private int idItem;
    private String nome;
    private double preco;
    private int quantidade;

    public Item(int idItem, String nome, double preco, int quantidade) {
        this.idItem = idItem;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public double calcularPrecoTotal() {
        return preco * quantidade;
    }

    public int getIdItem() {
        return idItem;
    }

    public void setIdItem(int idItem) {
        this.idItem = idItem;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Item{" +
                "idItem=" + idItem +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                '}';
    }
}
