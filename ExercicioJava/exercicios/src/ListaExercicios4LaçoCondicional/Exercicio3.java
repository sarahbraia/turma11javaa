package ListaExercicios4LaçoCondicional;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner leia=new Scanner (System.in);
/*
 * 3- Faça um programa que receba a idade de uma pessoa 
 * e mostre na saída em qual categoria ela se encontra:
 */
		int idade;
		
		System.out.print("Digite sua idade:");
		idade = leia.nextInt();
		
		if((idade>=10)&&(idade<=14)) {
			System.out.println("Infantil");
		}
		else if ((idade>=15)&&(idade<=17)) {
			System.out.println("Juvenil");
		}
		else if ((idade>=18)&&(idade<=25)){
			System.out.println("Adulto");
		}
		else {
			System.out.println("fora da faixa etária estabelecida");
		}
		leia.close();
	}

}
