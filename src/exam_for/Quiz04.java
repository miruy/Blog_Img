package exam_for;

import java.util.Scanner;

public class Quiz04 {

	public static void main(String[] args) {
		//자연수 n을 입력받고 1부터 n까지 출력하는 프로그램 
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.println(i);
		}
	}

}
