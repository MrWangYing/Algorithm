import java.util.Scanner;

public class A009 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a[] = new int[9];
		for (int i = 0; i < 9; i++) {
			a[i] = scanner.nextInt(); 
		}
		int k = 0;
		for (int i = 0; i < 9; i++) {
			if (a[i] == 0) {
				for (int j = i; j < 8; j++) {
					a[j] = a[j+1];
				}
				k++;
			}
		}
		for (int i = 9 - k; i < 9; i++) {
			a[i] = 0;
		}
		for (int i : a) {
			System.out.print(i + " ");
		}
	}
}
