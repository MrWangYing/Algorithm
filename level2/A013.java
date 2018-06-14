
public class A013 {
	public static int sum(int n) {
		if (n == 1) {
			return 1;
		}
		int a = (sum(n - 1) + 1) * 2;
		return a;
	}
	public static void main(String[] args) {
		int b = sum(30);
		System.out.println(b);
	}

}
