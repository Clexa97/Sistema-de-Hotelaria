package model;

import java.util.ArrayList;
import java.util.List;

public class Funcionario {
    private int idFuncionario;
    private String nome;
    private String cargo;
    private List<Locacao> listaDeLocacoes;

    public Funcionario(int idFuncionario, String nome, String cargo, List<Locacao> listaDeLocacoes) {
        this.idFuncionario = idFuncionario;
        this.nome = nome;
        this.cargo = cargo;
        this.listaDeLocacoes = new ArrayList<>();
    }

    public void registrarLocacao(Locacao locacao) {
        listaDeLocacoes.add(locacao);
    }

    public void encerrarLocacao(Locacao locacao) {
        listaDeLocacoes.remove(locacao);
    }

    public int getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(int idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public List<Locacao> getListaDeLocacoes() {
        return listaDeLocacoes;
    }

    public void setListaDeLocacoes(List<Locacao> listaDeLocacoes) {
        this.listaDeLocacoes = listaDeLocacoes;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "idFuncionario=" + idFuncionario +
                ", nome='" + nome + '\'' +
                ", cargo='" + cargo + '\'' +
                ", listaDeLocacoes=" + listaDeLocacoes +
                '}';
    }
}
