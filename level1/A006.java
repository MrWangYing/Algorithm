import java.util.Scanner;

public class A006 {
	public static int[] tongSort(int a[], int n) {
		int sorted[] = new int[n + 1];
		for(int i = 0; i < a.length; i++) {
			sorted[a[i]] = a[i];
		}
		return sorted;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a[] = new int[6];
		for (int i = 0; i < 6; i++) {
			a[i] = scanner.nextInt();
		}
		int b[] = tongSort(a, 8);
		int j = 0;
		for (int i = 0; i < b.length; i++) {
			if (b[i] == 0) {
				j++;
			}
			if (b[i] > 0) {
				System.out.print(b[i] + " ");
			}
		}
		System.out.println();
		System.out.println(j);
	}
}
