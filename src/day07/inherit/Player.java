package day07.inherit;

// 수퍼 클래스 (부모 클래스) : 객체의 공통 기능과 속성을 설계
public class Player {
//    부모는 extends를 안써도 뒤에 extends Object가 자동으로 들어간다
//    ex)  Player extends Object
//    자바의 모든 조상은 Object이다.
    String nickName; // 캐릭터 이름
    int level;
    int hp;
    int exp;

    // 부모의 생성자


    public Player(String nickName) {
        super(); // 부모는 object를 부름
        System.out.println("Player의 생성자 호출!");
        this.nickName = nickName;
        this.level = 1;
        this.hp = 50;
    }

    // 캐릭터 상태창을 보는 기능
    public void showStatus() {
        System.out.println("\n======= Character's Info =========");
        System.out.println("# name: " + this.nickName);
        System.out.println("# level: " + this.level);
        System.out.println("# hp: " + this.hp);
    }
}
