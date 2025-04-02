/******************************************************************************

22

*******************************************************************************/
import java.util.Scanner;

public class ex022 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int totalIdade = 0, totalIdadeMulheres = 0, totalIdadeHomens = 0;
        int Mulheres = 0, Homens = 0, idade;
        double mediaIdade, mediaIdadeMulheres, mediaIdadeHomens;
        char sexo;
        
        for (int i = 1; i <= 7; i++) {
            System.out.println("Pessoa " + i);
            System.out.print("Idade: ");
             idade = sc.nextInt();
            System.out.print("Sexo (M - Masculino, F - Feminino): ");
             sexo = sc.next().charAt(0);
            
            totalIdade += idade;
            
            if (sexo == 'F' || sexo == 'f') {
                totalIdadeMulheres += idade;
                Mulheres++;
            } else if (sexo == 'M' || sexo == 'm') {
                totalIdadeHomens += idade;
                Homens++;
            }
        }
        
         mediaIdade = totalIdade / 7.0;
         mediaIdadeMulheres = Mulheres == 0 ? 0 : totalIdadeMulheres / (double) Mulheres;
         mediaIdadeHomens = Homens == 0 ? 0 : totalIdadeHomens / (double) Homens;
        
        System.out.println("Média de idade do grupo: " + mediaIdade);
        System.out.println("Média de idade das mulheres: " + mediaIdadeMulheres);
        System.out.println("Média de idade dos homens: " + mediaIdadeHomens);
    }
}
