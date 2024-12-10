class Moto extends Veiculo implements Manutencao {
    private int cilindrada;

    public Moto(String placa, int ano, int cilindrada) {
        super(placa, ano);
        this.cilindrada = cilindrada;
    }

    @Override
    public double calcularValorSeguro() {
        return 300 + (cilindrada * 0.1);
    }

    @Override
    public String realizarManutencao() {
        return "Manutenção da moto realizada: Verificação de pneus, motor e transmissão.";
    }
}