import java.util.Scanner;

public class exemplo {
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        int a, b, c;
        a = 10;
        System.out.println("Digite um número: ");
        b = ss.nextInt();
        try{
            c= a/b;
            System.out.println("Valor de c: " +c);
        } catch (ArithmeticException erro) {
            System.out.println("Não existe divisão por zero");
        }
    }
}
