package ListaExercicio5Lacorepeticao;

import java.util.Random;
import java.util.Scanner;

public class Q4While {

	public static void main(String[] args) {
		Scanner leia=new Scanner (System.in);
		Random gerador = new Random();
		
		//instância um objeto da classe Random usando o construtor padrão
		int pessoa=0, idade, sexo, personalidade;
		int f = 0,m=0,o=0;
		int fc=0; //mulher calma
		int fn=0; //mulher nervosa
		int fa=0; //mulher agressiva
		int hc=0; // homem calmo
		int hn=0; //homem nervoso
		int ha=0; //homem agressivo
		int oc=0; // outro calmo
		int on=0; //outro nervoso
		int oa=0; //outro agressivo
		int pessoacalma=0, pessoasnervosas=0, pnm=0;
		int fnm=0, hnm=0, onm=0; //mulher nervosa maior de 40;
		int fcmenor=0, hcmenor=0, ocmenor=0, pcmenor=0;
		
		
		  while (pessoa <150) 
		  {
			  pessoa++;
			  idade = gerador.nextInt(100);
			  sexo = gerador.nextInt(3);
			  personalidade = gerador.nextInt(3);
		            if(sexo==1) //mulher
		            {
		            	f++;
		            	if(personalidade==1) //calma
		            	{
		            		fc++;
		            		if(idade<18) {
		            			fcmenor++;
		            		}
		            	}
		            	else if(personalidade==2) //nervosa
		            		fn++;
		            		if(idade>40)
		            		{
		            			fnm++;
		            		}
		            	else {
		            		fa++;
		            	}
		            }		            
		            else if(sexo==2) //homem
		            {
		            	m++;
		            	if(personalidade==1) //calmo
		            	{
		            		hc++;
		            		if(idade<18) {
		            			hcmenor++;
		            		}
		            	}
		            	else if(personalidade==2) //nervoso
		            		hn++;
			            	if(idade>40)
		            		{
		            			hnm++;
		            		}
		            	else {
		            		ha++;
		            	}
		            }
		            else // outros
		            {
		            	o++;
		            	if(personalidade==1) //calmx
		            	{
		            		oc++;
		            		if(idade<18) {
		            			ocmenor++;
		            		}
		            	}
		            	else if(personalidade==2) //nervosx
		            		on++;
			            	if(idade>40)
		            		{
		            			onm++;
		            		}
		            	else {
		            		oa++;
		            	}
		            }
		            pessoacalma = (fc+hc+oc);
		            pessoasnervosas=(fn+hn+on);
		            pnm = (fnm+hnm+onm); //pessoas nervosas maior que 40 anos 
		            pcmenor = (fcmenor+hcmenor+ocmenor);
		            
		  }
		        
		 
			
		System.out.printf("\nnúmero de pessoas calmas %d", pessoacalma);
		System.out.printf("\nnúmero de mulheres nervosas %d", fn);
		System.out.printf("\nnúmero de homens agressivos %d", ha);
		System.out.printf("\nnúmero de outros calmos %d", oc);
		System.out.printf("\nnúmero de pessoas nervosas com mais de 40 anos %d", pnm);
		System.out.printf("\nnúmero de pessoas calmas com menos de 18 anos %d", pcmenor);
		
		leia.close();

	}

}
