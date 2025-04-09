/******************************************************************************

atividade 36

*******************************************************************************/
import java.util.Scanner;

public class ex36 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double base, dinheiro, valor;
        int opcao = 0;


           while(opcao != 4) {
             base = 20100;

              System.out.println("\n\nBem vindo ao banco. Você oq deseja fazer:\n1 - Ver saldo bancário\n2 - Depositar dinheiro\n3 - Sacar dinheiro\n4 - Sair.");
               opcao = ler.nextInt();

                switch (opcao) {

                  case 1:
                    System.out.println("\nSaldo bancário de R$" + base + ".");
                  break;

                  case 2:
                    System.out.println("\nQual é o valor que quer depositar?");
                     valor = ler.nextDouble();
                        dinheiro = base + valor;
                        base = dinheiro;
                         System.out.println("Saldo atual: R$"+ base);
                  break;

                  case 3:
                    System.out.println("\nQual o valor do saque?");
                     valor = ler.nextDouble();
                        dinheiro = base - valor;
                        base = dinheiro;
                         System.out.println("Saldo atual: R$"+ base);
                  break;

                  case 4:
                    System.out.println("\nObrigado. Volte sempre!");
                  break;

            }
        }
    }
}