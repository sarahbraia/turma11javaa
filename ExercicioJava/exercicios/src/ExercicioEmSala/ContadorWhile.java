package ExercicioEmSala;

import java.util.Scanner;

public class ContadorWhile {

	public static void main(String[] args) {
		Scanner leia=new Scanner (System.in);
		
		int contador =1;
		char opc ='S';
		
		do {
			System.out.println(contador);
			System.out.println("continua sim ou nao S ou N: ");
			opc = leia.next().toUpperCase().charAt(0);
			contador++;
		}
		while(opc == 'S');

	}

}
