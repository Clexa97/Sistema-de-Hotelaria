package controller;

import model.Hospede;
import service.HospedeService;

public class HospedeController {
   HospedeService hospedeService = new HospedeService();

    public HospedeController(HospedeService hospedeService) {
        this.hospedeService = hospedeService;
    }

    public void cadastrarHospede(Hospede hospede) {
        hospedeService.cadastrarHospede(hospede);
    }

    public void atualizarDadosHospede(int idHospede, Hospede hospedeAtualizado) {
        hospedeService.atualizarDadosHospede(idHospede, hospedeAtualizado);
    }
}
