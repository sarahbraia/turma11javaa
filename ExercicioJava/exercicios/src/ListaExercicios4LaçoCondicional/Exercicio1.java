package ListaExercicios4LaçoCondicional;
import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) 
	{
	Scanner leia=new Scanner (System.in);
	/*
	 * 1- Faça um programa que receba três inteiros e 
	 * diga qual deles é o maior.
	 */
		int a,b,c; 
		
		System.out.print("Digite o numero A:");
		a = leia.nextInt();
		System.out.print("Digite o numero B:");
		b = leia.nextInt();
		System.out.print("Digite o numero C:");
		c = leia.nextInt();
		
		if ((a>b)&&(a>c)){
			System.out.printf("O numero A %d é o maior número.", a);
		}
		else if ((b>c)&&(b>c)) {
			System.out.printf("O numero B %d é o maior número.", b);
		}
		else {
			System.out.printf("O numero C %d é o maior número.", c);
		}
		
	}
}

