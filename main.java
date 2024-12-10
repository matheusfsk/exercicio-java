import java.util.ArrayList;

public class GerenciadorVeiculos {
    public static void main(String[] args) {
        ArrayList<Veiculo> frota = new ArrayList<>();

        frota.add(new Carro("ABC-1234", 2020, 4));
        frota.add(new Moto("XYZ-5678", 2019, 250));

        for (Veiculo veiculo : frota) {
            veiculo.exibirDetalhes();
            System.out.println("Valor do Seguro: R$ " + veiculo.calcularValorSeguro());
            if (veiculo instanceof Manutencao) {
                System.out.println(((Manutencao) veiculo).realizarManutencao());
            }
            System.out.println();
        }
    }
}