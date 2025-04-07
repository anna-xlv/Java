/******************************************************************************

atividade 29

*******************************************************************************/
import java.util.Scanner;

public class ex29 {
 public static void main (String[] args) {
     Scanner ler = new Scanner(System.in);

     int numdeEstudante, pesodoEstudente, mediaPeso = 0, pesoTotal = 0;

     System.out.println("Qual o numero de alunos cadastrados na academia?");
     numdeEstudante = ler.nextInt();

     int i = 1;

     while ( i <= numdeEstudante) {
     System.out.println("Qual o peso do " + i +"° aluno(a)?");
     pesodoEstudente = ler.nextInt();

    pesoTotal += pesodoEstudente;
    i++;
     }

     mediaPeso = pesoTotal / numdeEstudante;
     System.out.println("A média do peso dos alunos é de: " + mediaPeso);
    }
}