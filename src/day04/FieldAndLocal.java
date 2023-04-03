package day04;

public class FieldAndLocal {

    int a;  // 필드
    // double b; // 기본값 0.0
    // double b; // 기본값 null
    // Dancer b; // 기본값 null
    void mm(int b) { // b: 매개변수
        int c = 5;  // c: 지역변수
                // 지역변수는 미리 값을 주어야한다 가능성이 함수 블록안에서만 있기때문에 가능성이 없다.

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        // 초기화의 가능성
    }

}
