/******************************************************************************

04

*******************************************************************************/
import java.util.Scanner;

public class XKW {
    public static void main(String[] args) {
        Scanner bota = new Scanner(System.in);
        double salario, tempo, bonus, conta;

        System.out.print("Digite o valor do seu salário: R$");
         salario = bota.nextDouble();

        System.out.print("Digite a quantos anos vc trabalha na empresa: ");
         tempo = bota.nextaDouble();

         if (tempo >= 5) { 
        bonus = (salario/100)*20;
            System.out.println("Vc recebeu um bonus de R$" + bonus);
        } else { 
         bonus = (salario/100)*10;
            System.out.println("Vc recebeu um bonus de R$" + bonus);
        }
    }
}