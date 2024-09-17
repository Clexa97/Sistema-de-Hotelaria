package model;

import java.util.List;

public class Cliente extends Hospede{
    private int idCliente;
    List<Reserva> listaDeReservas;

    public Cliente(int idHospede, String nome, String telefone, String email, List<Locacao> listaDeLocacoes, List<Consumo> listaDeConsumos, List<Servico> listaDeServicoSolicitados, int idCliente, List<Reserva> listaDeReservas) {
        super(idHospede, nome, telefone, email, listaDeLocacoes, listaDeConsumos, listaDeServicoSolicitados);
        this.idCliente = idCliente;
        this.listaDeReservas = listaDeReservas;
    }

    public void realizarReserva(Reserva reserva) {
        listaDeReservas.add(reserva);
    }

    public void adicionarLocacao(Locacao locacao) {
        listaDeLocacoes.add(locacao);
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public List<Reserva> getListaDeReservas() {
        return listaDeReservas;
    }

    public void setListaDeReservas(List<Reserva> listaDeReservas) {
        this.listaDeReservas = listaDeReservas;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "listaDeReservas=" + listaDeReservas +
                ", idCliente=" + idCliente +
                ", listaDeServicoSolicitados=" + listaDeServicoSolicitados +
                ", listaDeLocacoes=" + listaDeLocacoes +
                ", listaDeConsumos=" + listaDeConsumos +
                '}';
    }
}
