package ListaClasseObjetoJava;
import java.util.Scanner;

import entidades.Cliente;

public class Q1Cliente {

	public static void main(String[] args) {
	Scanner Leia = new Scanner (System.in);
	 
	 Cliente primeiro = new Cliente(); //ctr +shift+ O
	 char info = ' ';
	 
	 System.out.println ("Digite o nome do Cliente: ");
	 primeiro.nomec = Leia.next().toUpperCase();
	 System.out.println ("Digite o sexo M-Masculino, F-feminino ou O-outros: ");
	 primeiro.sexoc = Leia.next().toUpperCase().charAt(0);
	 System.out.println ("Digite estado civil: ");
	 primeiro.estadoCivil = Leia.next().toUpperCase();
	 System.out.println ("Digite o ano de nascimento: ");
	 primeiro.anoNascimentoc = Leia.nextInt();
	 System.out.println ("Digite o CPF do cliente: ");
	 primeiro.cpf = Leia.next();
	 
	 System.out.println("\n\nDADOS DO PRIMEIRO CLIENTE: ");
	 System.out.println("Nome: "+primeiro.nomec);
	 System.out.println("Sexo: "+(primeiro.sexoc=='F'?"Feminio": (primeiro.sexoc=='M')?"Masculino":"Outros"));
	 System.out.println(primeiro.estadoCivil);
	 System.out.println("Idade: "+(2020-primeiro.anoNascimentoc));
	 System.out.println("CPF"+primeiro.cpf);
	 
	}
}
