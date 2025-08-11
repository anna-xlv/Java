import java.util.Scanner;

public class exemplo2 {
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        int a, b, c;
        a = 10;
        System.out.println("Digite um número: ");
        b = ss.nextInt();
        try{
            c= a/b;
            System.out.println("Valor de c: " +c);
        } catch (Exception erro) {
            System.out.println("Não existe divisão por zero" +erro.getMessage());
        }
    }
}
