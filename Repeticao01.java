/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;
public class Repeticao01
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n;
	    
		System.out.print("Digite um número maior que zero: ");
		n= sc.nextInt();
		
		for (int i=0; i <= n ; i++)
		 System.out.println("Número "+i);
	}
}
