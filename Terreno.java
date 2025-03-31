/******************************************************************************

13

*******************************************************************************/
import java.util.Scanner;

public class Terreno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double largura, comprimento, area;
        String classificacao;

        System.out.print("Digite a largura do terreno (em metros): ");
        largura = sc.nextDouble();

        System.out.print("Digite o comprimento do terreno (em metros): ");
        comprimento = sc.nextDouble();

        area = largura * comprimento;

        if (area < 100) {
            classificacao = "TERRENO POPULAR";
        } else if (area <= 500) {
            classificacao = "TERRENO MASTER";
        } else {
            classificacao = "TERRENO VIP";
        }

        System.out.println("Área do terreno: " + area + " m²");
        System.out.println("Classificação: " + classificacao);
    }
}
