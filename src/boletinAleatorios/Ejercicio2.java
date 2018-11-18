package boletinAleatorios;

import java.util.Random;

public class Ejercicio2 {

	public static void main(String[] args) {
		//Throw a die
		int dice;
		Random random = new Random();
		dice = random.nextInt(6)+1;
		System.out.println("The dice has fallen in "+ dice);
	}

}
