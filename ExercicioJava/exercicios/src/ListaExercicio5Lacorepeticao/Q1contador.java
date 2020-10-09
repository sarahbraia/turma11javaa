package ListaExercicio5Lacorepeticao;

import java.util.Scanner;

public class Q1contador {

	public static void main(String[] args) {
		Scanner leia=new Scanner (System.in);
		
		
		double div=0;
		
		System.out.print("\n Os número divididos por 11 cm resto 5 são:");
		
		for (int i=1000; i<=1999; i++) {
			div = i%11;
						
			if(div == 5) {
				
				System.out.printf("\n %d", i);
			}
		
			
		}

	}

}
