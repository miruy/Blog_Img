package exam_for;

import java.util.Scanner;

public class Quiz10 {

	public static void main(String[] args) {
		/*
		 * 정수 N개로 이루어진 수열 A와 정수 X가 주어진다. 이때, A에서 X보다 작은 수를 모두 출력하는 프로그램을 작성하시오. (1 ≤ N,
		 * X ≤ 10,000) 둘째 줄에 수열 A를 이루는 정수 N개가 주어진다. 출력 X보다 작은 수를 입력받은 순서대로 공백으로 구분해
		 * 출력한다.
		 */

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // n만큼 반복
		int x = sc.nextInt(); // 비교 값
		int a = 0;

		for (int i = 0; i < n; i++) {
			a = sc.nextInt();
			if (a < x) {
				System.out.print(a + " ");
			}
		}


	}

}
