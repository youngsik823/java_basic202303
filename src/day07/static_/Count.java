package day07.static_;

public class Count {

    // 제한자(modifier)
    // 접근 제한자(Access), 사용 제한자(Usage)
    public static int x;    // 정적 필드 : 모든 객체가 공유   (객체가 달라도 x는 하나)
    public int y;           // 인스턴스 필드 : 객체별로 관리  (즉 객체가 다르면 y 값이 따로)

    // 정적 메서드 (static만 쓸 수 있다.)
    public static void m1(Count c4) {
        System.out.println("static 메서드 호출!");
        // 필드 참조 (static 메서드 안에서는 static 필드만 참조 가능)
        // static이 this정보를 알수가 없어서 호출 불가능
        System.out.println("x = " + x);
//        System.out.println("y = " + y);   // 누구의 y인지 모르니까 안됨

        Count c3 = new Count();
        System.out.println("c3.y = " + c3.y);
        System.out.println("c4.y = " + c4.y);
        
    }
    // 인스턴스 메서드 (static과 다 쓸수있다.)
    public void m2() {
        System.out.println("인스턴스 메서드 호출!");
        System.out.println("x = " + x);
        System.out.println("y = " + y); // 누구의 y인지 알수 있어서 사용 가능
    }
}
