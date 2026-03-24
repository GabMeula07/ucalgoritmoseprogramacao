import java.util.Scanner;

public class CalculadoraVelocidadeMedia {

    public static void main(String[] args) {
  
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Calculadora de Velocidade Média ---");

       
        System.out.print("Digite a distância percorrida (em km): ");
        double distancia = scanner.nextDouble();


        System.out.print("Digite o tempo gasto (em horas): ");
        double tempo = scanner.nextDouble();


        double velocidadeMedia = distancia / tempo;


        System.out.println("A velocidade média do veículo é: " + velocidadeMedia + " km/h");

  
        scanner.close();
    }
}