import java.util.Scanner;

public class ex019 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double soma = 0, menor = Double.MAX_VALUE, maior = Double.MIN_VALUE;
        int count = 0;

        System.out.println("Digite as temperaturas (digite um valor negativo para encerrar): ");
        while (true) {
            double temp = scanner.nextDouble();
            if (temp < 0) break;

            soma += temp;
            menor = Math.min(menor, temp);
            maior = Math.max(maior, temp);
            count++;
        }

        if (count > 0) {
            double media = soma / count;
            System.out.println("Menor temperatura: " + menor);
            System.out.println("Maior temperatura: " + maior);
            System.out.println("Média das temperaturas: " + media);
        } else {
            System.out.println("Nenhuma temperatura válida foi digitada.");
        }
    }
}
