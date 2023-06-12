import java.util.Scanner;

public class VariableArray {

	public static void main(String[] args) {

		int[][] arr = new int[2][3];
//		System.out.println("Enter your row");
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < arr.length; i++) {
//			System.out.println("How many columns");
//			int columns = sc.nextInt();
//			arr[i] = new int[columns];
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println("Enter yout number:");
				arr[i][j] = sc.nextInt();
			}

		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println(" ");
		}

	}

}
