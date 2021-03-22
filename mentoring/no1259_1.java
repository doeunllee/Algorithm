package mentoring;

import java.util.Scanner;

public class no1259_1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while(true) {
			String num = scanner.next();
			if(num.equals("0"))
				break;

			String[] arr=new String[num.length()];
			String[] arr2=new String[num.length()];

			for(int i=0; i<num.length(); i++)
				arr[i]=num.substring(i, i+1);

			for(int i=0; i<num.length(); i++)
				arr2[i]=arr[num.length()-1-i];

			int count =0 ;

			for(int i=0; i<num.length(); i++) {
				if(arr[i].equals(arr2[i]))
						count++;
			}

			if(count == num.length())
				System.out.println("yes");
			else
				System.out.println("no");
		}
	}
}
