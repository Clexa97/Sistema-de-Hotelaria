package model;

import java.util.ArrayList;
import java.util.List;

public class Hospede {
    private int idHospede;
    private String nome;
    private String telefone;
    private String email;
    List<Locacao> listaDeLocacoes;
    List<Consumo> listaDeConsumos;
    List<Servico> listaDeServicoSolicitados;

    public Hospede(int idHospede, String nome, String telefone, String email, List<Locacao> listaDeLocacoes, List<Consumo> listaDeConsumos, List<Servico> listaDeServicoSolicitados) {
        this.idHospede = idHospede;
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.listaDeLocacoes = new ArrayList<>();
        this.listaDeConsumos = new ArrayList<>();
        this.listaDeServicoSolicitados = new ArrayList<>();
    }
    public void registrarConsumo(Item item) {
        // Lógica de registro de consumo
    }

    public void solicitarServico(Servico servico) {
        listaDeServicoSolicitados.add(servico);
    }



    public int getIdHospede() {
        return idHospede;
    }

    public void setIdHospede(int idHospede) {
        this.idHospede = idHospede;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Locacao> getListaDeLocacoes() {
        return listaDeLocacoes;
    }

    public void setListaDeLocacoes(List<Locacao> listaDeLocacoes) {
        this.listaDeLocacoes = listaDeLocacoes;
    }

    public List<Consumo> getListaDeConsumos() {
        return listaDeConsumos;
    }

    public void setListaDeConsumos(List<Consumo> listaDeConsumos) {
        this.listaDeConsumos = listaDeConsumos;
    }

    public List<Servico> getListaDeServicoSolicitados() {
        return listaDeServicoSolicitados;
    }

    public void setListaDeServicoSolicitados(List<Servico> listaDeServicoSolicitados) {
        this.listaDeServicoSolicitados = listaDeServicoSolicitados;
    }

    @Override
    public String toString() {
        return "Hospede{" +
                "idHospede=" + idHospede +
                ", nome='" + nome + '\'' +
                ", telefone='" + telefone + '\'' +
                ", email='" + email + '\'' +
                ", listaDeLocacoes=" + listaDeLocacoes +
                ", listaDeConsumos=" + listaDeConsumos +
                ", listaDeServicoSolicitados=" + listaDeServicoSolicitados +
                '}';
    }
}
