package day09.final_;

public class Main {

    public static void main(String[] args) {

        Person kim = new Person("김철수",
                "000111-3121234", "대한민국",
                new BagPack(5, "샘소나이트")
        );


        kim.name = "김출수";
//        kim.ssn = "021111-2222222"; // final을 걸었기 때문에 변경불가

    }
}
