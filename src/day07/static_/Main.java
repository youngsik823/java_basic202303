package day07.static_;

import day07.util.Utility;

import static day07.util.Utility.*;
import static java.lang.Math.*;
// static 필드와 메서드를 그냥 참조 가능

import javax.swing.text.Utilities;

public class Main {

    public static void main(String[] args) {

        System.out.println(Count.x);
        // static은 객체를 참조를 안해도 바로 접근할수 있다.
//        System.out.println(Math.random());
        System.out.println(random());

//        Count.m1(); // static은 객체 생성 안해도 부를수 있다.
        Count.m1(new Count());

        Count c1 = new Count();
        Count c2 = new Count();

        c2.m2();    // 객체 생성 하고 불러야 한다.
//        c1.x = 10;
        Count.x = 10;
        c2.y = 20;

        c2.x++;
        System.out.printf("c1 = x: %d, y: %d\n", c1.x, c1.y);
        System.out.printf("c2 = x: %d, y: %d\n", c2.x, c2.y);

        Calculator cal1 = new Calculator(); // kim
        Calculator cal2 = new Calculator(); // park

        cal1.color = "빨강";
        cal2.color = "초록";

        System.out.println("cal1 = " + cal1.color);
        Calculator shape = new Calculator();
        Calculator.calcAreaCircle(5);   //원주

        shape.paint("노랑");  // 색깔

//        Utility.makeLine();
//        Utility.makeLine();
//        Utility.makeLine();   // import를 해서 Utility를 뺴고 사용 가능하다.
//        Utility.input("하하호호: ");

            makeLine();
            makeLine();
            makeLine();
            input("하하호호: ");

    }
}