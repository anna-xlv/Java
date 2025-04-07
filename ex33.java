/******************************************************************************

atividade 33

*******************************************************************************/
import java.util.Scanner;
public class ex33 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int quant = 0, num = 0, soma = 0, media;
        while(quant <= 9){
            quant++;
            System.out.println("Insira o " + quant + "° número inteiro qualquer:");
            num = ler.nextInt();
            soma += num;
        }

        media = soma/10;

        System.out.println("Média dos dez números somados juntos é igual a " + media);
    }
}