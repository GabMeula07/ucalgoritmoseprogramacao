import java.util.Scanner;

public class CalculadoraDeMedia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("\nDigite a nota 1: ");
        double nota1 = scanner.nextDouble();
        
        System.out.print("Digite a nota 2: ");
        double nota2 = scanner.nextDouble();
        
        System.out.print("Digite a nota 3: ");
        double nota3 = scanner.nextDouble();

        double media = (nota1+ nota2 + nota3) / 3;
        
        System.out.printf("Sua nota foi: %.2f" , media);


    }
}
