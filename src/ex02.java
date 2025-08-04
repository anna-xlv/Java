import java.util.Scanner;

public class ex02 {

        public static void main(String[] args) {
            Scanner beta = new Scanner(System.in);
            double n1, n2, n3;

            System.out.print("Digite o primeiro número: ");
            n1 = beta.nextDouble();

            System.out.print("Digite o segundo número: ");
            n2 = beta.nextDouble();

            System.out.print("Digite o terceiro número: ");
            n3 = beta.nextDouble();

            if (n1 > n2 & n1 > n3) {
                System.out.println("O primeiro número é o maior: " + n1);
            }else if (n2 > n1 & n2 > n3) {
                System.out.println("O segundo número é o maior: " + n2);
            }else if (n3 > n2 & n3 > n1) {
                System.out.println("O terceiro número é o maior: " + n3);
            }else{
                System.out.println("Todos os número são iguais");
            }
    }
}