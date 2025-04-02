/******************************************************************************

17

*******************************************************************************/
import java.util.Scanner;
 public class ex017 {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int n1, soma = 0;
 
         for (int i = 1; i <= 10; i++) {
             System.out.println("A " + i + "° número");
             n1 = sc.nextInt();
             soma += n1;
         }
 
         System.out.println("A soma entre todos os números é equivalente a: " + soma);
     }
 }