package ExercicioEmSala;
import java.util.Scanner;

public class ExemploTrue {
	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		boolean feminino; // feminino ou não feminino
		char opc;
		feminino=true;
		
		feminino = true;
		System.out.print("Você é feminino S/N: ");
		opc = leia.next().toUpperCase().charAt(0);
		
		if(opc=='N') 
		{
			feminino = false;
		}
		//se(1 ==1 )
		if(feminino)
		{
			System.out.print("Você é feminina! ");
		}
		if(true) {
			System.out.println("É verdadeiro não sei pq");
		}
				
		leia.close();
		
		
	}
}
