import java.util.Scanner;

public class DisplayVariaveis{
    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a idade: ");
        int idade = scanner.nextInt();
        
        System.out.print("Digite a altura: ");
        double altura = scanner.nextDouble();

        System.out.printf("nome: %s\nidade: %d \naltura: %f", nome, idade, altura);

        scanner.close();

    }
}









