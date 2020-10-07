package PortugolParaJava;

import java.util.Scanner;

public class Lista1Exercicio2 {

public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int diaAniversario, idadeEmAnos, idadeEmMes, idadeEmDias;
		
		System.out.print("Digite sua idade em dias: ");
		diaAniversario = leia.nextInt();
		
		idadeEmAnos = (diaAniversario / 365); //calculando a idade em anos
		idadeEmMes = ((diaAniversario % 365) / 30);
		idadeEmDias = ((diaAniversario % 365) % 30);
		
		System.out.println("Sua idade em anos é: " + idadeEmAnos);
		System.out.println("Sua idade em meses é: " + idadeEmMes);
		System.out.println("Sua idade em dias é: " + idadeEmDias);
		
	}
}