import java.util.Scanner;
public class IsPositive {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.err.print("Digite um número: ");
        int n = scanner.nextInt();

        if (n >= 0){
            System.err.println("O número é positivo");
        } else {
            System.out.println("O número é negativo");
        }

    }
    
}
