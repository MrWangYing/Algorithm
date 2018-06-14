import java.util.Scanner;

public class A016 {
	public static int power(int x, int n) {
		int a = x;
		for (int i = 1; i < n; i++) {
			a = a * x;
		}
		return a;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		int n = scanner.nextInt();
		int res = power(x, n);
		System.out.println(res);
	}
}
