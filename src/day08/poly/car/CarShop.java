package day08.poly.car;

public class CarShop {

    Car cars[];
//    Mustang[] mustangs;
//    Stinger[] stingers;
//    Tucson[] tucsons;

    // 대리점에 차를 입고하는 기능
    // 여러 객체 배열을 하나로 묶을수 있다
    public void importCar() {
        cars = new Car[] {
                new Mustang(),
                new Mustang(),
                new Mustang(),
                new Stinger(),
                new Tucson()
        };

        // Object에 다 넣는건 좋은게 아니다 맞게 쓰는게 중요
        // 문자열과 정수와 논리를 배열에 담을 수 있는가?
        Object[] oArr = {
                50, 30, 3.3, "zzz", false,
                new Mustang()
        };

        // 주행 테스트 기능

    }
    public void runTest() {
        importCar();    // 차 입고
        for (Car car : cars) {
            car.accelerate();   // 오버라이딩 때문에 가능
        }
    }
    
    // 차를 고객에게 인도하는 기능
    public Car exportCar(int money) {
    if(money == 6000){
        return new Mustang();
    } else if (money ==5000) {
        return new Stinger();
    }else if (money ==3000) {
        return new Tucson();
    }else {
        return null;
    }
    }
}
