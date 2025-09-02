public class WhileTabuada {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 10) {
            int j = 1;
            while (j <= 10) {
                System.out.printf("%d x %d = %d\n", i, j, i * j);
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
