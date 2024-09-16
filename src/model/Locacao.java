package model;

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
}
