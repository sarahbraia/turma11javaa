package ExercicioEmSala;

import java.util.Scanner;

public class Testelaço {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		char opc = 'S';
		int numero =0;
		
		while (opc == 'S') {
			System.out.println(numero++);
			System.out.println("Continuia S-sim ou N-não: ");
					opc = leia.next().toUpperCase().charAt(0);
						if (opc=='N') {
							break;
						}
		}
		System.out.println("FIM DE PROGRAMA");
		leia.close();

	}

}
