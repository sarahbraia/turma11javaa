package ListaExercicio5Lacorepeticao;

import java.util.Scanner;

public class Q5DOWHILE {
	public static void main(String[] args) {
	Scanner leia=new Scanner (System.in);
	
	int a, contador=0;
	
	do {
		System.out.println("Digite um número:");
		a = leia.nextInt();
		
		contador++;
	}
		while(a!=0);
	System.out.println("FIM DO PROGRAMA");
	leia.close();
}
}
