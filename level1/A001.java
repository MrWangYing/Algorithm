import java.util.Scanner;

public class A001 {
	public static void main(String[] args) {
		int size = 7;
		int [] myInt = new int[size];
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < size; i++) {
			myInt[i] = scan.nextInt();
		}
		for(int j = 1; j < size; j++) {
			for(int k = j; k > 0 && myInt[k] < myInt[k - 1]; k--) {
					int temp = myInt[k];
					myInt[k] = myInt[k - 1];
					myInt[k - 1] = temp;
			}
		}
		for (int i = 0; i < size; i++) {
			System.out.print(myInt[i] + " ");
		}
	}
}
