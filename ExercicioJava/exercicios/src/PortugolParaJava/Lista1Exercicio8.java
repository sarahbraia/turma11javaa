package PortugolParaJava;
import java.util.Scanner;
public class Lista1Exercicio8 {

	public static void main(String[] args) {
		/*
		 * 8. O custo ao consumidor de um carro novo é a soma do custo de fábrica com
		 *  a percentagem do distribuidor e dos impostos (aplicados ao custo de fábrica).
		 *  Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%, 
		 *  escrever um sistema que leia o custo de fábrica de um carro e escreva o custo ao 
		 *  consumidor. 
		 */
		
		Scanner leia = new Scanner(System.in);
		
		int custoFabrica;
		double custoCarroNovo =0,percentualDistribuidor=0, impostos=0;
		
		System.out.print(" Digite o custo de fábrica do carro: ");
		custoFabrica=leia.nextInt();
		
		custoCarroNovo=(custoFabrica+(custoFabrica*(28/100))+(custoFabrica*45/100));
		
		System.out.printf("O valor de do custo do carro para o consumidor é de: %.2f", custoCarroNovo);
		
		leia.close();

	}

}
