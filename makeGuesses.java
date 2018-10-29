import java.util.Scanner;

public class makeGuesses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner console = new Scanner(System.in);
		int max = 50;
		int min = 1;
		int Guess = (int)Math.random();
		
		while(Guess <= 48) {
			System.out.print(Guess + ",");
			Guess = console.nextInt();
		}

	}

}
