package ListaExercicios4LaçoCondicional;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner leia=new Scanner (System.in);
		
		/*
		 * 4- Faça um programa em que permita a entrada de um número 
		 * qualquer e exiba se este número é par ou ímpar. Se for par 
		 * exiba também a raiz quadrada do mesmo; se for ímpar exiba o 
		 * número elevado ao quadrado.
		 */
			
	
			int valor=0;
			int impar;
			double par;
			
			System.out.print("Digite um numero positivo acima de 0: ");
			valor = leia.nextInt();
			
			impar=valor*valor;
			par=Math.sqrt(valor);
			System.out.print((valor <=0 )?"VC DIGITOU ZERO OU NEGATIVO!!!":((valor%2)==0)?"VALOR "+valor+" É PAR \nlogo a raiz quadrada desse número é: "+par:"VALOR "+valor+" É IMPAR \nlogo seu quadrado é:"+impar);
			
			
			leia.close();
		}
	}