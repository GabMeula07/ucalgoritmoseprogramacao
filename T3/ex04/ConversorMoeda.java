import java.util.Scanner;

public class ConversorMoeda {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double COTACAO = 5.00;

        System.out.print("Digite o valor em reais (R$): ");
        double reais = scanner.nextDouble();

        double dolares = reais / COTACAO;

        System.out.printf("Valor em dólares: %.2f USD\n", dolares);

        scanner.close();
    }
}