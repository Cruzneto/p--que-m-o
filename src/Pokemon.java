import java.util.Scanner;

public class Pokemon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int avCandy, ev1, ev2, ev3, res, count, value, bigger, medium, low;
		count = 0; value = 0; low = 0; bigger = 0; medium = 0; res = 0;
		Scanner input = new Scanner(System.in);
		// 3 pokemons
		
		System.out.println("Digite o numero de doces disponiveis, valores de 0 a 1000: ");
		avCandy = input.nextInt();
		System.out.println("Quantos doces são necessários para a primeira evolução, valores de 1 a 1000? ");
		ev1 = input.nextInt();
		System.out.println("Quantos doces são necessários para a segunda evolução, valores de 1 a 1000? ");
		ev2 = input.nextInt();
		System.out.println("Quantos doces são necessários para a terceira evolução, valores de 1 a 1000? ");
		ev3 = input.nextInt();
		
		if (avCandy > 0 && avCandy <= 1000 && 
			    ev1 >= 1 && ev1 <= 1000 && 
			    ev2 >= 1 && ev2 <= 1000 && 
			    ev3 >= 1 && ev3 <= 1000) 
			{		
			
		//ORGANIZAR PARA OBTER O MAIOR NUMERO	
			
			if (ev1 >= ev2 && ev1 >= ev3)
			{
				bigger = ev1;
				if(ev2 >= ev3)
				{
					medium = ev2;
					low = ev3;
				}
					else
					{
						medium = ev3;
						low = ev2;
					}
					
			}
			else if(ev2 >= ev3 && ev2 >= ev1)
			{
				bigger = ev2;
				if (ev3 >= ev1)
				{
					medium = ev3;
					low = ev2;
				}
					else
					{
						medium = ev1;
						low = ev2;
					}
			}
					
			else {
					bigger = ev3;
						if(ev2 >= ev1) {
							medium = ev2;
							low = ev1;
						}
							else {
								medium = ev1;
								low = ev2;
							}
						    	
						}

			 System.out.println(bigger + " " + medium + " " + low);
			 
				if(avCandy - low >= 0)
			 	{
				res = avCandy - low;
				count++;
			 	}
				if (res - medium>= 0)
				{
					res = res - medium;
					count++;	
				}
				if (res - bigger >=0) 
					{
					res = res - bigger;
					count++;
					}
				System.out.println("O numero de evoluções possíveis é : " + count + " vezes.");
			}
		 
		else {					
		System.out.println("Digite valores válidos. ");		
			}
		
		
	//LOGICA DE EVOLUÇÕES
		
		

		} 
}	 