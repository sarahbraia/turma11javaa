package ListaExercicio6Arrays;

public class Q1 {
	public static void main(String[] args) {
		int [] a = new int [6];	
		int [] a1 = {1, 0, 5, -2, -5, 7};
		int soma=0;
		int [] b = new int [6];
		int [] c = new int [6];
		int [] d = new int [6];
		
		/*
		 * (a) Atribua os seguintes valores a esse vetor: 1, 0, 5, -2, -5, 7. 
		 * (b) Armazene em uma variável inteira (simples) a soma entre os valores das posições A[0], A[1] e A[5] do vetor e mostre na tela esta soma. 
		(c) Modifique o vetor na posição 4, atribuindo a esta posição o valor 100. 
		(d) Mostre na tela cada valor do vetor A, um em cada linha.
		 */
		
		System.out.print("1- Atribua os seguintes valores a esse vetor: 1, 0, 5, -2, -5, 7. \n");
		for (int i=0; i<=6; i++) {
			a[i]=a1[i];
			
			System.out.print("  "+a1[i]);
		}
		b[1]=a[0];
		c[1]=a[1];
		d[1]=a[5];
		
				
		soma = b[1]+c[1]+d[1];
		System.out.print("2- soma entre os valores das posições A[0], A[1] e A[5] do vetor "+soma);
		
		a[4] = 120;
		for (int j=0; j<=6; j++) {
			System.out.print("3-Modifique o vetor na posição 4, atribuindo a esta posição o valor 100."+a[j]);
			
		}
		
		
		
		
		

		
		

	}

}
