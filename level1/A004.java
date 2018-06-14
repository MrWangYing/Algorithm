import java.util.Scanner;

public class A004 {
	public static void bSort(int arr[], int n) {
		int j = 0;
		for (int i = 0; i < n; i++) {
			if(arr[i] == 0) {
				arr[j++] = 0;
			}
		}
		for (int i = j; i < n; i++) {
			arr[j++] = 1;
		}
	}
	public static void main(String[] args) {
		int size = 8;
		int [] myInt = new int[size];
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < size; i++) {
			myInt[i] = scan.nextInt();
		}
		bSort(myInt, size);
		for (int i =0; i < size; i++) {
			System.out.print(myInt[i] + " ");
		}
	}
}
