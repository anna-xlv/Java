/******************************************************************************

08

*******************************************************************************/
import java.util.Scanner;

public class Peso {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double altura, peso;
        char sexo;

        System.out.print("Digite a altura (em metros): ");
        altura = sc.nextDouble();

        System.out.print("Digite o sexo (M para masculino, F para feminino): ");
        sexo = sc.next().charAt(0);

        peso = 0;
        if (sexo == 'M' || sexo == 'm') {
            peso = (72.7 * altura) - 58;
        } else if (sexo == 'F' || sexo == 'f') {
            peso = (62.1 * altura) - 44.7;
        } else {
            System.out.println("Sexo inválido.");
            return;
        }

        System.out.println("Peso ideal: " + peso + " kg");
    }
}
