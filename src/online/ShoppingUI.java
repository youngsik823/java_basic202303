package online;
import java.util.*;

public class ShoppingUI {
    Scanner sc = new Scanner(System.in);
    ShoppingManager sm = ShoppingManager.getInstance();

    int sel, sel2, sel3;
    public void totalService() {
        while(true) {
            System.out.println("*********당신은 누구십니까?*********");
            System.out.println("1. 판매자");
            System.out.println("2. 구매자");
            System.out.println("0. 종료하기");
            System.out.print("입력 : ");
            int sel = sc.nextInt();
            if(sel==1) {
                sellerService();
            }
            else if(sel==2) {
                buyerService();
            }
            else if(sel==0) {
                quit();
            }
        }
    }

    public void quit() {
        System.out.println("*********종료되었습니다.*********");
        System.exit(0);
    }

    public void sellerService() {
        do {
            System.out.println("*********판매자 관리시스템입니다.*********");
            System.out.println("***********기능을 선택하세요.***********");
            System.out.println("1. 등록");
            System.out.println("2. 삭제");
            System.out.println("3. 목록");
            System.out.println("4. 검색");
            System.out.println("0. 뒤로가기");
            System.out.println("************************************");

            sel2 = sc.nextInt();

            if(sel2==1) {
                //등록
                System.out.println("************************************");
                System.out.println("아래 사항을 입력해 주세요.");
                System.out.print("상품번호 : ");
                String no = sc.next();

                System.out.print("상품정보 : ");
                String info = sc.next();

                System.out.print("상품가격 : ");
                int price = sc.nextInt();

                System.out.print("상품수량 : ");
                int amount = sc.nextInt();

                System.out.print("배송비용 : ");
                int tPrice = sc.nextInt();
                System.out.println("************************************");

                sm.add(no, info, price, amount, tPrice);
            }

            else if(sel2==2) {
                //삭제
                System.out.println("************************************");
                System.out.println("삭제할 상품번호를 입력하세요.");
                sc.nextLine();
                String no = sc.nextLine();
                System.out.println("************************************");
                sm.remove(no);
            }

            else if(sel2==3) {
                //목록
                sm.list();
            }

            else if(sel2==4) {
                //검색
                System.out.println("************************************");
                System.out.println("검색할 상품번호를 입력하세요.");
                String title = sc.nextLine();
                System.out.println("************************************");
                sm.search(title);
            }
            else if(sel2==0) {
                totalService();
            }

        }while(sel2!=0);
    }

    public void buyerService() {
        do {
            System.out.println("************************************");
            System.out.println("***********구매 시스템입니다.************");
            System.out.println("1. 구매하기");
            System.out.println("0. 뒤로가기");
            System.out.println("************************************");
            sel3 = sc.nextInt();

            if(sel3==1) {
                System.out.println("************************************");
                System.out.print("구매할 상품정보를 입력하세요 : ");
                sc.nextLine();
                String title = sc.nextLine();
                sm.search(title);

                System.out.print("구매할 갯수를 입력하세요 : ");
                int num = sc.nextInt();

                sm.update(title, num);

            }
            if(sel3==0) {
                totalService();
            }
        }while(sel3!=0);
    }
}