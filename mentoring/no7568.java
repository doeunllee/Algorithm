package mentoring;

import java.util.Scanner;

public class no7568 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int num = scanner.nextInt();	//전체 사람의 수
		int arr[][] = new int[num][2];	//2차원 배열(행: 사람, 열: 몸무게&키)

		for (int i = 0; i < num; i++) {	//사람의 수만큼 반복
			arr[i][0] = scanner.nextInt();	//한 사람의 몸무게 저장
			arr[i][1] = scanner.nextInt(); 	//한 사람의 키 저장
		}

		for (int i = 0; i < num; i++) {
			int rank = 1;
			for (int j = 0; j < num; j++) {
				if (arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1])	//i번째 사람과 j번째 사람의 몸무게와 키를 모두 비교.
					rank++;		//i번째 사람의 키와 몸무게가 j번째 사람보다 모두 작을 경우, rank를 증가
			}
			System.out.print(rank + " ");
		}
	}
}
