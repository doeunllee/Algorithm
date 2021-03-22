package mentoring;

import java.util.Scanner;

public class no1259{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while(true) {
			char[] arr = scanner.nextLine().toCharArray();	//문자열을 받아서 배열로 저장했음
			if(arr.length == 1) {		//배열의 길이가 1인 경우
				if(arr[0]-'0' == 0) break;	//만약 0이라면 프로그램 종료
			else
				System.out.println("yes");	//한자리 수라면 yes 출력
			}


			int mid = arr.length/2;	//배열의 길이를 2로 나누어서 mid 변수에 저장(길이를 반으로 나누어서 첫자리와 끝자리를 비교하기 위함)

			for(int i=0; i<mid; i++) {	//0부터 중간자리 전까지 비교하기
				int start = arr[i];	//비교 첫자리
				int reverse = arr[(arr.length - 1) - i];	//비교 끝자리

				if(start!=reverse) {	//비교를 하면서 첫자리와 끝자리가 다르다면 no를 출력.
					System.out.println("no");
					break;
				}

				if(i == mid -1 ) {		//비교 첫자리의 배열 위치와 중간자리 전 위치가 동일하다면 모든 비교를 마쳤기 때문에 yes 출력.
					System.out.println("yes");
				}
			}
		}
	}
}