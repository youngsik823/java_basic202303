package day04;

// 실행용 클래스
// 여기엔 설계를 하지 않고 main 메서드를 작성합니다.
public class DancerMain {

    public static void main(String[] args) {

        Dancer kim = new Dancer();
        Dancer park = new Dancer("스크릿댄스");
        Dancer jang = new Dancer("장동견", "목각댄스", DanceLevel.PRO);
        // 클래스이름 타입이다.
//        kim.dancerName = "김관종";
//        kim.crewName = "서커스크루";
        // main에서는 이렇게 하면 안된다. 설계도에서 해야한다.
//        Singer song = new Singer();


        System.out.println(kim);
        System.out.println(kim.introduce());
        System.out.println(park.introduce());
        System.out.println(jang.introduce());
        // 클래스 밑에다 작성한것은 필드가 아니다.
        // park과 kim은 주소가 다르다.

        kim.dance();
        park.dance();
        jang.dance();

    }
}
