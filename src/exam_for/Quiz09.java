package exam_for;

import java.util.Scanner;

public class Quiz09 {

	public static void main(String[] args) {
		// j를 스페이스로 생각해보자 
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			for(int j = n-1; j > i; j--) {
				System.out.print(" ");
			}
			for(int k = 0; k < i+1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}

}
