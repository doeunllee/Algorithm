package mentoring;

import java.util.Scanner;

public class no4796 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int num = 1;

		while (true) {

			int L = scanner.nextInt(); 
			int P = scanner.nextInt(); 
			int V = scanner.nextInt(); 

			if (L == 0 && P == 0 && V == 0) 
				break;

			int maximumDate = V / P * L + (V % P > L ? L : V % P); 

			System.out.println("Case " + num + ": " + maximumDate);

			num++;
		}
	}
}