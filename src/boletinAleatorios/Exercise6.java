package boletinAleatorios;

import java.util.Random;

public class Exercise6 {

	public static void main(String[] args) {
		Random random = new Random();
		int month;
		month = random.nextInt(12)+1;
		
		if(month == 6 || month == 7 || month == 8)
			System.out.println("We are in summer, the beach waiting you!");
		else
			System.out.println("We don't are in summer, hard work to do");
	}

}
