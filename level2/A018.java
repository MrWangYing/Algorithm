import java.util.Scanner;

public class A018 {
	public static int search(int [] arr, int n) {
		int low = 0;
		int high = arr.length - 1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (arr[mid] == n) {
				return mid;
			}else if (arr[mid - 1]==n) {
				return mid - 1;
			}else if (arr [mid + 1]==n) {
				return mid + 1;
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
		int a[] = new int [9];
		for (int i = 0; i < 9; i++) {
			a[i] = scanner.nextInt();
		}
		int b = scanner.nextInt();
		int res = search(a, b);
		if (res == -1) {
			System.out.println("Element not found");
		}else {
			System.out.println("Element " + b + " found at index " + res);
		}
	}
}
