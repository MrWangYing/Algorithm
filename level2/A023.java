import java.util.Scanner;

public class A023 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int count = 0;
		int a[] = new int [10];
		for (int i = 0; i < 10; i++) {
			a[i] = scanner.nextInt();
		}
		int b = scanner.nextInt();
		for (int i : a) {
			if (i == b) {
				count++;
			}
		}
		if (count == 0) {
			System.out.println("Element not found in the array");
		}else {
			System.out.println("Element " + b +" occurs " + count);
		}
	}
}
