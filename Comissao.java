/******************************************************************************

07

*******************************************************************************/
import java.util.Scanner;

public class Comissao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double slbase, total, comissao, bruto;

        slbase = 1200.00;
        System.out.print("Digite o total vendido no mês de abril: R$ ");
        total = sc.nextDouble();

        comissao = 0;
        if (total > 2000.00) {
            comissao = total * 0.10;
        }

        bruto = slbase + comissao;
        System.out.println("Comissão: R$ " + comissao);
        System.out.println("Salário bruto: R$ " + bruto);
    }
}
