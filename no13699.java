package algorithm;

import java.util.Scanner;

public class no13699 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		long[] a = new long[36];
		a[0] = 1;

		int n = scanner.nextInt();

		for (int i = 1; i <= n; i++) {
			for (int j = 0; j < i; j++) {
				a[i] = a[i] + a[j] * a[i - 1 - j];
			}
		}

		System.out.println(a[n]);
	}

}
