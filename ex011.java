import java.util.Scanner;

public class ex011 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um valor: ");
        int valor = scanner.nextInt();

        if (valor >= 0) {
            System.out.println("O valor é positivo.");
        } else {
            System.out.println("O valor é negativo.");
        }
    }
}

