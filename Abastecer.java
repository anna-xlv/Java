/******************************************************************************

10

*******************************************************************************/
import java.util.Scanner;

public class Abastecer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char combustivel;
        double tanque, preco, custoTotal;

        System.out.print("Digite o tipo de carro (G para gasolina, A para álcool): ");
        combustivel = sc.next().charAt(0);

        System.out.print("Digite a capacidade do tanque (em litros): ");
        tanque = sc.nextDouble();

        preco = 0;
        if (combustivel == 'G' || combustivel == 'g') {
            preco = 1.80;
        } else if (combustivel == 'A' || combustivel == 'a') {
            preco = 1.00;
        } else {
            System.out.println("Tipo de carro inválido.");
            return;
        }

        custoTotal = preco * tanque;
        System.out.println("O custo para encher o tanque é: R$ " + custoTotal);
    }
}
