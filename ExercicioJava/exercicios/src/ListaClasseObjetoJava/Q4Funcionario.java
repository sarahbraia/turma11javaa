package ListaClasseObjetoJava;

import java.util.Scanner;

import entidades.Funcionario;

public class Q4Funcionario {
	public static void main(String[] args) {
	Scanner Leia = new Scanner (System.in);
	 
	 Funcionario primeiro = new Funcionario(); //ctr +shift+ O
	 char info = ' ';
	 
	 System.out.println ("Digite o nome do FUNCIONARIO: ");
	 primeiro.nomef = Leia.next().toUpperCase();
	 System.out.println ("Digite o sexo M-Masculino, F-feminino ou O-outros: ");
	 primeiro.sexof = Leia.next().toUpperCase().charAt(0);
	 System.out.println ("Digite estado civil: ");
	 primeiro.estadoCivilf = Leia.next().toUpperCase();
	 System.out.println ("Digite o ano de nascimento: ");
	 primeiro.anoNascimentof = Leia.nextInt();
	 System.out.println ("Digite a area do funcionário: ");
	 primeiro.area = Leia.next();
	 System.out.println ("Digite o nome do supervisor do funcionário: ");
	 primeiro.supervisor = Leia.next();
	 
	 System.out.println("\n\nDADOS DO funcionario: ");
	 System.out.println("Nome: "+primeiro.nomef);
	 System.out.println("Sexo: "+(primeiro.sexof=='F'?"Feminio": (primeiro.sexof=='M')?"Masculino":"Outros"));
	 System.out.println(primeiro.estadoCivilf);
	 System.out.println("Idade: "+(2020-primeiro.anoNascimentof));
	 System.out.println("Area:"+primeiro.area);
	 System.out.println("Supervisor:"+primeiro.supervisor);
	 
	}
}
