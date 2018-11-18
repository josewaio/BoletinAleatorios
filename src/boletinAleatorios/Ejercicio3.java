package boletinAleatorios;

import java.util.Random;

public class Ejercicio3 {

	public static void main(String[] args) {
		//A number in 34 and 68, both included
		Random random = new Random(); 
		for(int i=0;i <100;i++)
		System.out.println("The graceful number is "+ (random.nextInt(68 - 34 + 1) + 34));
	}

}
