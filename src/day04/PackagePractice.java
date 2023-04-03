package day04;
// 패키지는 무조건 소문자로 써야한다.
import fruits.Banana;
// import를 쓰므로써 fruits. 은 안쓰고 사용해도된다.
import java.util.Scanner;

//import fruits.Grape;
//import juice.Apple;
import  fruits.*;
// *은 클래스 자리에만 쓰인다.

public class PackagePractice {

    public static void main(String[] args) {

        new fruits.Apple();
        // 패키지로 구분가능
        // 같은 패키지 안에 있을때는 생략 가능
        new Banana();
        new Grape();

        Scanner sc = new Scanner(System.in);

    }
}
