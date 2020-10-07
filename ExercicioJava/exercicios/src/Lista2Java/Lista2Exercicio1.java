package Lista2Java;
import java.util.Scanner;

public class Lista2Exercicio1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		int pesotomate, ex;
		int multa = 0;
		
		System.out.print("Escreva o peso do saco de tomate: ");
		pesotomate = leia.nextInt();
		
		multa= ((pesotomate - 50)*4);
		ex= (pesotomate - 50);
		
		if (pesotomate >50)
		{
			System.out.printf("\n Peso de tomates P: %d", pesotomate);
			System.out.printf("\n Excesso de peso dos tomates E: : %d", ex);
			System.out.printf("\n O valor da multa M: %d", multa);
		}
		else
		{
			System.out.printf("\n Peso de tomates P: %d", pesotomate);
			System.out.println("\n Excesso de peso dos tomates E: ZERO ");
			System.out.println("O valor da multa M: ZERO ");			
		}
		
		leia.close();
	}

}
