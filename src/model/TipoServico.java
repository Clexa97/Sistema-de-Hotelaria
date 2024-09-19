package model;

public enum TipoServico {
        LAVANDERIA("Serviço de lavanderia disponível."),
        PASSAR_ROUPA("Serviço de passar roupa disponível."),
        SERVICO_QUARTO("Serviço de quarto disponível.");

        private String descricao;

        TipoServico(String descricao) {
                this.descricao = descricao;
        }

        public String getDescricao() {
                return descricao;
        }
}
