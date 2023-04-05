package day08.poly.car;

import static day07.util.Utility.makeLine;

public class Main {

    public static void main(String[] args) {

        CarShop shop = new CarShop();
        shop.runTest();

        makeLine();
        Driver park = new Driver();

        park.drive(new Stinger());

        makeLine();
        Mustang mustang = new Mustang();
        mustang.accelerate();   // 부모에게 오버라이딩된 accelerate
        mustang.powerSound();   // powerSound()는 부모에게 없기 때문에 Car mustang을 쓸수 없다.

        Stinger stinger = new Stinger();
        stinger.accelerate();

        Car car = shop.exportCar(6000);
        // 캐스팅 - 타입을 변환하는 것을 말하며 형변환이라고도 한다
        // instanceof 실무에서 잘 안씀
        System.out.println(car instanceof Stinger); // car가 Stinger 객체야? 
        System.out.println(car instanceof Tucson); // car가 Tucson 객체야?
        System.out.println(car instanceof Mustang); // car가 Mustang 객체야?
//        Mustang car = (Mustang) shop.exportCar(6000);   // Car에서 Mustang으로 다운그레이드를 할때는 (Mustang)을 써줘야한다.
        
//        System.out.println("car = " + car);
//        car.powerSound();   // mustang만의 기능을 가져오고싶을때는 다운그레이드를 사용
                                // 업되어있으면 mustang만의 순수한 기능을 못가져온다.
    }
}
