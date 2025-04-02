/******************************************************************************

23

*******************************************************************************/
import java.util.Scanner;

public class ex023 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double somaPeso1a10 = 0, somaPeso11a20 = 0, somaPeso21a30 = 0, somaPeso31Mais = 0,  peso;
        int conta1a10 = 0, conta11a20 = 0, conta21a30 = 0, conta31Mais = 0, idade;
        
        for (int i = 1; i <= 8; i++) {
            System.out.println("Pessoa " + i);
            System.out.print("Idade: ");
             idade = sc.nextInt();
            System.out.print("Peso: ");
             peso = sc.nextDouble();
            
            if (idade >= 1 && idade <= 10) {
                somaPeso1a10 += peso;
                conta1a10++;
            } else if (idade >= 11 && idade <= 20) {
                somaPeso11a20 += peso;
                conta11a20++;
            } else if (idade >= 21 && idade <= 30) {
                somaPeso21a30 += peso;
                conta21a30++;
            } else if (idade > 30) {
                somaPeso31Mais += peso;
                conta31Mais++;
            }
        }
        
        if (conta1a10 > 0) System.out.println("Média de peso da faixa 1 a 10 anos: " + (somaPeso1a10 / conta1a10));
        if (conta11a20 > 0) System.out.println("Média de peso da faixa 11 a 20 anos: " + (somaPeso11a20 / conta11a20));
        if (conta21a30 > 0) System.out.println("Média de peso da faixa 21 a 30 anos: " + (somaPeso21a30 / conta21a30));
        if (conta31Mais > 0) System.out.println("Média de peso da faixa 31 anos ou mais: " + (somaPeso31Mais / conta31Mais));
    }
}
