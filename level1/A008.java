import java.util.Arrays;
import java.util.Scanner;

public class A008 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a[] = new int[6];
		for (int i = 0; i < 6; i++) {
			a[i] = scanner.nextInt(); 
		}
		int size= 0;
		for (int i : a) {
			if (i < 10) {
				size += 1;
			}
		}
		int b[] = new int[size];
		int c[] = new int[6 - size];
		int j = 0, k = 0;
		for (int i : a) {
			if (i < 10) {
				b[j++] = i;
			}else {
				c[k++] = i;
			}
		}
		Arrays.sort(b);
		Arrays.sort(c);
		/*int d[] = new int[6];
		for (int i = 0; i < 6 - size; i++) {
			d[i] = c[i];
		}
		for (int i = 6 - size; i < 6; i++) {
			d[i] = b[5 - i];
		}
		for (int i : d) {
			System.out.print(i +" ");
		}
		for (int i = 0; i < size; i++) {
			for (int x = 5; x >= 0; x--) {
				if (b[i] > d[x]/10 || (b[i] == d[x]/10 && b[i] >= d[x]%10)) {
					
				}
			}
		}
		for (int i = 5; i > 0; i--) {
			System.out.print(d[i]);
		}*/
		int y = 0;
		int d[] = new int[6];
		
		for (int i : d) {
			System.out.print(i);
		}
	}
}