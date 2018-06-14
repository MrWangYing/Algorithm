import java.util.Scanner;

public class A019 {
	public static int search(int arr[], int n) {
		int left = 0;
		int right = arr.length - 1;
		int mid = (left + right) / 2;
		int midmid = (mid + right) / 2;
		while (mid <= midmid) {
			if (arr[mid] == n || arr[midmid] == n) {
				if (arr[mid] == n) {
					return mid;
				}else {
					return midmid;
				}
			}else if (arr[mid] > n) {
				right = mid;
			}else if (arr[midmid] < n) {
				left = midmid;
			}else {
				left = mid;
				right = midmid;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int arr[] = new int [6];
		for (int i = 0; i < 6; i++) {
			arr[i] = scanner.nextInt();
		}
		int b = scanner.nextInt();
		int res = search(arr, b);
		if (res == -1) {
			System.out.println("Element not present");
		}else {
			System.out.println("Element found at index " + res);
		}
	}
}
