import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("CONVERSOR DE MOEDAS");
        System.out.println("--------------------");

        System.out.println("""
                Escolha uma opção:
                1 - USD -> BRL
                2 - BRL -> USD
                3 - EUR -> BRL
                4 - BRL -> EUR
                5 - USD -> EUR
                6 - EUR -> USD
                """);

        int opcao = sc.nextInt();

        String moedaOrigem = "";
        String moedaDestino = "";

        switch (opcao) {
            case 1 -> { moedaOrigem = "USD"; moedaDestino = "BRL"; }
            case 2 -> { moedaOrigem = "BRL"; moedaDestino = "USD"; }
            case 3 -> { moedaOrigem = "EUR"; moedaDestino = "BRL"; }
            case 4 -> { moedaOrigem = "BRL"; moedaDestino = "EUR"; }
            case 5 -> { moedaOrigem = "USD"; moedaDestino = "EUR"; }
            case 6 -> { moedaOrigem = "EUR"; moedaDestino = "USD"; }
            default -> {
                System.out.println("Opção inválida!");
                return;
            }
        }

        System.out.print("Digite o valor: ");
        double valor = sc.nextDouble();

        double convertido = Conversor.converter(moedaOrigem, moedaDestino, valor);

        System.out.printf("Valor convertido: %.2f %s%n", convertido, moedaDestino);

        System.out.println("Programa encerrado.");
    }
}
