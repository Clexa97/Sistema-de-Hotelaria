package model;

public class Consumo {
    private Hospede hospede;
    private Item item;
    private int quantidade;

    public Consumo(Hospede hospede, Item item, int quantidade) {
        this.hospede = hospede;
        this.item = item;
        this.quantidade = quantidade;
    }
    public void decrementarQuantidade() {
        this.quantidade--;
    }

    public void incrementarQuantidade() {
        this.quantidade++;
    }

    public Hospede getHospede() {
        return hospede;
    }

    public void setHospede(Hospede hospede) {
        this.hospede = hospede;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
