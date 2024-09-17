package model;

import java.util.ArrayList;
import java.util.List;

public class Quarto {
    private int numero;
    private CategoriaQuarto categoria;
    private double precoDiaria;
    private List<Item> listaDeItens;
    private List<Locacao> listaDeLocacoes;

    public Quarto(int numero, CategoriaQuarto categoria, double precoDiaria, List<Item> listaDeItens, List<Locacao> listaDeLocacoes) {
        this.numero = numero;
        this.categoria = categoria;
        this.precoDiaria = precoDiaria;
        this.listaDeItens = new ArrayList<>();
        this.listaDeLocacoes = new ArrayList<>();
    }

    public void adicionarItem(Item item) {
        listaDeItens.add(item);
    }

    public double calcularPrecoDiaria() {
        return precoDiaria;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public CategoriaQuarto getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaQuarto categoria) {
        this.categoria = categoria;
    }

    public double getPrecoDiaria() {
        return precoDiaria;
    }

    public void setPrecoDiaria(double precoDiaria) {
        this.precoDiaria = precoDiaria;
    }

    public List<Item> getListaDeItens() {
        return listaDeItens;
    }

    public void setListaDeItens(List<Item> listaDeItens) {
        this.listaDeItens = listaDeItens;
    }

    public List<Locacao> getListaDeLocacoes() {
        return listaDeLocacoes;
    }

    public void setListaDeLocacoes(List<Locacao> listaDeLocacoes) {
        this.listaDeLocacoes = listaDeLocacoes;
    }

    @Override
    public String toString() {
        return "Quarto{" +
                "numero=" + numero +
                ", categoria=" + categoria +
                ", precoDiaria=" + precoDiaria +
                ", listaDeItens=" + listaDeItens +
                ", listaDeLocacoes=" + listaDeLocacoes +
                '}';
    }
}
