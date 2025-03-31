/******************************************************************************

11

*******************************************************************************/
import java.util.Scanner;

public class Credito {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double saldoMedio, credito;

        System.out.print("Digite o saldo médio do cliente: R$ ");
        saldoMedio = sc.nextDouble();

        credito = 0;

        if (saldoMedio <= 200) {
            credito = 0;
        } else if (saldoMedio <= 400) {
            credito = saldoMedio * 0.20;
        } else if (saldoMedio <= 600) {
            credito = saldoMedio * 0.30;
        } else {
            credito = saldoMedio * 0.40;
        }

        System.out.println("Saldo médio: R$ " + saldoMedio);
        System.out.println("Valor do crédito: R$ " + credito);
    }
}
