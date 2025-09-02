import java.util.Scanner;

public class IfAluno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua nota: ");
        double nota = scanner.nextDouble();
        System.out.print("Digite sua frequência (%): ");
        int frequencia = scanner.nextInt();

        if (nota >= 7) {
            if (frequencia >= 75) {
                System.out.println("Aprovado!");
            } else {
                System.out.println("Reprovado por frequência.");
            }
        } else {
            System.out.println("Reprovado por nota.");
        }

        scanner.close();
    }
}