package mentoring;

import java.util.Scanner;

public class test1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("시작: ");
		int start = scanner.nextInt(); //시작 정수 입력

		System.out.print("종료: ");
		int finish = scanner.nextInt(); //종료 정수 입력

		System.out.print("배수: ");
		int multiple = scanner.nextInt(); //배수 정수 입력

		int sum=0; //합 초기화

		for(int i = start; i<=finish; i++) {
			if(i%multiple == 0)
				sum+=i;
		}

		System.out.print(start + "부터 " + finish + "까지 " + multiple + "의 배수의 합: " + sum);
	}

}
