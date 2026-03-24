import java.util.Scanner;

public class ConversorTempo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tempo em segundos: ");
        int totalSegundos = scanner.nextInt();

        int horas = totalSegundos / 3600;
        int resto = totalSegundos % 3600;

        int minutos = resto / 60;
        int segundos = resto % 60;

        System.out.printf("%d segundos = %d horas, %d minutos e %d segundos\n",
                totalSegundos, horas, minutos, segundos);

        scanner.close();
    }
}