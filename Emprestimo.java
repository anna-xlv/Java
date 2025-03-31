/******************************************************************************

05

*******************************************************************************/
import java.util.Scanner;

public class Emprestimo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double emprestimo, salario, vp, lp;
        int np;
        
        
        System.out.print("Digite o valor do empréstimo: R$ ");
         emprestimo = sc.nextDouble();
        
        System.out.print("Digite o número de parcelas: ");
         np = sc.nextInt();
        
        System.out.print("Digite o salário do solicitante: R$ ");
         salario = sc.nextDouble();
        

         vp = emprestimo / np;
         lp = salario * 0.30;
        
        if (vp <= lp) {
            System.out.println("Empréstimo aprovado!");
        } else {
            System.out.println("Empréstimo não aprovado! O valor das parcelas excede 30% do seu salário.");
        }
    }
}
