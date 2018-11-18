package boletinAleatorios;

import java.util.Random;

public class Exercise5 {

	public static void main(String[] args) {
		Random random = new Random();
		int weekDay;
		weekDay = random.nextInt(7)+1;
		if(weekDay == 5 || weekDay == 6 || weekDay ==7)
			System.out.println("We are in weekend, enjoy it!");
		else 
			System.out.println("We not are in weekend, hark work to do.");

	}

}
