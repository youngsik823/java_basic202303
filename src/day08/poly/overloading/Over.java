package day08.poly.overloading;

/*
    오버라이딩: 부모클래스의 메서드를 자식이 재정의 하는 것
    오버로딩: 하나의 클래스 안에서 같은 이름의 메서드를 여러 개 선언하는것
    (똑같은 함수의 이름을 가질 수 있다.)
    조건 : 반드시 매개변수의 타입, 순서, 개수가 달라야 한다.
            리턴 타입과 접근제한자는 관련이 없다.
 */
public class Over {

    // 데이터를 전달하면 데이터의 타입을 알려주는 기능
    // 대표적인 오버로딩 print
    // print는 함수이름은 같지만 여러 타입을 쓸 수 있다.

    // alertType(String)
    void alertType(String s) {
        System.out.println("전달된 데이터는 문자열 입니다.");
    }

    // alertType(int)
    void alertType(int x) {
    }

    // alertType(int, int)
    void alertType(int x, int y) {
    }

    // alertType(String, int)
    void alertType(String x, int y) {
    }

    // alertType(int, String)
    void alertType(int x, String y) {
    }
    // 함수 이름이 같아야 알기도 편하고 여러 파라미터의 변환을 통해서 다른 함수를 불러올수 있다.
    void test() {

    }


}
