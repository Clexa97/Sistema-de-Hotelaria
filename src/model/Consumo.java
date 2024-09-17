package model;

import java.util.ArrayList;
import java.util.List;

public class Consumo {
    private int idConsumo;
    private Hospede hospede;
    private List<Item> listaDeItens;
    private double valorTotal;

    public Consumo(int idConsumo, Hospede hospede, List<Item> listaDeItens, double valorTotal) {
        this.idConsumo = idConsumo;
        this.hospede = hospede;
        this.listaDeItens = new ArrayList<>();
        this.valorTotal = valorTotal;
    }
    public double calcularValorTotal() {
        return listaDeItens.stream().mapToDouble(Item::calcularPrecoTotal).sum();
    }

    public int getIdConsumo() {
        return idConsumo;
    }

    public void setIdConsumo(int idConsumo) {
        this.idConsumo = idConsumo;
    }

    public Hospede getHospede() {
        return hospede;
    }

    public void setHospede(Hospede hospede) {
        this.hospede = hospede;
    }

    public List<Item> getListaDeItens() {
        return listaDeItens;
    }

    public void setListaDeItens(List<Item> listaDeItens) {
        this.listaDeItens = listaDeItens;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    @Override
    public String toString() {
        return "Consumo{" +
                "idConsumo=" + idConsumo +
                ", hospede=" + hospede +
                ", listaDeItens=" + listaDeItens +
                ", valorTotal=" + valorTotal +
                '}';
    }
}
