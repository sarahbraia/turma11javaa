package ExercicioEmSala;

import java.util.Scanner;

public class Inversao {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		int a=0, b=0;
		System.out.println("LEIA A: ");
		a = leia.nextInt();
		System.out.println("LEIA B: ");
		b = leia.nextInt();
		System.out.printf("\nVALORES ANTES DA INVERSÃO\n A: %d B:%d", a,b);
		a ^= b; // a= a + b
	    b ^= a; // b= a -b
	    a ^= b; // a = a - b

		System.out.printf("\nVALORES APÓS A INVERSÃO\n A: %d B:%d", a,b);
		
		

	}

}
