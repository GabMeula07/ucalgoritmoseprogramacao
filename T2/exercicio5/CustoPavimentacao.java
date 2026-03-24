import java.util.Scanner;

public class CustoPavimentacao {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o raio da praca (em metros): ");
        double raio = scanner.nextDouble();

        System.out.print("Digite o valor do metro quadrado do piso (R$): ");
        double custoMetroQuadrado = scanner.nextDouble();

        double area = Math.PI * Math.pow(raio, 2);
        
        double custoTotal = area * custoMetroQuadrado;

        System.out.printf("Area total da praca: %.2f m2\n", area);
        System.out.printf("Custo total do material: R$ %.2f\n", custoTotal);

        scanner.close();
    }
}