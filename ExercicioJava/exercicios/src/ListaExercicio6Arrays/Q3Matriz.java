package ListaExercicio6Arrays;

import java.util.Scanner;

public class Q3Matriz {
	public static void main(String[] args) 
	{
		
	int [][]matriz = new int [3][3];
	int cont=0;
	
	Scanner leia=new Scanner (System.in);
	System.out.print("Matriz [3][3] \n ");
	
	for( int linha = 0; linha<3; linha++) {
		for(int coluna=0; coluna<3; coluna++) {
			System.out.printf("Insira o elemento M[%d][%d]", linha+1, coluna+1);
			matriz[linha][coluna]=leia.nextInt();
			if(matriz[linha][coluna] > 10) {
				cont++;
				
			}
		}
	}
	
	System.out.println("A matriz ficou: \n");
	for( int linha = 0; linha<3; linha++) {
			for(int coluna=0; coluna<3; coluna++) {
				System.out.printf("\t %d \t", matriz[linha][coluna]);
				
			}
			System.out.println();
	}
	System.out.println("A matriz possui "+cont+ " valores maiores que dez");
	}
}
