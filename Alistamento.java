/******************************************************************************

12

*******************************************************************************/
import java.util.Scanner;

public class Alistamento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int anoNascimento, anoAtual, idade;

        System.out.print("Digite o ano de nascimento: ");
        anoNascimento = sc.nextInt();

        anoAtual = 2025; 
        idade = anoAtual - anoNascimento;

        if (idade < 18) {
            System.out.println("Faltam " + (18 - idade) + " anos para o alistamento.");
        } else if (idade > 18) {
            System.out.println("Já se passaram " + (idade - 18) + " anos desde o alistamento.");
        } else {
            System.out.println("É o ano do alistamento!");
        }
    }
}
