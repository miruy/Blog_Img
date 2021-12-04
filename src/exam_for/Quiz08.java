package exam_for;

import java.util.Scanner;

public class Quiz08 {

	public static void main(String[] args) {
		//첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제 
		
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt(); 
		
		for(int i = 1; i <= n; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print("*");
			}System.out.println();
		}
	}

}
