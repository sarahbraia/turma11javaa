package ExercicioEmSala;
import java.util.Scanner;

public class ExemploTrue {
	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		boolean feminino; // feminino ou n�o feminino
		char opc;
		feminino=true;
		
		feminino = true;
		System.out.print("Voc� � feminino S/N: ");
		opc = leia.next().toUpperCase().charAt(0);
		
		if(opc=='N') 
		{
			feminino = false;
		}
		//se(1 ==1 )
		if(feminino)
		{
			System.out.print("Voc� � feminina! ");
		}
		if(true) {
			System.out.println("� verdadeiro n�o sei pq");
		}
				
		leia.close();
		
		
	}
}
