/******************************************************************************

09

*******************************************************************************/
import java.util.Scanner;

public class Estacionamento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int horaEntrada, minutoEntrada, horaSaida, minutoSaida, totalHoras, totalMinutos;
        double valor;

        System.out.print("Digite a hora de entrada (0-23): ");
        horaEntrada = sc.nextInt();
        System.out.print("Digite o minuto de entrada (0-59): ");
        minutoEntrada = sc.nextInt();

        System.out.print("Digite a hora de saída (0-23): ");
        horaSaida = sc.nextInt();
        System.out.print("Digite o minuto de saída (0-59): ");
        minutoSaida = sc.nextInt();

        totalHoras = horaSaida - horaEntrada;
        totalMinutos = minutoSaida - minutoEntrada;

        if (totalMinutos < 0) {
            totalMinutos += 60;
            totalHoras--;
        }

        if (totalHoras < 0) {
            totalHoras += 24;
        }

        if (totalMinutos > 0) {
            totalHoras++;
        }

        valor = 0;
        if (totalHoras == 1) {
            valor = 4.00;
        } else if (totalHoras == 2) {
            valor = 6.00;
        } else {
            valor = 6.00 + (totalHoras - 2) * 1.00;
        }

        System.out.println("Valor a ser pago pelo estacionamento: R$ " + valor);
    }
}
