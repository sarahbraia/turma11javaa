package Aplicacoes;

import entidades.Professor;
import java.util.Scanner;
import entidades.Aluno;

public class CadEscolar {

	public static void main(String[] args) {
		 Scanner Leia = new Scanner (System.in);
		 
		 Professor primeiro = new Professor(); //ctr +shift+ O
		 Aluno segundo = new Aluno();
		 char info = ' ';
		 
		 System.out.println ("Digite o nome do professor: ");
		 primeiro.nome = Leia.next().toUpperCase();
		 System.out.println ("Digite o sexo M-Masculino, F-feminino ou O-outros: ");
		 primeiro.sexo = Leia.next().toUpperCase().charAt(0);
		 System.out.println ("Digite a especialidade do professor: ");
		 primeiro.especialidade = Leia.next().toUpperCase();
		 System.out.println ("Digite o ano de nascimento do  professor: ");
		 primeiro.anoNascimento = Leia.nextInt();
		 System.out.println("O Professor é F-fixo ou C-convidado? ");
		 info = Leia.next().toUpperCase().charAt(0);
		 
		 if(info=='C') {
			 primeiro.convidado = true;
		 } else {
			 primeiro.convidado = false;
		 }
		 
		 System.out.println("DADOS DO PRIMEIRO PROFESSOR: ");
		 System.out.println("Nome: "+primeiro.nome);
		 System.out.println("Sexo: "+(primeiro.sexo=='F'?"Feminio": (primeiro.sexo=='M')?"Masculino":"Outros"));
		 System.out.println(primeiro.especialidade);
		 System.out.println("Idade: "+(2020-primeiro.anoNascimento));
		 
		 System.out.println ("\n \n Digite o nome do aluno: ");
		 segundo.nomeAluno = Leia.next().toUpperCase();
		 System.out.println ("Digite o sexo M-Masculino, F-feminino ou O-outros: ");
		 segundo.sexoAluno = Leia.next().toUpperCase().charAt(0);
		 System.out.println ("Digite a curso do Aluno: ");
		 segundo.curso = Leia.next().toUpperCase();
		 System.out.println ("Digite o ano de nascimento do  Aluno: ");
		 segundo.anoNascimentoAluno = Leia.nextInt();
		 System.out.println ("Digite a nota geral do  Aluno: ");
		 segundo.notaGeralAluno = Leia.nextInt();
		
		 
		 System.out.println("DADOS DO ALUNO: ");
		 System.out.println("Nome: "+segundo.nomeAluno);
		 System.out.println("Sexo: "+(segundo.sexoAluno=='F'?"Feminio": (segundo.sexoAluno=='M')?"Masculino":"Outros"));
		 System.out.println(segundo.curso);
		 System.out.println("Idade: "+(2020-segundo.anoNascimentoAluno));
		 System.out.println("Nota: "+segundo.notaGeralAluno);
		 System.out.println("O aluno está: ");
		 if(segundo.notaGeralAluno<5) {
			 System.out.print("REPROVADO");
		 }
		 else {
			 System.out.print("APROVADO");
		 }

	}

}
