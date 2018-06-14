import java.util.Scanner;

public class A021 {
	public static int search(int [] arr, int n) {
		int low = 0;
		int high = arr.length - 1;
		while (low <= high) {
			int mid = low + 1 / 2 * (high - low);
			if (arr[mid] == n) {
				high = mid - 1;
				return mid;
			}else if (arr[mid] < n) {
				low = mid + 1;
			}else {
				high = mid - 1;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a[] = new int [6];
		for (int i = 0; i < 6; i++) {
			a[i] = scanner.nextInt();
		}
		int b = scanner.nextInt();
		int res = search(a, b);
		if (res == -1) {
			System.out.println("Element not present");
		}else {
			System.out.println("Element found at index " + res);
		}
	}
}
