package ListaExercicios4La�oCondicional;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner leia=new Scanner (System.in);
		
		/*
		 * 4- Fa�a um programa em que permita a entrada de um n�mero 
		 * qualquer e exiba se este n�mero � par ou �mpar. Se for par 
		 * exiba tamb�m a raiz quadrada do mesmo; se for �mpar exiba o 
		 * n�mero elevado ao quadrado.
		 */
			
	
			int valor=0;
			int impar;
			double par;
			
			System.out.print("Digite um numero positivo acima de 0: ");
			valor = leia.nextInt();
			
			impar=valor*valor;
			par=Math.sqrt(valor);
			System.out.print((valor <=0 )?"VC DIGITOU ZERO OU NEGATIVO!!!":((valor%2)==0)?"VALOR "+valor+" � PAR \nlogo a raiz quadrada desse n�mero �: "+par:"VALOR "+valor+" � IMPAR \nlogo seu quadrado �:"+impar);
			
			
			leia.close();
		}
	}