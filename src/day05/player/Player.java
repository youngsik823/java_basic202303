package day05.player;

public class Player {
// 원래 필드 앞에는 this.이 붙는다
    String nickName;    // 캐릭터 닉네임
    int level;  //레벨
    int hp; // 체력

    void levelUp() {
        // levelUp()안에는 Player this가 숨어있다
        // ex) levelUp(Player this)
    }

    // 생성자

    public Player() {
        this("이름없음");   // 나의 또 다른 생성자를 불러주세요
        System.out.println("1번 생성자 호출!");
        this.nickName = "이름없음";
        this.level = 1;
        hp = 50;
    }

    Player(String nickName) {
        // this.nickName(필드) = nickName(지역변수); 내 자신을 this로 구분하기
        // 너가준 nickName을 내 this.nickName으로 받을게
        this(nickName, 1, 50);
        System.out.println("2번 생성자 호출!");

    }

    public Player(String nickName, int level, int hp) {
        this.nickName = nickName;
        this.level = level;
        this.hp = hp;
    }

    // 기능 - 메서드
    void attack(Player target) {
        if(this == target){
            return; // this는 나 자신이다 
                    // 즉 나 자신을 때리면 안되니까 리턴
        }
        System.out.println("target의 주소: " + target);
        System.out.println("this의 주소: " + this);
        // 맞은녀석의 체력을 10 감소시킬거임
        int damage = (int) (Math.random() * 6 + 10);

        target.hp -= damage;

        // 전투로그를 출력할거임
        // 가해자가 피해자를 공격해서 xxx의 피해를 입힘
        // this
        System.out.printf("%s님이 %s님을 공격해서 %d의 피해를 입힘!\n", this.nickName, target.nickName, damage);
    }
}
