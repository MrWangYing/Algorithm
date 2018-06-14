import java.util.Scanner;

public class A002 {
	public static void main(String[] args) {
		int size = 7;
		int [] myInt = new int[size];
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < size; i++) {
			myInt[i] = scan.nextInt();
		}
		for (int i = 0; i < size; i++) {
			for (int j = i; j < size; j++) {
				int min = myInt[i];
				if (myInt[j] < min) {
					min = myInt[j];
					myInt[j] = myInt[i];
					myInt[i] = min;
				}
			}
		}
		for (int i : myInt) {
			System.out.print(i + " ");
		}
	}
}
