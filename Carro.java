class Carro extends Veiculo implements Manutencao {
    private int numeroPortas;

    public Carro(String placa, int ano, int numeroPortas) {
        super(placa, ano);
        this.numeroPortas = numeroPortas;
    }

    @Override
    public double calcularValorSeguro() {
        return 500 + (numeroPortas * 50);
    }

    @Override
    public String realizarManutencao() {
        return "Manutenção do carro realizada: Verificação de freios, motor e suspensão.";
    }
}