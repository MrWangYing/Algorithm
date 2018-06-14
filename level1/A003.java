import java.util.Scanner;

public class A003 {
	public static void main(String[] args) {
		int size = 7;
		int [] myInt = new int[size];
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < size; i++) {
			myInt[i] = scan.nextInt();
		}
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				int temp = myInt[i];
				if (myInt[i] < myInt[j]) {
					myInt[i] = myInt[j];
					myInt[j] = temp;
				}
			}
		}
		for (int i = 0; i < size; i++) {
			System.out.print(myInt[i] + " ");
		}
	}
}
