import java.util.Scanner;

public class A005 {
	public static void quickSort(int arr[], int start, int end) {
		int i,j,k;
		if (start > end) {
			return;
		}
		i = start;
		j = end;
		k = arr[i];
		while (i < j) {
			while (i < j && arr[j] >= k)
				j--;
			if (i < j)
				arr[i++] = arr[j];
		while (i < j && arr[i] < k)
				i++;
			if (i < j)
				arr[j--] = arr[i];
		}
		arr[i] = k;
		quickSort(arr, start, i - 1);
		quickSort(arr, i + 1, end);
	}
	public static void quickSort2(int a[]) {
		quickSort(a, 0, a.length - 1);
	}
	
	public static void main(String[] args) {
		int size = 9;
		int [] myInt = new int[size];
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < size; i++) {
			myInt[i] = scan.nextInt();
		}
		quickSort2(myInt);
		for (int i = 0; i < size; i++) {
			System.out.print(myInt[i] + " ");
		}
	}
}
