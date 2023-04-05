package 복습.book;

import day07.protec.pac1.B;

import java.sql.Statement;
import java.util.Scanner;

public class BookView {
//    private static BookUser bookUser;
    public static Scanner sc = new Scanner(System.in);
    public static void BookSelect() {
        UserInfo();
        while (true) {
            BookMenu();
            System.out.println("메뉴 번호");
            int num = Integer.parseInt(sc.nextLine());
            switch (num) {
                case 1:
                    BookUser bookUser = new BookUser();
                    bookUser.Member();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 9:
                    break;
            }
        }
    }

    private static void BookMenu() {
        System.out.println("============ 도서 메뉴 =============");
        System.out.println("# 1. 마이페이지");
        System.out.println("# 2. 도서 전체 조회");
        System.out.println("# 3. 도서 검색");
        System.out.println("# 4. 도서 대여하기");
        System.out.println("# 9. 프로그램 종료하기");
    }
    public static void UserInfo() {
        System.out.println("# 회원 정보를 입력해주세요.");
        System.out.print("이름: ");
        String name = sc.nextLine();
        System.out.print("나이: ");
        int age = Integer.parseInt(sc.nextLine());
        System.out.print("성별(M/F): ");
        char gender = sc.nextLine().charAt(0);

        BookUser bookUser = new BookUser();
        bookUser.setName(name);
        bookUser.setAge(age);
        bookUser.setGender(gender);
    }
    public static void start() {
        UserInfo();
        BookSelect();

    }
}
