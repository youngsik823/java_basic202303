package day08.poly.car;

// 은전자 객체

public class Driver {

    public void drive(Car c) {  // 오버라이딩을 이용한다
        System.out.println("운전을 시작합니다.");
        c.accelerate();
    }

//    public void drive(Mustang m) {
//        System.out.println("운전을 시작합니다.");
//        m.accelerate();
//    }
//    public void drive(Stinger s) {
//        System.out.println("운전을 시작합니다.");
//        s.accelerate();
//    }
//    public void drive(Tucson t) {
//        System.out.println("운전을 시작합니다.");
//        t.accelerate();
//    }
}
