package exam_while;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		// a,b를 입력받아 그 합을 나타내는 프로그램 단, 입력의 마지막에는 0 두 개가 들어온다.
		Scanner sc = new Scanner(System.in);
		int a;
		int b;
		boolean boo = true;
		
		while (boo) {
			a = sc.nextInt();
			b = sc.nextInt();
			if(a == 0 && b == 0) {
				boo = false;
				break;
			}
			System.out.println(a + b);
		}	

	}

}
