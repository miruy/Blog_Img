package exam_if;

import java.util.Scanner;

public class Quiz04 {
    public static void main(String[] args) {
        //Scanner를 이용해 상근이가 원래 일어나려던 시간을 변수 h,m(시,분)을 이용해입력받는다.
        //if문을 사용하여 하루를 나타내는 24를 조건문으로 문장을 제어한다.
        //자정 : 0:0, 끝 : 23:59
        //0 = 24
        Scanner sc = new Scanner((System.in));
        int h = sc.nextInt();
        int m = sc.nextInt();

        if(m < 45){
            h--;
            m = 60-(45-m);
            if(h < 0){
                h = 23;
            }
        }else{
            m -= 45;
        }

        System.out.printf("%d %d",h,m);
    }
}
