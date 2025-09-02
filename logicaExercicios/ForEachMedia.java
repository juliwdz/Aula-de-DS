public class ForEachMedia {
      public static void main(String[] args) {
        double[] notas = {7.5, 8, 6.5, 9, 5.5};
        double soma = 0;
        for (double n : notas) {
            soma += n;
        }
        System.out.println("Média: " + (soma / notas.length));
    }
}