import java.util.Scanner;

public class A027 {
	public static int [] search(int arr[]) {
		int a[] = new int [2];
		int l = 0, r = arr.length - 1;
		int mid = (l + r) / 2;
		int min = arr[mid], max = arr[mid + 1];
		for (int i = l; i < mid; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		for (int i = mid + 1; i < r; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		a[0] = min;
		a[1] = max;
		return a;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a[] = new int [6];
		for (int i = 0; i < 6; i++) {
			a[i] = scanner.nextInt();
		}
		int arr[] = search(a);
		System.out.println("The minimum element in the array is " + arr[0]);
		System.out.println("The maximum element in the array is " + arr[1]);
	}
}
