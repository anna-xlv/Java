public class ex022 {
    public static void main(String[] args) {
        int[] vetor = {1, 2, 3, 4, 5};
        int soma = 0;

        for (int num : vetor) {
            soma += num;
        }

        System.out.println("Soma dos elementos do vetor: " + soma);
    }
}
