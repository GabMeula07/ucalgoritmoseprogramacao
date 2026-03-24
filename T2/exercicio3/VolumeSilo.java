import java.util.Scanner;

public class VolumeSilo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o raio da base do silo (em metros): ");
        double raio = scanner.nextDouble();

        System.out.print("Digite a altura do silo (em metros): ");
        double altura = scanner.nextDouble();

        double volume = Math.PI * Math.pow(raio, 2) * altura;

        System.out.println("O volume do silo e: " + volume + " metros cubicos");

        scanner.close();
    }
}