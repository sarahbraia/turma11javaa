package ListaExercicio5Lacorepeticao;

import java.util.Scanner;

public class Q6DoWhile 
{

	public static void main(String[] args) 
	{
		Scanner leia=new Scanner (System.in);
		/*
		 * Escrever um programa que receba v�rios n�meros inteiros no teclado.
		 *  E no final imprimir a m�dia dos n�meros m�ltiplos de 3. Para sair digitar 
		 *  0(zero).(DO...WHILE)
		 */
		int a, soma=0, contador=0;
		int cont;
		double media =0;
		System.out.println("Digite um n�mero");
		do 
		{
			
			a = leia.nextInt();
			soma += a;
			contador++ ;
			
		}
			while(a!=0);
		cont = contador -1; 
		media = (soma/cont);
		
		System.out.printf("SOMA %d CONTADOR %d M�DIA %.2f\n", soma, cont, media);
		leia.close();
	}

}
