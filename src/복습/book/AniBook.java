package 복습.book;

public class AniBook extends Book{
    private int accessAge;

    public AniBook() {

    }

    public AniBook(int accessAge) {
        this.accessAge = accessAge;
    }

    public AniBook(String title, String author, String publisher, int accessAge) {
        super(title, author, publisher);
        this.accessAge = accessAge;
    }

    public int getAccessAge() {
        return accessAge;
    }

    public void setAccessAge(int accessAge) {
        this.accessAge = accessAge;
    }

    public String info() {
        return String.format("제목: %s, 저자: %s, 발행자: %s, 나이제한: %b",super.getTitle(), super.getAuthor(), super.getPublisher(), this.accessAge);
    }
}
