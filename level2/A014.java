
public class A014 {
	public static int sum(int n) {
		if (n == 1) {
			return 10;
		}
		int a = sum(n - 1) + 2;
		return a;
	}
	public static void main(String[] args) {
		int a = sum(5);
		System.out.println("第五个人的年龄是" + a);
	}
}
