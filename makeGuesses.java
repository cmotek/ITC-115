import java.util.Random;
import java.util.Scanner;

public class guess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner console = new Scanner(System.in);
		Random r = new Random();
		int num = 0;
		int sum = 0;
		while(num <= 48) {
			num = r.nextInt(51);
			System.out.println("guess = " + num);
			sum += 1;
		}
		System.out.println("total guesses = " + sum);
	}

}

