package ListaExercicios4LaçoCondicional;
import java.util.Scanner;
public class Exercicio2 {

	public static void main(String[] args) {
	/*
	 * 2- Faça um programa que entre com três números e 
	 * coloque em ordem crescente.
	 */
		Scanner leia=new Scanner (System.in);
		
		int a,b,c; 
		
		System.out.print("Digite o numero A:");
		a = leia.nextInt();
		System.out.print("Digite o numero B:");
		b = leia.nextInt();
		System.out.print("Digite o numero C:");
		c = leia.nextInt();
		
		if(a>b && b>c){
			System.out.printf("%d > %d > %d",a,b,c);		
		}
		else if (b>a && a>c) {
			System.out.printf("%d > %d > %d",b,a,c);
		}
		else if (c>b && b>a) {
			System.out.printf("%d > %d > %d",c,b,a);
		}
		else if (a>c && c>b) {
			System.out.printf("%d > %d > %d",a,c,b);
		}
		else if (b>c && c>a) {
			System.out.printf("%d > %d > %d",b,c,a);
		}
		else {
			System.out.printf("%d > %d > %d",c,a,b);
		}
		
		leia.close();
	}

}
