/******************************************************************************

15

*******************************************************************************/
public class ex015 {
    public static void main(String[] args) {
       int soma = 0;
        
        for (int i = 1; i <= 15; i++) {
            soma += i; 
            System.out.println("Soma número " + i + ": " + soma);
        }
    }
}