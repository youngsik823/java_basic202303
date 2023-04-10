package day10.generic;

import day04.array.StringList;
import day09.song.Artist;

public class Main {

    public static void main(String[] args) {

        AppleBasket ab = new AppleBasket();
        ab.setApple(new Apple());
        Apple apple = ab.getApple();

        BananaBasket bb = new BananaBasket();
        bb.setBanana(new Banana());

        Basket<Apple> apples = new Basket(); // 특정 과일만 가져오게함
        apples.setFruit(new Apple());
//        apples.setFruit(new Banana());

        Apple fruit = apples.getFruit();

        Basket<Banana> bananas = new Basket<>();
//        bananas.setFruit(new Apple());
        bananas.setFruit(new Banana());

        Banana fruit1 = bananas.getFruit();

        MyList<String> sl = new MyList<>();
        sl.push("짬뽕");
        sl.push("짜장");
        sl.push("탕수육");

        System.out.println(sl);

        MyList<Integer> numbers = new MyList<>();

        numbers.push(10);
        numbers.push(20);
        numbers.push(30);

        MyList<Artist> artists = new MyList<>();

        artists.push(new Artist("동방신기", new StringList("Hug")));
    }
}
