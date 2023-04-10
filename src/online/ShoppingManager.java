package online;

public class ShoppingManager {
    private static ShoppingManager instance;
    public static ShoppingManager getInstance() {
        if( instance == null )
            instance = new ShoppingManager();
        return instance;
    }

    private Shopping[] sh;
    private int MAX_SIZE = 100;
    private int idx;

    private ShoppingManager() {
        sh = new Shopping[MAX_SIZE];
        idx= 0;
    }



    //등록
    public void add(String no, String title, int price, int amount, int tPrice) {
        Shopping s = new Shopping();
        s.setNo(no);
        s.setTitle(title);
        s.setPrice(tPrice);
        s.setAmount(amount);
        s.settPrice(tPrice);

        sh[idx++] = s;
    }

    //삭제
    public void remove(String no) {
        for(int i=0;i<idx;i++) {
            if(sh[i].getNo().equals(no)) {
                for(;i<idx;i++) {
                    sh[i] = sh[i+1];
                }
                idx--;
            }
        }
    }

    //목록
    public void list() {
        System.out.println("************************************");
        for(int i=0;i<idx;i++)
            System.out.println(sh[i]);
        System.out.println("************************************");
    }

    //검색
    public void search(String title) {
        for(int i=0;i<idx;i++) {
            if(sh[i].getTitle().equals(title)) {
                System.out.println(sh[i]);
            }
        }

    }

    //수량 업데이트
    public void update(String title, int num) {
        for(int i=0;i<idx;i++) {
            if(sh[i].getTitle().equals(title)) {

                //sh배열에서 Amount가 0이거나 Amout에서 num을 뺀 값이 음수면 재고가 없다 출력
                if((sh[i].getAmount() == 0) || (sh[i].getAmount()-num)<0) {
                    System.out.println("재고가 없습니다.");
                }
                else {
                    sh[i].setAmount((sh[i].getAmount()-num));
                    System.out.println("구매가 완료되었습니다.");
                }
            }
        }
    }
}