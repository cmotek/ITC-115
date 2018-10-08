
public class Fibonacci {

	public static void main(String[] args) {
		
		int num = 0, num2 = 1;
		for(int i = 0; i <= 11; i++) {
			System.out.print(num2 + " ");
			
			int sum = num + num2;
			num = num2;
			num2 = sum;
		}
		
	}

}
