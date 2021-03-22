package mentoring;

import java.util.Scanner;

class no10250{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int T = scanner.nextInt();	//테스트 수

		for(int i=0; i<T; i++) {
			int H = scanner.nextInt();	//호텔의 층 수
			int W = scanner.nextInt();	//각 층의 방 수
			int N = scanner.nextInt();	//N번째 손님
			if(N%H!=0) { //꼭대기층이 아닌 경우
				System.out.printf("%d%02d\n", N%H, N/H+1); //printf() 메소드를 이용하여 아규먼트를 포맷문자열에 대입. %02d:2자리 정수로 출력(ex. 2호인 경우, 02호라고 출력)
			}else {		//꼭대기 층인 경우
				System.out.printf("%d%02d\n", H, N/H);	//H는 층수이기 때문에 꼭대기 층일 경우 그대로 H를 대입하면 됨.
			}
		}

	}
}