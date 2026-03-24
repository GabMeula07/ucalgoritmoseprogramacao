import java.util.Scanner;

class CalculadoraAreaQuadrado {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);   

        System.out.print("Digite a medida do lado do quadrado: ");
        double lado = scanner.nextDouble();
        double area = lado * lado;

        System.out.printf("A área do quadrado de lado %.2f é %.2f", lado, area);
    }   
}