import java.util.Scanner;

public class SwitchLojaBeleza {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Loja de Beleza ===");
        System.out.println("Escolha uma categoria:");
        System.out.println("1 - Maquiagem");
        System.out.println("2 - Cabelos");
        System.out.print("Digite o número da categoria: ");
        int categoria = scanner.nextInt();
        System.out.println(); 

        switch (categoria) {
            case 1 -> {
                System.out.println("Categoria: Maquiagem");
                System.out.println("1 - Batom");
                System.out.println("2 - Base");
                System.out.print("Escolha uma opção: ");
                int opcao = scanner.nextInt();

                switch (opcao) {
                    case 1 -> System.out.println("Você escolheu: Batom");
                    case 2 -> System.out.println("Você escolheu: Base");
                }
            }

            case 2 -> {
                System.out.println("Categoria: Cabelos");
                System.out.println("1 - Shampoo");
                System.out.println("2 - Máscara capilar");
                System.out.print("Escolha uma opção: ");
                int opcao = scanner.nextInt();

                switch (opcao) {
                    case 1 -> System.out.println("Você escolheu: Shampoo");
                    case 2 -> System.out.println("Você escolheu: Máscara capilar");
                }
            }
        }

        scanner.close();
    }
}