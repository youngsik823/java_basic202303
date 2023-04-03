package day04;

import java.util.Scanner;

public class StringCompare {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String myName = "홍길동";
        String inputName = sc.nextLine();

        System.out.println("myName = " + myName);
        System.out.println("inputName = " + inputName);

        // 기본타입 말고 다 equals로 객체들을 비교 해주는게 좋다
        if (myName.equals(inputName)) {
            System.out.println("두 이름이 일치함!");
        } else {
            System.out.println("두 이름이 일치하지 않음!");
        }


    }
}