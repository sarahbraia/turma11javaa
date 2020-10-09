package ListaExercicio5Lacorepeticao;
import java.util.Scanner;
public class Q3While {

	public static void main(String[] args) {
		Scanner leia=new Scanner (System.in);
		
		int idade;
		int contadormenor=0, contadormaior=0;
		
		System.out.print("Digite sua idade:");
		idade = leia.nextInt();
		
		while (idade != -99) {
			System.out.print("Digite sua idade:");
			idade = leia.nextInt();
			
			if(idade<=21) {
				contadormenor++;				
			}
			else if(idade >=50) {
				contadormaior++;
			}
		}
		System.out.printf("\n Total de pessoas com menos de 21 anos: %d", contadormenor);
		System.out.printf("\n Total de pessoas com mais de 50 anos: %d", contadormaior);
		
		
				
		leia.close();
		

	}

}
