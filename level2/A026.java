import java.awt.image.RescaleOp;
import java.util.Scanner;

public class A026 {
	public static int findMax(int arr[]) {
		int max = arr[0];
		int cur = arr[0];
		for (int i = 1; i < arr.length; i++) {
			cur += arr[i];
			if (cur > max) {
				max = cur;
			}else if (cur < 0) {
				cur = 0;
			}
		}
		return max;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a[] = new int [7];
		for (int i = 0; i < 7; i++) {
			a[i] = scanner.nextInt();
		}
		int res = findMax(a);
		System.out.println(res);
	}
}
