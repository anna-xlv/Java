/******************************************************************************

SOMA DE NÚMEROS DE 1 A 10

*******************************************************************************/
public class soma1a10
{
	public static void main(String[] args) {
		int soma = 0;
		int num = 1;
		
		while (num <= 10){
		    soma += num;
		    num++;
		}
		
		System.out.println("A soma os números de 1 a 10 é: " + soma);
	}
}
