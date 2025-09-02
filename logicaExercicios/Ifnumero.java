import java.util.Scanner;

public class Ifnumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        if (numero >= 0) {
            System.out.println("O número escolhido é positivo.");
        } else {
            System.out.println("O número escolhido é negativo.");
        }

        scanner.close();
    }
}