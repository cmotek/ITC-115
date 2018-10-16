
public class seasons {

	public static void main(String[] args) {
		
		season(3,31);
		season(7,4);
		season(2,17);
	}
	
	public static void season(int month, int day) {
		if((month == 12 && day >=16) || (month == 1) || 
				(month == 2) || (month == 3 && day <= 15)){
			System.out.println("Winter");
	} else if((month == 3 && day >= 16) || (month == 4) || 
			(month == 5) || (month == 6 && day <= 15)) {
			System.out.println("Spring");
	} else if((month == 6 && day >= 16) || (month == 7) || 
			(month == 8) || (month == 9 && day <= 15)) {
			System.out.println("Summer");
	} else if((month == 9 && day >= 16) || (month == 10) ||
			(month == 11) || (month == 12 && day <=15)){
			System.out.println("Autumn");
	} else {
			System.out.println("This is not a real date");
	}
	
	}
	
}
