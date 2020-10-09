package ListaExercicio5Lacorepeticao;

import java.util.Scanner;

public class Q2PareImpar {

	public static void main(String[] args) {
		Scanner leia=new Scanner (System.in);
		
		int resto;
		for(int i=0; i<=10; i++) {
			resto = i%2;
			if (resto ==0) {
				System.out.printf("\n O numero %d é PAR", i);
			}
			else {
				System.out.printf("\n O numero %d é IMPAR", i);
			}
		}

	}

}
