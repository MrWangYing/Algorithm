import java.util.Scanner;

public class A020 {
	public static int search(int arr[], int n) {
		int x = 2, r = 0;
		for (x = 2; x < 104; x *= 2) {
			if (n <= arr[x]) {
				r = x;
				break;
			}else {
				x *= 2;
			}
		}
		int l = r / 2;
		while (l <= r) {
			int mid = (l + r) / 2;
			if (arr[mid] == n) {
				return mid;
			}else if (arr[mid] < n){
				l = mid + 1;
			}else {
				r = mid - 1;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a[] = new int [5];
		for (int i = 0; i < 5; i++) {
			a[i] = scanner.nextInt();
		}
		int b = scanner.nextInt();
		int res = search(a, b);
		if (res == -1) {
			System.out.println("Element not found");
		}else {
			System.out.println("Element found at index " + res);
		}
	}
}
