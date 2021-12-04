package exam_입출력및사칙연산;

import java.util.Scanner;

public class Quiz09 {
    public static void main(String[] args) {
        /*
        472
        385
        예제 출력 1
        2360
        3776
        1416
        181720
         */

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
                                              // b에 들어오는 입력값의 각 자릿수 별로 얻어와야 함(이거 그냥 외우자!!)
        System.out.println(a*(b%10));         // 1의 자릿수를 구할때 값 % 10 = 나머지 값이 해당 값의 1의 자리
        System.out.println(a*((b%100)/10));   // 10의 자릿수를 구할때 값 % 100 = 나머지 값이 해당 값의 10의 자리
        System.out.println(a*(b/100));        // 100의 자릿수를 구할때 값 / 100 = 나머지 값이 해당 값의 100의 자리
        System.out.println(a*b);
    }
}

