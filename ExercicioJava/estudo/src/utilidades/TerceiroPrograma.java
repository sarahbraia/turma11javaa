package utilidades;

public class TerceiroPrograma {

	public static void main(String[] args) {
	
		int valor = 10; //TIPO PRIMITIVO
		char opcao = 'X';
		String nome = "SARAH";
		float imposto = 1000.01f;
		double salario = 1000.01;
		
		System.out.print("EXEMPLO DO PRINT\n");
		System.out.println("Nome de usuario: "+nome+ " salário: "+salario);
		System.out.println("TESTE APÓS PRINT LN");
		System.out.printf("Nome do usuário: %s e salário: %.2f com acréscimo de 10%%", nome, salario, salario*1,1);
		
		
	}

}
