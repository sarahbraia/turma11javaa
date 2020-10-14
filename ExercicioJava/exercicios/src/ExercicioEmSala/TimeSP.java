package ExercicioEmSala;

import java.util.Random;
//import java.util.Scanner;

//import com.sun.tools.sjavac.server.SysInfo;

public class TimeSP 
{

	public static void main(String[] args) 
	{
		
		Random gerador = new Random();
		//Scanner leia=new Scanner (System.in);
		
		String[] times = new String [4];
		int [] ponto = new int [3];		
		int i, rodada=0;
		
				
		times[0] = "Corinthians";
		times[1] = "Palmeiras";
		times[2] = "SPFC";
		times[3] = "Santos";
		
		ponto[0] =(int)Math.round(Math.random() * 2);
		ponto[1] =(int)Math.round(Math.random() * 2);
		ponto[2] =(int)Math.round(Math.random() * 2);
		ponto[3] =(int)Math.round(Math.random() * 2);
		
		for (int r=0; r<=3; r++)
		{ 
			
			rodada++;
			 		System.out.println("Rodada numero "+rodada);
			 		for (int j=0; j<=4; j++) 
					{
						System.out.println(" O "+times[j]+" fez "+ponto[j]+ " pontos");												
					}
			 		System.out.println("saiu do for");
		}
		
		System.out.println("FIM DO PROGRAMA");
			
	
	}

}
