import java.util.Scanner;

public class SwitchAninhado {
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
            case 1:
                System.out.println("Categoria: Maquiagem");
                System.out.println("1 - Batom");
                System.out.println("2 - Base");
                System.out.print("Escolha uma opção: ");
                int opcao1 = scanner.nextInt();

                switch (opcao1) {
                    case 1:
                        System.out.println("Você escolheu: Batom");
                        break;
                    case 2:
                        System.out.println("Você escolheu: Base");
                        break;
                    default:
                        System.out.println("Opção inválida!");
                }
                break;

            case 2:
                System.out.println("Categoria: Cabelos");
                System.out.println("1 - Shampoo");
                System.out.println("2 - Máscara capilar");
                System.out.print("Escolha uma opção: ");
                int opcao2 = scanner.nextInt();

                switch (opcao2) {
                    case 1:
                        System.out.println("Você escolheu: Shampoo");
                        break;
                    case 2:
                        System.out.println("Você escolheu: Máscara capilar");
                        break;
                    default:
                        System.out.println("Opção inválida!");
                }
                break;

            default:
                System.out.println("Categoria inválida!");
        }

        scanner.close();
    }
}
