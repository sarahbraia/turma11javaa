package PortugolParaJava;
import java.util.Scanner;

public class Lista1Exercicio7 {

	public static void main(String[] args) {
		Scanner tec = new Scanner (System.in);
		
		int a , b , c , d , E , f;
		double x , y;
		
		System.out.print(" informe o Valor de A : ");
		a = tec.nextInt();
		System.out.print(" informe o Valor de B : ");
		b = tec.nextInt();
		System.out.print(" informe o Valor de C : ");
		c = tec.nextInt();
		System.out.print(" informe o Valor de D : ");
		d = tec.nextInt();
		System.out.print(" informe o Valor de E : ");
		E = tec.nextInt();
		System.out.print(" informe o Valor de F : ");
		f = tec.nextInt();
		
		
		 x = ( ( (c*E) - (b*f) ) / ( (a*E) - (b*d) ) );
		 
		 y =  ( ( (a*f) - (c*d) ) / ( (a*E) - (b*d) ) );
		 
		 System.out.printf("O valor de x é de: %.2f", x);
		 System.out.printf("O valor de y é de: %.2f", y);		
		 
		 tec.close();


	}

}
