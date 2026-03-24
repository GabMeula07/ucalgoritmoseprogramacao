import java.util.Scanner;

public class Multiplos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        if (numero % 3 == 0 && numero % 5 == 0) {
            System.out.println("O número é múltiplo de 3 e de 5.");
        } else {
            System.out.println("O número NÃO é múltiplo de 3 e de 5 ao mesmo tempo.");
        }

        scanner.close();
    }
}
