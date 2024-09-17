package service;

import exception.QuartoIndisponivelException;
import model.CategoriaQuarto;
import model.Funcionario;
import model.Hotel;
import model.Quarto;

import java.util.List;
import java.util.stream.Collectors;

public class HotelService {
    Hotel hotel = new Hotel();

    public void adicionarQuarto(Quarto quarto) {
        hotel.adicionarQuarto(quarto);
    }


    public void removerQuarto(Quarto quarto) {
        hotel.removerQuarto(quarto);
    }

    public void adicionarFuncionario(Funcionario funcionario) {
        hotel.adicionarFuncionario(funcionario);
    }


    public void removerFuncionario(Funcionario funcionario) {
        hotel.removerFuncionario(funcionario);
    }


    public Quarto verificarDisponibilidade(CategoriaQuarto categoria) throws QuartoIndisponivelException {
        List<Quarto> quartosDisponiveis = hotel.getQuartos().stream()
                .filter(quarto -> quarto.getCategoria() == categoria && !quarto.isOcupado())
                .collect(Collectors.toList());

        if (quartosDisponiveis.isEmpty()) {
            throw new QuartoIndisponivelException("Nenhum quarto disponível para a categoria: " + categoria);
        }

        return quartosDisponiveis.get(0);
    }


    public List<Quarto> listarQuartos() {
        return hotel.getQuartos();
    }


    public List<Funcionario> listarFuncionarios() {
        return hotel.getFuncionarios();
    }


    public boolean quartoDisponivel(Quarto quarto) {
        return !quarto.isOcupado();
    }


    public List<Quarto> listarQuartosPorCategoria(CategoriaQuarto categoria) {
        return hotel.getQuartos().stream()
                .filter(quarto -> quarto.getCategoria() == categoria && !quarto.isOcupado())
                .collect(Collectors.toList());
    }
}
