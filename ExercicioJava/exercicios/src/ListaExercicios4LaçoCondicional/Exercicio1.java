package ListaExercicios4La�oCondicional;
import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) 
	{
	Scanner leia=new Scanner (System.in);
	/*
	 * 1- Fa�a um programa que receba tr�s inteiros e 
	 * diga qual deles � o maior.
	 */
		int a,b,c; 
		
		System.out.print("Digite o numero A:");
		a = leia.nextInt();
		System.out.print("Digite o numero B:");
		b = leia.nextInt();
		System.out.print("Digite o numero C:");
		c = leia.nextInt();
		
		if ((a>b)&&(a>c)){
			System.out.printf("O numero A %d � o maior n�mero.", a);
		}
		else if ((b>c)&&(b>c)) {
			System.out.printf("O numero B %d � o maior n�mero.", b);
		}
		else {
			System.out.printf("O numero C %d � o maior n�mero.", c);
		}
		
	}
}

