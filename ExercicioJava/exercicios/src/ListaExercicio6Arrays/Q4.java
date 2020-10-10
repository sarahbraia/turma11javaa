package ListaExercicio6Arrays;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		int [][]matriz = new int [2][2];
		int [][]matriz2 = new int [2][2];
		int [][]matrizk = new int [2][2];
		int soma=0;
		int opc;
		int subtracao=0;
		int somacte=0, cte;
		int somacte2=0;
		
		Scanner leia=new Scanner (System.in);
		System.out.print("Matriz1  [2][2] \n ");
		
		for( int linha = 0; linha<2; linha++) {
			for(int coluna=0; coluna<2; coluna++) {
				System.out.printf("Insira o elemento M1[%d][%d]", linha+1, coluna+1);
				matriz[linha][coluna]=leia.nextInt();
				
			}
		}
		
		
		System.out.print("Matriz2  [2][2] \n ");
		for( int i = 0; i<2; i++) {
			for(int j=0; j<2; j++) {
				System.out.printf("Insira o elemento M2[%d][%d]", i+1, j+1);
				matriz2[i][j]=leia.nextInt();
				
			}
		}
		System.out.println("Digite 1 somar as duas matrizes ");
		System.out.println("Digite 2 subtrair a primeira matriz da segunda  ");
		System.out.println("Digite 3 adicionar uma constante as duas matrizes ");
		System.out.println("Digite 4 imprimir as matrizes ");
		opc = leia.nextInt();
		
		
		System.out.println("A matriz 1 ficou: \n");
		for( int linha = 0; linha<2; linha++) {
				for(int coluna=0; coluna<2; coluna++) {
					System.out.printf("\t %d \t", matriz[linha][coluna]);
					
				}
				System.out.println();
		}
		
		System.out.println("A matriz 2 ficou: \n");
		for( int i = 0; i<2; i++) {
				for(int j=0; j<2; j++) {
					System.out.printf("\t %d \t", matriz2[i][j]);
					
				}
				System.out.println();
		}
		
				
		//SOMA DE MATRIZ
		if (opc ==1) {
			for (int k = 0; k < matriz.length; k++) {
	            for (int l = 0; l < matriz2.length; l++) {

	                soma = matriz[k][l] + matriz2[k][l];
	            	System.out.printf("\t %d \t", soma);

	            }
	            System.out.println();
	        }
		}
		//subtração matriz
		else if (opc == 2) {
			for (int k = 0; k < matriz.length; k++) {
	            for (int l = 0; l < matriz2.length; l++) {

	                subtracao = matriz[k][l] - matriz2[k][l];
	            	System.out.printf("\t %d \t", subtracao);

	            }
	            System.out.println();
	        }
		}
		
		//ADD CONSTANTE A MATRIZ
		else if (opc==3)
		{
			for( int linha = 0; linha<2; linha++) {
				for(int coluna=0; coluna<2; coluna++) {
					System.out.printf("Insira o elemento M1[%d][%d]", linha+1, coluna+1);
					matrizk[linha][coluna]=cte;
					
				}
			}
			for (int k = 0; k < matriz.length; k++) {
	            for (int l = 0; l < matriz2.length; l++) {

	                somacte = matriz[k][l] + matrizk[k][l];
	            	System.out.printf("\t %d \t", somacte);

	            }
	            System.out.println();
	        }
		}
		
		for (int k = 0; k < matriz.length; k++) {
            for (int l = 0; l < matriz2.length; l++) {

                somacte2 = matriz2[k][l] + matrizk[k][l];
            	System.out.printf("\t %d \t", somacte2);

            }
            System.out.println();
        }
		
		
		
		}
	}
