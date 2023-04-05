package 복습.book;

public class BookUser {
    private String name;
    private int age;
    private char gender;
    private int couponCount = 0;
    public BookUser() {
    }

    public BookUser(String name, int age, char gender, int couponCount) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.couponCount = couponCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getCouponCount() {
        return couponCount;
    }

    public void setCouponCount(int couponCount) {
        this.couponCount = couponCount;
    }
    public String Gender(char gender) {
        return (gender=='M') ?"남자" : "여자";
    }
    public String Member() {
        return String.format("이름: %s, 나이: %d, 성별: %s, 쿠폰개수: %d", this.name, this.age, Gender(this.gender), this.couponCount);
    }
}
