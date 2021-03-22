package mentoring;

import java.util.Scanner;

public class test2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int unit[] = {50000, 10000, 1000, 500, 100, 50, 10, 1}; //환산할 돈의 단위 배열

		System.out.print("금액을 입력하시오: ");
		int money = scanner.nextInt(); //금액 입력

		int count;

		for(int i=0; i<unit.length; i++) {
			count = money/unit[i]; //환산할 돈의 개수를 몫을 이용하여 구한다.

			if(count!=0) //돈의 개수가 0이면 출력되지 않는다.
				System.out.println(unit[i] + "원 짜리: " + count + "개");

			money -= unit[i]*count;
		}
	}

}
