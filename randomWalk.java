import java.util.Random;

public class randomWalk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 0;
		Random r = new Random();
		
		while ((number < 3) || (number > -3)) {
			int sum = (r.nextInt(2));
			if (sum == 0) {
				number = sum - 1;
				System.out.println ("next number = " + number);
			} else {
				System.out.println("next number = " + sum);
		}
	}
	}
}
