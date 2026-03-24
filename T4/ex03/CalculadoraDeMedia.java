import java.util.Scanner;

public class CalculadoraDeMedia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("\nDigite a nota 1: ");
        double nota1 = scanner.nextDouble();
        
        System.out.print("Digite a nota 2: ");
        double nota2 = scanner.nextDouble();
    

        double media = (nota1 + nota2 ) / 2;
        
        if (media >= 6.0 ){

            System.out.println("Aprovado");

        }
        else {
            System.out.println("Reprovado");
        }


    }
}