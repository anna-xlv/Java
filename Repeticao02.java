/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;
public class Repeticao02
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n;
	    
		System.out.print("Digite a tabuada : ");
		n= sc.nextInt();
		
		for (int i=1; i <= 10 ; i++)
		 System.out.println(n+" x "+ i + " = " +(i*n));
	}
}