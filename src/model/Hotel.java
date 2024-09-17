package model;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private String nome;
    private String local;
    private List<Quarto> listaDeQuartos;
    private List<Reserva> listaDeReservas;
    private List<Funcionario> listaDeFuncionario;
    private List<Servico> listaDeServico;

    public Hotel(String nome, String local, List<Quarto> listaDeQuartos, List<Reserva> listaDeReservas, List<Funcionario> listaDeFuncionario, List<Servico> listaDeServico) {
        this.nome = nome;
        this.local = local;
        this.listaDeQuartos = new ArrayList<>();
        this.listaDeReservas = new ArrayList<>();
        this.listaDeFuncionario = new ArrayList<>();
        this.listaDeServico = new ArrayList<>();
    }
    public void adicionarQuarto(Quarto quarto) {
        listaDeQuartos.add(quarto);
    }

    public void adicionarReserva(Reserva reserva) {
        listaDeReservas.add(reserva);
    }

    public void adicionarFuncionario(Funcionario funcionario) {
        listaDeFuncionario.add(funcionario);
    }

    public void adicionarServico(Servico servico) {
        listaDeServico.add(servico);
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public List<Quarto> getListaDeQuartos() {
        return listaDeQuartos;
    }

    public void setListaDeQuartos(List<Quarto> listaDeQuartos) {
        this.listaDeQuartos = listaDeQuartos;
    }

    public List<Reserva> getListaDeReservas() {
        return listaDeReservas;
    }

    public void setListaDeReservas(List<Reserva> listaDeReservas) {
        this.listaDeReservas = listaDeReservas;
    }

    public List<Funcionario> getListaDeFuncionario() {
        return listaDeFuncionario;
    }

    public void setListaDeFuncionario(List<Funcionario> listaDeFuncionario) {
        this.listaDeFuncionario = listaDeFuncionario;
    }

    public List<Servico> getListaDeServico() {
        return listaDeServico;
    }

    public void setListaDeServico(List<Servico> listaDeServico) {
        this.listaDeServico = listaDeServico;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "nome='" + nome + '\'' +
                ", local='" + local + '\'' +
                ", listaDeQuartos=" + listaDeQuartos +
                ", listaDeReservas=" + listaDeReservas +
                ", listaDeFuncionario=" + listaDeFuncionario +
                ", listaDeServico=" + listaDeServico +
                '}';
    }
}
