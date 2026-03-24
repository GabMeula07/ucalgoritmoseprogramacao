import java.util.Scanner;

public class ConversorDeMoedas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor disponivel em Reais (R$): ");
        double reais = scanner.nextDouble();

        System.out.print("Digite a cotacao atual do Dolar: ");
        double cotacaoDolar = scanner.nextDouble();

        double dolares = reais / cotacaoDolar;

        System.out.println("Voce tera em Dolares (US$): " + dolares);

        scanner.close();
    }
}