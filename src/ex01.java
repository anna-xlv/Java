import java.util.Scanner;

public class ex01 {

    public static void main (String[] args) {
        Scanner beta = new Scanner(System.in);
        int a, b;

        System.out.print("Informe o primeiro valor: ");
        a = beta.nextInt();

        System.out.print("Informe o segundo valor: ");
        b = beta.nextInt();

        System.out.println("Resultados");
        System.out.println("Soma: "+ (a+b));
        System.out.println("Subtração: "+ (a-b));
        System.out.println("Multiplicação: "+ (a*b));
        System.out.println("Divisão inteira: "+ (a/b));
        System.out.println("Divisão exata: "+ ((double)a/b));
    }
}
