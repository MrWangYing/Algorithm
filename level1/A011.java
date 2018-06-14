import java.util.*;

public class A011 {
/*	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a[] = new int [11];
		for (int i = 0; i < 11; i++) {
			a[i] = scanner.nextInt();
		}
		int b[] = a;
		for (int i : b) {
			System.out.print(i + " ");
		}
		Arrays.sort(b);
		for (int i : a) {
			System.out.print(i + " ");
		}
		int num = 1;
		int x = b[0];
		for (int i = 0; i < 11; i++) {
			if (b[i] != x) {
				num += 1;
				x = b[i];
			}
		}
		int c[] = new int [num];
		int d[] = new int [num];
		x = b[0];
		int k = 0;
		for (int j = 0; j < num; j++) {
			for (int i = 0; i < 11; i++) {
				if (b[i] == x) {
					c[j] = b[i];
					k++;
				}
			}
			d[j] = k;
			
			for (int i = k; i < 11; i++) {
				if (b[i] != x) {
					x = b[i];
					break;
				}
			}
		}
		for (int i = num - 1; i > 0; i--) {
			d[i] = d[i] - d[i - 1];
		}
		int e[] = new int [num];
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < 11; j++) {
				if (a[j] == c[i]) {
					e[i] = j;
					break;
				}
			}
		}
		for(int i : a) {
			System.out.print(i + " ");
		}
		for (int i : c) {
			System.out.print(i + " ");
		}
		System.out.println();
		for (int i : d) {
			System.out.print(i + " ");
		}
		System.out.println();
		for (int i : e) {
			System.out.print(i + " ");
		}
	}*/
	
	
		public static Integer[] DifNums(int[] nums) {
			List<Integer> list = new ArrayList<Integer>();
			for (int i=0; i<nums.length; i++) {
			  if(!list.contains(nums[i])) {
			    list.add(nums[i]);
			  }
			}
			Integer[] difnums = list.toArray(new Integer[list.size()]);
			return difnums;
		}
		//各个数字的频数
		public static int[] Frequency(int[] nums) {
			Integer[] difnums = DifNums(nums);
			int[] Freq=new int[difnums.length];
			//各个数字的频数数组c
			for(int i=0;i<difnums.length;i++) {
				for(int j=0;j<nums.length;j++) {
					if(difnums[i]==nums[j]) {
						Freq[i]+=1;
					}
				}
			}
			return Freq;
		}
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			int a[] = new int [11];
			for (int i = 0; i < 11; i++) {
				a[i] = scanner.nextInt();
			}
			Integer[] b = DifNums(a);
			int[] c = Frequency(a);
			int temp;
			for(int i=0;i<b.length;i++) {
				for(int j=0;j<b.length-1-i;j++) {
				if (c[j] < c[j+1]) {
					temp = c[j];
					c[j] = c[j+1];
					c[j+1] = temp;
					temp = b[j];
					b[j] = b[j+1];
					b[j+1] = temp;
				    }
				}
			}
			for(int i=0;i<b.length;i++) {
					for(int k=0;k<c[i];k++) {
						System.out.print(b[i]+" ");
					}
			}
		}
}
