package day02;

import java.io.IOException;
import java.util.Scanner;

public class StdIO {
    public static void main(String[] args) throws IOException {
        String dog = "멍멍이", cat = "야옹이";

        System.out.print(dog + "\n");
        System.out.println(dog);
        System.out.println(cat);

        int month = 10;
        int day = 3;
        String anni = "개천절";

        System.out.println(
                month + "월 "
                        + day + "일은 "
                        + anni + "입니다.");
        // %d: 정수, %s: 문자열, %f: 실수
        System.out.printf("%d월 %d일은 %s입니다.", month, day, anni);

        double rate = 25.4567;
        // %f : 무조건 자리수를 6자리로 표현
        System.out.printf("오늘의 할인율은 %.1f입니다.\n", rate);

        // 표준 입력
//        int result = System.in.read();
//        // read는 int로 받기 때문에 아스키코드로 나온다.
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        
        int result = 0;
        // 선언문을 try블록 밖에 선언
        try {
            // str을 정수변환
            result = Integer.parseInt(str);
        } catch (Exception e) {
            System.out.println("정수로 입력하거라~");
        }

        System.out.println("result = " + result);
    }
}
