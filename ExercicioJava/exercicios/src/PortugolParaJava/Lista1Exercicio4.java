package PortugolParaJava;
import java.util.Scanner;
public class Lista1Exercicio4 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int a, b, c, r, s;
		double d;
		
		System.out.print("Digite o valor de a: ");
		a = leia.nextInt();
		System.out.print("Digite o valor de b: ");
		b = leia.nextInt();
		System.out.print("Digite o valor de c: ");
		c = leia.nextInt();
		
		r=((a+b)*(a+b));
		s=((c+b)*(c+b));
		d=((r+s)/2);
		
		System.out.println(" O valor de R=(A+B)^2: "+r);
		System.out.println(" O valor de S=(C+B)^2: "+s);
		System.out.println(" O valor de D=(R+S)/2: "+d);
		
		
		
		leia.close();
		
	}

}
