import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {
        Scanner beta = new Scanner(System.in);
        int soma=0;
        int v[] = new int[10];

        for(int i=0; i<10; i++) {
            System.out.println("Infome o "+ i +"º valor..: ");
            v[i] = beta.nextInt();
            soma = soma + v[i];
        }
        if(soma>15) {
            System.out.println("A soma dos valores do vetor é " + soma);
        }
        else
            System.out.println("A soma dos valores é menor que 10 ");
    }
}
