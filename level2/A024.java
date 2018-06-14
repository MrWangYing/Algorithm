import java.util.Scanner;
import java.util.zip.Inflater;

public class A024 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a[] = new int [6];
		for (int i = 0; i < 6; i++) {
			a[i] = scanner.nextInt();
		}
		int b = scanner.nextInt();
		System.out.println(b);
		int floor = 0, ceil = 0;
		int fmin = 0, cmin = 0;
		for (int i : a) {
			if (i == b) {
				floor = i;
				ceil = i;
				break;
			}else if (i < b){
				floor = i;
			}else {
				ceil = i;
				break;
			}
		}
		System.out.println(ceil + " " + floor);
	}	
}
