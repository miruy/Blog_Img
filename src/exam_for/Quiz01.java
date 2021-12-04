package exam_for;

import java.util.Scanner;

public class Quiz01 {
    public static void main(String[] args) {
        /*
        문제
        N을 입력받은 뒤, 구구단 N단을 출력하는 프로그램을 작성하시오. 출력 형식에 맞춰서 출력하면 된다.
        입력
        첫째 줄에 N이 주어진다. N은 1보다 크거나 같고, 9보다 작거나 같다.
        출력
        출력형식과 같게 N*1부터 N*9까지 출력한다.
         */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 0; i < 1; i++){    //단수 크게 반복되는 개녕
            for(int j = 1; j <= 9; j++){   //안에서 여러번 반복되는 개념
                System.out.println(n + " * " + j + " = " + n*j);
            }
            System.out.println();
        }
    }
}
