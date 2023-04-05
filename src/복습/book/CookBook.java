package 복습.book;

public class CookBook extends Book{
    private boolean coupon;

    public CookBook() {

    }

    public CookBook(boolean coupon) {
        this.coupon = coupon;
    }

    public CookBook(String title, String author, String publisher, boolean coupon) {
        super(title, author, publisher);
        this.coupon = coupon;
    }

    public boolean isCoupon() {
        return coupon;
    }

    public void setCoupon(boolean coupon) {
        this.coupon = coupon;
    }

    public String info() {

        return String.format("제목: %s, 저자: %s, 발행자: %s, 쿠폰유무: %b",super.getTitle(), super.getAuthor(), super.getPublisher(), this.coupon);

    }
}
