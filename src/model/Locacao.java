package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Locacao {
    private int idLocacao;
    private Hospede hospede;
    private Quarto quarto;
    private Date dateEntrada;
    private Date dateSaida;
    private Funcionario funcionarioResponsavel;
    private List<Diaria> listaDeDiarias;

    public Locacao(int idLocacao, Hospede hospede, Quarto quarto, Date dateEntrada, Date dateSaida, Funcionario funcionarioResponsavel, List<Diaria> listaDeDiarias) {
        this.idLocacao = idLocacao;
        this.hospede = hospede;
        this.quarto = quarto;
        this.dateEntrada = dateEntrada;
        this.dateSaida = dateSaida;
        this.funcionarioResponsavel = funcionarioResponsavel;
        this.listaDeDiarias = new ArrayList<>();
    }

    public void adicionarDiaria(Diaria diaria) {
        listaDeDiarias.add(diaria);
    }

    public int getIdLocacao() {
        return idLocacao;
    }

    public void setIdLocacao(int idLocacao) {
        this.idLocacao = idLocacao;
    }

    public Hospede getHospede() {
        return hospede;
    }

    public void setHospede(Hospede hospede) {
        this.hospede = hospede;
    }

    public Quarto getQuarto() {
        return quarto;
    }

    public void setQuarto(Quarto quarto) {
        this.quarto = quarto;
    }

    public Date getDateEntrada() {
        return dateEntrada;
    }

    public void setDateEntrada(Date dateEntrada) {
        this.dateEntrada = dateEntrada;
    }

    public Date getDateSaida() {
        return dateSaida;
    }

    public void setDateSaida(Date dateSaida) {
        this.dateSaida = dateSaida;
    }

    public Funcionario getFuncionarioResponsavel() {
        return funcionarioResponsavel;
    }

    public void setFuncionarioResponsavel(Funcionario funcionarioResponsavel) {
        this.funcionarioResponsavel = funcionarioResponsavel;
    }

    public List<Diaria> getListaDeDiarias() {
        return listaDeDiarias;
    }

    public void setListaDeDiarias(List<Diaria> listaDeDiarias) {
        this.listaDeDiarias = listaDeDiarias;
    }

    @Override
    public String toString() {
        return "Locacao{" +
                "idLocacao=" + idLocacao +
                ", hospede=" + hospede +
                ", quarto=" + quarto +
                ", dateEntrada=" + dateEntrada +
                ", dateSaida=" + dateSaida +
                ", funcionarioResponsavel=" + funcionarioResponsavel +
                ", listaDeDiarias=" + listaDeDiarias +
                '}';
    }
}
