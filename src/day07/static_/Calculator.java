package day07.static_;

public class Calculator {
    
    String color;   // 계산기 색깔
    static double pi; // 원주율 (static은 값이 정해져 있는 하나의 값을 모두 공유해서 사용할때)
    
    // 원의 넓이를 구하는 메서드
     static double calcAreaCircle(int r) {
        return pi * r * r;
    }

    // 계산기에 색칠을 예쁘게 칠하는 기능
    void paint(String color) {
         this.color = color;
    }

}
