/******************************************************************************

01

*******************************************************************************/
import java.util.Scanner;

public class Nota {
    public static void main(String[] args) {
        Scanner bota = new Scanner(System.in);
        double nota1, nota2, nota3, soma, media;

        System.out.print("Digite a primeira nota: ");
         nota1 = bota.nextDouble();

        System.out.print("Digite a segunda nota: ");
         nota2 = bota.nextDouble();

        System.out.print("Digite a terceira nota: ");
         nota3 = bota.nextDouble();

         soma = nota1 + nota2 + nota3;
         media = soma / 3;

        System.out.println("Soma das notas: " + soma);
        System.out.println("Média das notas: " + media);

        if (media >= 7) {
            System.out.println("Aprovado(a)!");
        } else {
            System.out.println("Reprovado(a)...");
        }
    }
}