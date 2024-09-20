package model;


import java.util.Date;

public class Funcionario {
    private int idFuncionario;
    private String nome;
    private String cargo;

    public Funcionario(int idFuncionario, String nome, String cargo) {
        this.idFuncionario = idFuncionario;
        this.nome = nome;
        this.cargo = cargo;
    }
    Locacao locacao = new Locacao();

    public void registrarEntradaHospede(Hospede hospede, Quarto quarto, Locacao locacao) {
        if (quarto.isOcupado()) {
            System.out.println("O quarto " + quarto.getNumero() + " já está ocupado.");
            return;
        }

        quarto.setOcupado(true);

        locacao.setHospede(hospede);
        locacao.setQuarto(quarto);
        locacao.setDataEntrada(new Date());

        System.out.println("Entrada do hóspede " + hospede.getNome() + " registrada no quarto " + quarto.getNumero() + ".");
    }


    public void registrarSaidaHospede(Hospede hospede, Quarto quarto, Locacao locacao) {
        if (!quarto.isOcupado()) {
            System.out.println("O quarto " + quarto.getNumero() + " já está desocupado.");
            return;
        }

        quarto.setOcupado(false);

        locacao.setDataSaida(new Date());

        System.out.println("Saída do hóspede " + hospede.getNome() + " registrada no quarto " + quarto.getNumero() + ".");
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
}
