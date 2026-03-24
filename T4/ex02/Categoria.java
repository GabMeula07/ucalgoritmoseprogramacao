import java.util.Scanner;
public class Categoria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.err.print("Digite sua idade: ");
        int n = scanner.nextInt();

        if (n >= 18){
            System.err.println("Sua categoria é adulta");
        } else {
            System.out.println("Sua categoria é juveníl");
        }

    }
    
}