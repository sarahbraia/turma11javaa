package ExercicioEmSala;

import java.util.Scanner;

public class NotasAlunos {
	
	public static void main(String[] args) {
		Scanner leia=new Scanner (System.in);
		
		
		String[] nome = {"Bruna dos Santos", "Bruno Correia da Costa", "Bruno de Freitas Sousa", "Carla Cristina Conceição de Paula", "Christian Garcia Amantino", "Cleiton Ortega dos Santos", "Debora Miranda Carmona", "Everton Luiz Rosário de Oliveira", "Gabriel Reis Ritter", "Gildenor Junior da Silva Costa", "Guilherme Marcionilo Pedroso do Rosario Silva", "Herick Willians Canhete Rocha", "Jacqueline Alves Barbosa", "João Victor dos Santos Rigoleto", "Jonas De Oliveira Santos", "Jonathan Cavalcanti De Paula", "Juliana Cavalaro de Oliveira", "Karina Soares Lima", "Larissa Meira Dominguez", "Leonardo Iamur Terra", "Lysandro Andrade Martin", "Matheus Araujo de moraes", "Matheus Fernandes Rodrigues", "Matheus Trindade Torok", "Mônica dos santos ribeiro", "Natália Lopes moreno", "Phelipe Almeida de Souza", "Rafaela de Albuquerque", "Ricardo Martins Corrêa", "Sarah Lidia De Oliveira Braia", "Stefanie Dias Costa", "Tiago Diniz Gomes", "Victor Augusto de Souza Tavares", "Vivian Rodrigues Nakano", "Washington pereira dos santos", "Wellington Vieira", "Wesley Bueno da Silva", "Yago Tonoli Domingues", "Zaine de Queiros Jesus"};
		int [] nota= new int [39];
		int [] codigo = new int [39];
		
		System.out.println("Digite o código do aluno");
		codigo[] = leia.nextInt();
		System.out.println("Digite a nota do aluno");
		nota = leia.nextInt();
		
		System.out.println("CODIGO  ALUNO  NOTA");
		//System.out.println(codigo []+"  "+nome[]+"  "+nota);
		
		leia.close();
	}
	
	public void adicionar(int nota)
	{
		int k = -1;	
		for(int i=0; i < this.contatos.length; i++){
			if(this.contatos[i] != null){
				k += 1;
			
	}

}
