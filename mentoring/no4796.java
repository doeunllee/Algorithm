-package mentoring;

import java.util.Scanner;

public class no4796 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int num = 1;

		while (true) {

			int L = scanner.nextInt();    //연속하는 P일 중, L일동안만 사용
			int P = scanner.nextInt();    //연속하는 P일 중, L일동안만 사용
			int V = scanner.nextInt();    //V일짜리 휴가

			if (L == 0 && P == 0 && V == 0) //L, P, V 모두 0 입력받으면 프로그램 종료.
				break;

			int maximumDate = V / P * L + (V % P > L ? L : V % P);
         /* (V % P > L ? L : V % P) 작성한 이유
            휴가를 연속하는 p일로 나눌 경우 l일보다 크면 l일을 더해주고
               그렇지 않다면 그대로 작성해줌.                
         */

			System.out.println("Case " + num + ": " + maximumDate);

			num++;
		}
	}
}
