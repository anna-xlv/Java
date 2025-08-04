import java.util.Scanner;

public class ex03 {
        public static void main (String[] args) {
            Scanner beta = new Scanner(System.in);

            System.out.println("escolha um número e 1 a 3: ");
            int num = beta.nextInt();

            switch (num) {
                case 1:
                    System.out.println("O número escolhido foi: 1 ");
                    break;
                case 2:
                    System.out.println("O número escolhido foi: 2 ");
                    break;
                case 3:
                    System.out.println("O número escolhido foi: 3 ");
                    break;
                default:
                    System.out.println("O número escolhido é inválido. ");
            }
        }
}
