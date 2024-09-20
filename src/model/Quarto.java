package model;

import java.util.ArrayList;
import java.util.List;

public class Quarto {
    private int numero;
    private CategoriaQuarto categoria;
    private boolean ocupado;
    private List<Locacao> locacoes;

    public Quarto(int i, CategoriaQuarto categoriaQuarto, boolean b) {
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public void adicionarLocacao(Locacao locacao) {
        locacoes.add(locacao);
        this.ocupado = true;
    }

    public void removerLocacao(Locacao locacao) {
        locacoes.remove(locacao);
        this.ocupado = false;
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

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

    public List<Locacao> getLocacoes() {
        return locacoes;
    }

    public void setLocacoes(List<Locacao> locacoes) {
        this.locacoes = locacoes;
    }


}
