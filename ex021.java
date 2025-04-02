/******************************************************************************

21

*******************************************************************************/
import java.util.Scanner;

public class ex021 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int maior50 = 0, Azul = 0, RuivosSemAzul = 0;
        double somaIdadesAbaixo150 = 0, peso, altura, mediaIdadesAbaixo150, porcentagemAzul;
        int Abaixo150 = 0;
        int totalPessoas = 20, idade;
        char corOlhos, corCabelos;
        
        for (int i = 1; i <= totalPessoas; i++) {
            System.out.println("Pessoa " + i);
            System.out.print("Idade: ");
             idade = sc.nextInt();
            System.out.print("Peso: ");
             peso = sc.nextDouble();
            System.out.print("Altura: ");
             altura = sc.nextDouble();
            System.out.print("Cor dos olhos (A - Azul, P - Preto, V - Verde, C - Castanho): ");
             corOlhos = sc.next().charAt(0);
            System.out.print("Cor dos cabelos (P - Preto, C - Castanho, L - Louro, R - Ruivo): ");
             corCabelos = sc.next().charAt(0);
            
           
            if (idade > 50 && peso < 60) {
                maior50++;
            }
            
            if (altura < 1.50) {
                somaIdadesAbaixo150 += idade;
                Abaixo150++;
            }
            
            if (corOlhos == 'A' || corOlhos == 'a') {
                Azul++;
            }
            
            if (corCabelos == 'R' || corCabelos == 'r' && corOlhos != 'A' || corOlhos != 'a') {
                RuivosSemAzul++;
            }
        }
        
         mediaIdadesAbaixo150 = Abaixo150 == 0 ? 0 : somaIdadesAbaixo150 / Abaixo150;
         porcentagemAzul = (Azul * 100.0) / totalPessoas;
        
        System.out.println("Quantidade de pessoas com idade superior a 50 anos e peso inferior a 60 quilos: " + maior50);
        System.out.println("Média das idades das pessoas com altura inferior a 1,50: " + mediaIdadesAbaixo150);
        System.out.println("Porcentagem de pessoas com olhos azuis: " + porcentagemAzul + "%");
        System.out.println("Quantidade de pessoas ruivas que não possuem olhos azuis: " + RuivosSemAzul);
    }
}