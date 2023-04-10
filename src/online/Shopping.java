package online;

//쇼핑몰 주문 및 재고관리
public class Shopping {
    private String no; // 주문번호
    private String title; // 상품정보
    private int price; // 상품가격
    private int amount; // 상품수량
    private int tPrice; // 배송비용

    //getter, setter
    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int gettPrice() {
        return tPrice;
    }

    public void settPrice(int tPrice) {
        this.tPrice = tPrice;
    }

    // toSTring()
    @Override
    public String toString() {
        return "Shopping [no=" + no + ", title=" + title + ", price=" + price + ", amount=" + amount + ", tPrice="
                + tPrice + "]";
    }
}