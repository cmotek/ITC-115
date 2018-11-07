
public class sort {

	public static void main(String[] args) {
		int[] list1 = {1, 2, 3, 4};
		int[] list2 = {5, 1, 2, 3, 2};
	
		for (int i = 0; i < list1.length - 1; i++) {
			if (list1[i] < list1[i + 1]) {
			System.out.println("TRUE");
		} else {
			System.out.println("FALSE");
		}
	}
		
		for (int i = 0; i < list2.length - 1; i++) {
			if (list2[i] < list2[i + 1]) {
			System.out.println("TRUE");
		} else {
			System.out.println("FALSE");
		}
	}
	}
}
