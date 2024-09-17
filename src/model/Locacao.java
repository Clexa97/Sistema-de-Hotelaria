package model;


import java.util.Date;


public class Locacao {
    private int idLocacao;
    private Hospede hospede;
    private Quarto quarto;
    private Date dataEntrada;
    private Date dataSaida;
    private Funcionario funcionarioResponsavel;

    public void encerrarLocacao() {

        this.dataSaida = new Date();


        quarto.setOcupado(false);


        long diferencaMillis = dataSaida.getTime() - dataEntrada.getTime();
        long diferencaDias = (diferencaMillis / (1000 * 60 * 60 * 24)) + 1; //

        double valorTotalDiarias = diferencaDias * quarto.getCategoria().getPrecoDiaria();

        System.out.println("Locação encerrada para o hóspede: " + hospede.getNome());
        System.out.println("Número de dias de ocupação: " + diferencaDias);
        System.out.println("Valor total das diárias: R$ " + valorTotalDiarias);

        double valorTotalConsumo = hospede.calcularTotalConsumo();
        double valorTotalServicos = hospede.calcularTotalServicos();

        System.out.println("Valor total dos consumos: R$ " + valorTotalConsumo);
        System.out.println("Valor total dos serviços: R$ " + valorTotalServicos);

        double valorTotalFinal = valorTotalDiarias + valorTotalConsumo + valorTotalServicos;
        System.out.println("Valor total final a ser pago: R$ " + valorTotalFinal);
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

    public Date getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(Date dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public Date getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(Date dataSaida) {
        this.dataSaida = dataSaida;
    }

    public Funcionario getFuncionarioResponsavel() {
        return funcionarioResponsavel;
    }

    public void setFuncionarioResponsavel(Funcionario funcionarioResponsavel) {
        this.funcionarioResponsavel = funcionarioResponsavel;
    }
}
