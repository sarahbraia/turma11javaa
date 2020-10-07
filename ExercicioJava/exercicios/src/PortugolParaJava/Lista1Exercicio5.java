package PortugolParaJava;
import java.util.Scanner;

public class Lista1Exercicio5 {

	public static void main(String[] args) 
	{
		/*
		 * Faça um sistema que leia as 3 notas de um aluno e 
		 * calcule a média final deste aluno. Considerar que a 
		 * média é ponderada e que o peso das notas é: 2,3 e 5, respectivamente. 
		 */
		Scanner leia = new Scanner(System.in);
		
		int nota1, nota2, nota3;
		double media;
		
		System.out.print("Digite o valor de nota 1: ");
		nota1 = leia.nextInt();
		System.out.print("Digite o valor de nota 2: ");
		nota2 = leia.nextInt();
		System.out.print("Digite o valor de nota 3: ");
		nota3 = leia.nextInt();
		
		media =(((nota1*2)+(nota2*3)+(nota3*5))/10);
		
		System.out.printf("O valor da média ponderada é: %.2f", media);
		
		leia.close();	
	
	}
	

}
