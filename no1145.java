package algorithm;

import java.util.Scanner;

public class no1145 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int num[] = new int[5];

		for (int i = 0; i < num.length; i++) {
			num[i] = scanner.nextInt();
		}

		int result = 1;
		int count = 0;

		while (true) {
			for (int j = 0; j < num.length; j++) {
				if (result % num[j] == 0)
					count++;
			}
			if (count >= 3) {
				System.out.println(result);
				break;
			} else {
				count = 0;
				result++;
			}
		}
	}
}