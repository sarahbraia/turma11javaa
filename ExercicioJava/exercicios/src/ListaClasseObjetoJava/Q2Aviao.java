package ListaClasseObjetoJava;

import java.util.Scanner;

import entidades.DadosAviao;

public class Q2Aviao {
	public static void main(String[] args) {
	Scanner Leia = new Scanner (System.in);
	 
	 DadosAviao primeiro = new DadosAviao(); //ctr +shift+ O
	 char info = ' ';
	 
	 System.out.println ("Digite o modelo do Avião: ");
	 primeiro.modelo = Leia.next().toUpperCase();
	 System.out.println ("Qual o porte do avião? P-pequeno, M-Medio, G-grande ");
	 primeiro.porte = Leia.next().toUpperCase().charAt(0);
	 System.out.println ("digite a velocidade do avião?  km/h");
	 primeiro.velocidade = Leia.nextInt();
	 System.out.println ("Digite o peso do avião em toneladas: ");
	 primeiro.peso = Leia.nextInt();
	 System.out.println ("Digite o numero de passageiros queo o avião consegue transportar: ");
	 primeiro.passageiros = Leia.nextInt();
	 
	 System.out.println("\n\nDADOS DO AVIÃO: ");
	 System.out.println("MODELO "+primeiro.modelo);
	 System.out.println("PORTE "+(primeiro.porte=='P'?"PEQUENO": (primeiro.porte=='M')?"MÉDIO":"GRANDE"));
	 System.out.println("Velocidade"+primeiro.velocidade);
	 System.out.println("Peso: "+primeiro.peso);
	 System.out.println("Passageiro"+primeiro.passageiros);
	 
	}
}


