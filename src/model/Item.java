package model;

public class Item {
    private String nome;
    private double preco;
    private int quantia;

    public Item(String nome, double preco, int quantia) {
        this.nome = nome;
        this.preco = preco;
        this.quantia = quantia;
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
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Item item = (Item) obj;

        return nome != null && nome.equals(item.nome);
    }


}
