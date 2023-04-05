package day08.poly;

public class Main {

    public static void main(String[] args) {

        // 객체는 항상 역할에 의존해야지 구현체에 의존하면 안됨
        // 의존 말고 누구든 역할을 할수 있게

        Computer com = new Computer();
        Moniter lgMoniter = new LgMoniter();

        com.moniter = lgMoniter;

        // 모니터 교환
        com.moniter = new HpMoniter();
    }
}
