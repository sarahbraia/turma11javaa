package ExercicioEmSala;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		int num;
		
		for (int i =1; i<=10; i++) {
			System.out.printf("\n\n--Tabuada do %d--",i);
			for (int j =1; j<=10; j++) {
				num= i*j;
			System.out.printf("\n %d = %d * %d",num,i, j);
			}
		}
		
		

	}

}
