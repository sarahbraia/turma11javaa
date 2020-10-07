package PortugolParaJava;
import java.util.Scanner;
public class Lista1Exercicio6 {

	public static void main(String[] args)
	{
		/*
		 * Construa um programa em c que, tendo como dados de entrada 
		 * dois pontos quaisquer no plano, P(x1, y1) e P(x2, y2), escreva
		 * a distância entre eles. A fórmula que efetua tal cálculo é: 
		 */
		Scanner leia = new Scanner(System.in);
		
		int x1;
		int x2, y1, y2, x=0, y=0;
		double d;
		int numero=0;
		double raiz=0;
		
		System.out.print(" Digite o valor de  x1:");
		x1=leia.nextInt();
		System.out.print(" Digite o valor de  y1:");
		y1=leia.nextInt();
		System.out.print(" Digite o valor de  x2:");
		x2=leia.nextInt();
		System.out.print(" Digite o valor de  y2:");
		y2=leia.nextInt();
		
		x=((x2-x1)*(x2-x1));
		y=((y2-y1)*(y2-y1));
		numero=(x+y);
		raiz=(Math.sqrt(numero));
		
		System.out.printf("O valor da média ponderada é: %.2f", raiz);
		
		leia.close();

		
	
	}

}
