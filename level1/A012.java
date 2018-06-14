
public class A012 {
	public static void main(String[] args) {
		int a[] = {1, 2, 3, 1};
		for (int i = 0; i < 3; i++) {
			for (int j = i; j < 3; j++) {
				System.out.println(a[i] + " " + a[j]);
			}
		}
	}
}
