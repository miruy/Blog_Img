package exam_for;

import java.util.Scanner;

public class Quiz07 {

	public static void main(String[] args) {
		//  "Case #x: A + B = C" 형식으로 출력
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		for(int i = 0; i < t; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = a+b;
			System.out.printf("Case #%d: %d + %d = %d\n", (i+1), a, b, c);
		}

	}

}
