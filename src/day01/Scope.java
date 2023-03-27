package day01;

public class Scope {

    public static void main(String[] args) {

        // 자바는 블록단위 스코프를 가짐
        int n1 = 10;
        int n2 = 20;  // main 블록에서 생성된 변수

        if(true) {
            int n3 = n1 + n2;
            System.out.println(n3);
        }
        // 쉽게 말하면 블록 밖으로 나가면 죽음

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

    }// end main
    // n1 n2는 main 나가면 죽음
//    int n3 = n1 + n2;
}
