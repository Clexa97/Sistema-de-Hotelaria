package service;

import model.Hospede;
import model.Locacao;
import model.Quarto;

import java.util.List;

public class LocacaoService {
        private List<Locacao> listaDeLocacoes;

        public LocacaoService() {
            this.listaDeLocacoes = listaDeLocacoes;
        }

        public void registrarEntrada(Hospede hospede, Quarto quarto, Locacao locacao) {
            listaDeLocacoes.add(locacao);

            quarto.adicionarLocacao(locacao);
        }

        public void registrarSaida(Hospede hospede, Quarto quarto, Locacao locacao) {
            listaDeLocacoes.remove(locacao);

            quarto.removerLocacao(locacao);
        }
}
