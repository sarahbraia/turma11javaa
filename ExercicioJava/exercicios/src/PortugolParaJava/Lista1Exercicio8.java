package PortugolParaJava;
import java.util.Scanner;
public class Lista1Exercicio8 {

	public static void main(String[] args) {
		/*
		 * 8. O custo ao consumidor de um carro novo � a soma do custo de f�brica com
		 *  a percentagem do distribuidor e dos impostos (aplicados ao custo de f�brica).
		 *  Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%, 
		 *  escrever um sistema que leia o custo de f�brica de um carro e escreva o custo ao 
		 *  consumidor. 
		 */
		
		Scanner leia = new Scanner(System.in);
		
		int custoFabrica;
		double custoCarroNovo =0,percentualDistribuidor=0, impostos=0;
		
		System.out.print(" Digite o custo de f�brica do carro: ");
		custoFabrica=leia.nextInt();
		
		custoCarroNovo=(custoFabrica+(custoFabrica*(28/100))+(custoFabrica*45/100));
		
		System.out.printf("O valor de do custo do carro para o consumidor � de: %.2f", custoCarroNovo);
		
		leia.close();

	}

}
