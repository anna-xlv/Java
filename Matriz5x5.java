import java.util.Scanner;
import java.util.HashSet;

public class Matriz5x5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[5][5];
        HashSet<Integer> elementos = new HashSet<>();
        HashSet<Integer> repetidos = new HashSet<>();

        System.out.println("Digite os elementos da matriz 5x5:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matriz[i][j] = scanner.nextInt();
            
                if (!elementos.add(matriz[i][j])) {
                    repetidos.add(matriz[i][j]);
                }
            }
        }

        System.out.println("Matriz 5x5:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        if (!repetidos.isEmpty()) {
            System.out.println("Números repetidos:");
            for (int num : repetidos) {
                System.out.print(num + " ");
            }
        } else {
            System.out.println("Nenhum número repetido encontrado.");
        }
    }
}
