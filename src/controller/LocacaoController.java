package controller;

import model.Hospede;
import model.Locacao;
import model.Quarto;
import service.LocacaoService;

public class LocacaoController {
    LocacaoService locacaoService = new LocacaoService();

    public void registrarEntrada(Hospede hospede, Quarto quarto, Locacao locacao) {
        locacaoService.registrarEntrada(hospede, quarto, locacao);
    }

    public void registrarSaida(Hospede hospede, Quarto quarto, Locacao locacao) {
        locacaoService.registrarSaida(hospede, quarto, locacao);
    }
}
