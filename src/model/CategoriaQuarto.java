package model;

public enum CategoriaQuarto {
        SIMPLES(100.0),
        DUPLO(150.0),
        CASAL(180.0),
        LUXO(300.0);

        private double precoDiaria;

        CategoriaQuarto(double precoDiaria) {
                this.precoDiaria = precoDiaria;
        }

        public double getPrecoDiaria() {
                return precoDiaria;
        }
}
