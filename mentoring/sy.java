package mentoring;

import java.util.Scanner;

public class sy { // 코딩에 필요한 최소한의 지식만 검색하여 문제를 품.
   public static void main(String[] args) {

      while(true) {
         Scanner scanner = new Scanner(System.in);

         int number = scanner.nextInt();

         if(number >= 1 && number <= 99999) { // 우선 정수를 문자열로 변환.

            String NumToString = String.valueOf(number); // 입력받은 정수를 문자열로 변환.
            String arrayNum [] = NumToString.split(""); // 변환된 문자열을 arrayNum 배열에 한글자씩 저장. 공백없음으로 구분.

            for(int i = 0; i < arrayNum.length/2 ; i++) { // 문자 배열 크기의 절반 만큼만 반복문 돌면 팰린드롬 수 판별 가능.
               if(arrayNum [i] == arrayNum [arrayNum.length - 1 - i]) {
                  // for문에 의해 i값이 증가하면서 팰린드롬수인지 판별.
                  continue;
               }else if(arrayNum [i] != arrayNum [arrayNum.length - 1 - i]) {
                  System.out.println("no");
                  break;
               }
               System.out.println("yes");
            }
         }else if(number == 0){
            break;
         }else {
            System.out.println("1 부터 99999 사이의 정수 값을 입력하시오.");
         }

         scanner.close();
      }
   }
}