import java.util.Scanner;

public class A007 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a[] = new int[8];
		for (int i = 0; i < 8; i++) {
			a[i] = scanner.nextInt(); 
		}
		int k = a[0];
		int start = 0, end = 0;
		for (int i = 0; i < 8; i++) {
			if (a[i] >= k) {
				k = a[i];
				continue;
			}else {
				start = i - 1;
				break;
			}
		}
		int min = a[7];
		for (int i = 7; i > 0; i--) {
			if (a[i] <= min) {
				min = a[i];
				continue;
			}else {
				end = i + 1;
				break;
			}
		}
		System.out.println("Sort array from index "+ start+ " to " + end);
	}
}
