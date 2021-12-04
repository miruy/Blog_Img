package exam_입출력및사칙연산;

import java.util.Scanner;

public class Quiz10 {
    public static void main(String[] args) {
        /*
        첫째 줄에 다음 세 가지 중 하나를 출력한다.
        A가 B보다 큰 경우에는 '>'를 출력한다.
        A가 B보다 작은 경우에는 '<'를 출력한다.
        A와 B가 같은 경우에는 '=='를 출력한다.
         */
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a > b){
            System.out.println(">");
        }else if(a < b){
            System.out.println("<");
        }else if (a == b){
            System.out.println("==");
        }
    }
}
