/******************************************************************************

19

*******************************************************************************/
import java.util.Scanner;
public class ex019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int idade = 0, idade_=200;;
        String nome, nome_menor="";

        for (int i = 1; i <= 10; i++) {
            System.out.println("Entre com o " + i + "° nome: ");
            nome = sc.nextLine();
            System.out.println("Entre com a idade da " + i +"° pessoa: ");
            idade = sc.nextInt();
            sc.nextLine();
            if (idade < idade_) {
                idade_ = idade;
                nome_menor = nome;
            }
        }
        System.out.println("Nome menor idade: " + nome_menor);
        System.out.println("Idade Menor: " + idade_);

    }
}