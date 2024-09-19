package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Hospede {
    protected String nome;
    protected String cpf;
    protected Date dataNascimento;
    protected String contato;
    protected List<Servico> listaDeServicosSolicitados;
    protected List<Consumo> listaDeConsumos;

    public Hospede(String nome, String cpf, Date dataNascimento, String contato) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.contato = contato;
        this.listaDeServicosSolicitados = new ArrayList<>();
        this.listaDeConsumos = new ArrayList<>();
    }


    public void solicitarServico(Servico servico) {
        listaDeServicosSolicitados.add(servico);
        System.out.println("Serviço solicitado: " + servico.getTipo() + " para o hóspede " + nome);
    }

    public void adicionarConsumo(Item item) {

        listaDeConsumos.stream()
                .filter(consumo -> consumo.getItem().equals(item))
                .findFirst()
                .ifPresentOrElse(
                        consumo -> {
                            consumo.incrementarQuantidade();
                            System.out.println("Consumo atualizado: " + item.getNome() + ", quantidade: " + consumo.getQuantidade());
                        },
                        () -> {
                            Consumo novoConsumo = new Consumo(this, item, 1);
                            listaDeConsumos.add(novoConsumo);
                            System.out.println("Item consumido: " + item.getNome() + ", quantidade: 1");
                        }
                );
    }

    public void removerConsumo(Item item) {
        listaDeConsumos.stream()
                .filter(consumo -> consumo.getItem().equals(item))
                .findFirst()
                .ifPresentOrElse(
                        consumo -> {
                            consumo.decrementarQuantidade();
                            System.out.println("Consumo removido: " + item.getNome() + ", quantidade restante: " + consumo.getQuantidade());


                            if (consumo.getQuantidade() <= 0) {
                                listaDeConsumos.remove(consumo);
                                System.out.println("Item " + item.getNome() + " removido do consumo.");
                            }
                        },
                        () -> System.out.println("Item " + item.getNome() + " não encontrado nos consumos.")
                );
    }

    public double calcularTotalConsumo() {
        return listaDeConsumos.stream()
                .mapToDouble(consumo -> consumo.getItem().getPreco() * consumo.getQuantidade())
                .sum();
    }

    public double calcularTotalServicos() {
        return listaDeServicosSolicitados.stream()
                .mapToDouble(Servico::getPreco)
                .sum();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public List<Servico> getListaDeServicosSolicitados() {
        return listaDeServicosSolicitados;
    }

    public void setListaDeServicosSolicitados(List<Servico> listaDeServicosSolicitados) {
        this.listaDeServicosSolicitados = listaDeServicosSolicitados;
    }

    public List<Consumo> getListaDeConsumos() {
        return listaDeConsumos;
    }

    public void setListaDeConsumos(List<Consumo> listaDeConsumos) {
        this.listaDeConsumos = listaDeConsumos;
    }
}
