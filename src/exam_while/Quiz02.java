package exam_while;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		// a,b를 입력받아 그 합을 나타내는 프로그램
		Scanner sc = new Scanner(System.in);
		int a;
		int b;
		
		
		while (sc.hasNextInt()) {
			a = sc.nextInt();
			b = sc.nextInt();
			System.out.println(a + b);
		}	

	}

}
