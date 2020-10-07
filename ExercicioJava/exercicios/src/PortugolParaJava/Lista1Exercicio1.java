package PortugolParaJava;
import java.util.Scanner;

public class Lista1Exercicio1 {
	public static void main(String[] args) {
		
		
		
		Scanner leia = new Scanner(System.in);
		int ano , messes , dias, totalDias=0;
		
		System.out.println("Informe Quantos Anos , Messes e Dias de vida  você tem:   : ");
		
		System.out.print("  Quantos Anos : ");
		ano = leia.nextInt();
		
		System.out.print("  Quantos Messes : ");
		messes = leia.nextInt();
		
		System.out.print("  Quantos Dias : ");
		dias = leia.nextInt();
		
		totalDias = totalDias + (ano*365) + (messes*30) + dias;
		
		System.out.print(" Sua Idade em Dias é :" + totalDias);
		
		
		
		
		
		
		leia.close();
		
		
	}
}