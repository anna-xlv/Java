import java.util.Scanner;

public class ex014 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o salário atual: R$ ");
        double salarioAtual = scanner.nextDouble();

        double percentual;
        if (salarioAtual <= 280) {
            percentual = 20;
        } else if (salarioAtual <= 700) {
            percentual = 15;
        } else if (salarioAtual <= 1500) {
            percentual = 10;
        } else {
            percentual = 5;
        }

        double aumento = salarioAtual * percentual / 100;
        double novoSalario = salarioAtual + aumento;

        System.out.println("Salário antes do reajuste: R$ " + salarioAtual);
        System.out.println("Percentual de aumento aplicado: " + percentual + "%");
        System.out.println("Valor do aumento: R$ " + aumento);
        System.out.println("Novo salário: R$ " + novoSalario);
    }
}
