import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        Scanner beta = new Scanner(System.in);

        String nomes[] = new String[5];

        for(int i=0; i<5; i++) {
            System.out.println("informe o " + i + "º Nome..:");
            nomes[i] = beta.next();
        }

        for(int i=0; i<5; i++) {
            System.out.println("Os nomes são " + nomes[i]);
        }
        beta.close();
    }
}