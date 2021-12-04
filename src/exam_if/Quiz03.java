package exam_if;

import java.util.Scanner;

public class Quiz03 {
    public static void main(String[] args) {
        //첫 줄에는 정수 x가 주어진다. (−1000 ≤ x ≤ 1000; x ≠ 0) 다음 줄에는 정수 y가 주어진다. (−1000 ≤ y ≤ 1000; y ≠ 0)
        //변수 x =  양수, y = 음수로 선언하며 입력받기
        //if 4개를 이용하여 1사분면, 2사분면, 3사분면, 4사분면 나누기
        //1사분면 : x,y 둘다 양수 2사분면 : x음수 y양수 3사분면 : x음수 y음수 4사분면 : x양수 y음수

        Scanner sc = new Scanner((System.in));
        int x = sc.nextInt();
        int y = sc.nextInt();


        if (x >= 0 && y >= 0){
            System.out.println(1);
        }else if(x < 0 && y >= 0){
            System.out.println(2);
        }else if(x < 0 && y < 0){
            System.out.println(3);
        }else if(x >= 0 && y < 0){
            System.out.println(4);
        }
    }
}
