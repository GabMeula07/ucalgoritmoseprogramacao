import java.util.Scanner;

public class ConsumoEnergetico {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a potencia do aparelho (em Watts): ");
        double potencia = scanner.nextDouble();

        System.out.print("Digite a quantidade de horas de uso por dia: ");
        double horasPorDia = scanner.nextDouble();

        System.out.print("Digite o preco do KWh cobrado (em R$): ");
        double precoKwh = scanner.nextDouble();

        double consumoMensalKwh = (potencia * horasPorDia * 30) / 1000.0;
        double custoMensal = consumoMensalKwh * precoKwh;

        System.out.printf("O custo mensal desse aparelho e: R$ %.2f\n", custoMensal);

        scanner.close();
    }
}