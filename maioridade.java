/******************************************************************************

02

*******************************************************************************/
import java.util.Scanner; 
public class maioridade
{
	public static void main(String[] args) {
		double a, b, soma; 
		Scanner ss = new Scanner(System.in);
		
	
		System.out.println("Infome sua idade: ");
		a = ss.nextDouble();
		
	
	    if (a >= 18) 
            System.out.println("Maior de idade");
         else 
            System.out.println("Menor de idade");
        
    }
}