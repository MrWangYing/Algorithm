import java.util.Scanner;

public class A025 {
	public static int search(int arr[]) {
		int l = 0, r = arr.length - 1;
		while (l <= r) {
			int m = (l + r) / 2;
			if (arr[m] >= arr[l]) {
				l = m;
			}else {
				r = m;
			}
			return m;
		}
		return -1;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a[] = new int [6];
		for (int i = 0; i < 6; i++) {
			a[i] = scanner.nextInt();
		}
/*		int max = a[0];
		int k = 0;
		for (int i = 0; i < 6; i++) {
			if (a[i] >= max) {
				max = a[i];
				k++;
			}
		}*/
		int res = search(a);
		System.out.println("The array is rotated " + (a.length - 1 - res) + " times");
	}
}
