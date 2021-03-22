package mentoring;

import java.util.Scanner;

public class test3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int score[] = new int[3]; //크기가 3인 점수배열 생성.

		for(int i=0; i<score.length; i++) {
			System.out.print("점수 입력: ");
			score[i] = scanner.nextInt(); //점수배열에 점수 저장.
		}

		for (int i = 0; i < score.length; i++) {
			for (int j = i + 1; j < score.length; j++) {
				if (score[i] < score[j]) {
					int tmep = score[i];
					score[i] = score[j];
					score[j] = tmep;
				}
			}
		}

		for(int i =0; i<score.length; i++) {
			System.out.println(i+1 + "등 : " + score[i] + "점");
		}
	}
}
