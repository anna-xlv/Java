import java.util.Arrays;

public class ex025 {
    public static void main(String[] args) {
        int[] vetor = {1, 2, 3, 4, 5, 6};
        System.out.println("Vetor original: " + Arrays.toString(vetor));

        int[] invertido = new int[vetor.length];
        for (int i = 0; i < vetor.length; i++) {
            invertido[i] = vetor[vetor.length - 1 - i];
        }

        System.out.println("Vetor invertido: " + Arrays.toString(invertido));
    }
}
