package day09.inter;

public class Duck extends Animal implements Pet {
    // 필드나 생성자의 값을 가져올려면 상속을 해야한다
    // 메서드를 필수적으로 내려줄때는 인터페이스
    // 필드를 내려줄때는 추상클래스
    @Override
    public void eat() {

    }

}

