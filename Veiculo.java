abstract class Veiculo {
    private String placa;
    private int ano;

    public Veiculo(String placa, int ano) {
        this.placa = placa;
        this.ano = ano;
    }

    public abstract double calcularValorSeguro();

    public void exibirDetalhes() {
        System.out.println("Placa: " + placa + ", Ano: " + ano);
    }
}