package controller;

import model.Funcionario;
import model.Hotel;
import model.Quarto;
import service.HotelService;

public class HotelController {
    private HotelService hotelService = new HotelService();

    public void adicionarQuarto(Quarto quarto) {
        hotelService.adicionarQuarto(quarto);
    }

    public void adicionarFuncionario(Funcionario funcionario) {
        hotelService.adicionarFuncionario(funcionario);
    }

}
