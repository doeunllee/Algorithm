package mentoring;

import java.util.Scanner;

public class no7568 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int num = scanner.nextInt(); 
		int arr[][] = new int[num][2]; 

		for (int i = 0; i < num; i++) {
			arr[i][0] = scanner.nextInt(); 
			arr[i][1] = scanner.nextInt(); 
		}

		for (int i = 0; i < num; i++) {
			int rank = 1;
			for (int j = 0; j < num; j++) {
				if (arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1])
					rank++;
			}
			System.out.print(rank + " ");
		}
	}
}