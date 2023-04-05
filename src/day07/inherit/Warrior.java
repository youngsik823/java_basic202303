package day07.inherit;

// 서브 클래스 (자식 클래스)
public class Warrior extends Player {
              //자식          // 부모
    int rage; // 분노게이지

    public Warrior() {
        this("이름없음");
    }

    public Warrior(String nickName) {
        super(nickName); // 부모 클래스 불러오기 (숨어있음)
        this.rage = 20;
    }

    // 캐릭터 상태창을 보는 기능

    // 파워슬래시
    public void powerSlash() {
        System.out.println("파워슬래시를 시전합니다.");
    }

    // 오버라이딩
    // 조건: 부모의 시그니처(리턴타입, 이름, 파라미터)를 똑같이 사용
    // 접근제한자는 무조건 부모보다 public해야 함. (높아야된다는말?)
    // 시그니처를 다르게하면 완전 다른 함수를 만든거랑 같다??
    @Override // 오버라이딩 검사를 진행해줌
    public void showStatus() {
        super.showStatus(); // 부모꺼를 부르기
        System.out.println("# rage : " + this.rage);
    }

}