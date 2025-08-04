import java.util.Scanner;

public class ex04 {
    public static void main (String[] args) {
        Scanner beta = new Scanner(System.in);

        System.out.println("informe um intervalo e números: ");
        int n = beta.nextInt();

        for(int i=0; i<= n ; i++) {
            if (i % 2 != 0) {
                System.out.println("Número "+i);
            }
        }
        beta.close();
    }
}
