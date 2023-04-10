package day11.io;

// 상수만 저장할꺼면 interface 사용하는게 좋다
public interface Path {

    // 인터페이스는 필드를 못가짐, 모든 변수가 상수화
    String ROOT_PATH = "D:/exercise";
    String MEMBER_SAVE_PATH = ROOT_PATH + "/member";
}
