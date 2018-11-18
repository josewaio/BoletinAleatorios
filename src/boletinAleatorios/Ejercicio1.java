package boletinAleatorios;

import java.util.Random;

public class Ejercicio1 {

	public static void main(String[] args) {
		//The face of a coin
		int coin;
		Random random = new Random();
		coin = random.nextInt(2);
		if(coin ==1)
			System.out.println("The coin has fallen face");
		else
			System.out.println("The coin has fallen cross");
		
	}

}
