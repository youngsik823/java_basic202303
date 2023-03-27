package day01;

public class DataType {
    public static void main(String[] args) {

        int a = 30000;

        System.out.println("a = " + a);
        
        // 논리타입
        boolean b1 = true;
        boolean b2 = false;

        // 문자 타입 : 한글자
        char c1 = 'A';  // 65
        System.out.println((char)(c1 + 1));
        
        char c2 = 44032;
        System.out.println("c2 = " + c2);

        // String은 기본타입이 아니라 객체다(char 배열).
        String s = "hello";

        // 객체는 함수를 갖고있다.

    }
}
