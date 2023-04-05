package day07.util;

import java.util.Scanner;

public class Utility {
    private static Scanner sc= new Scanner(System.in); // Scanner은 static이 아니라서 static을 붙여줘야한다
                                               // static안에는 static만 가능
    // 구분선을 출력하는 기능
    public static void makeLine() {
        System.out.println("============================");
    }
    
    // 문자열을 입력받는 기능
    public static String input(String message) {
        System.out.print(message);
        return sc.nextLine();
    }
}
