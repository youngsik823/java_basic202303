package day10.generic;

public class Basket<Fruit> {
    // 나중에 결정되는 타입이라서 제네릭타입을 아무거나 적어도된다 (복제)
    private Fruit fruit;

    public Fruit getFruit() {
        return fruit;
    }

    public void setFruit(Fruit fruit) {
        this.fruit = fruit;
    }
}
