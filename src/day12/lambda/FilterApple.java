package day12.lambda;

import day06.modi.pac1.A;
import day09.inter.Pet;

import java.util.ArrayList;
import java.util.List;

// 사과를 여러 방법으로 필터링
public class FilterApple {

    /**
     * @solution - try1: 사과바구니에서 녹색사과만 필터링 해야한다.
     *
     * @problem :
     * - 만약에 다른 색깔의 사과를 필터링해야한다면?
     * - 새로운 메서드가 필요하다
     *
     * @param1 basket : 여러 사과가 모여있는 바구니
     * @return : 녹색사과들만 보여있는 바구니
     */
    public static List<Apple> filterGreenApples(List<Apple> basket) {
        
        // 녹색사과만 담을 바구니
        List<Apple> greenApples = new ArrayList<>();
        // 반복문을 통해 필터링
        for (Apple apple : basket) {
            if(apple.getColor() == Color.GREEN) {
                greenApples.add(apple);
            }
        }
        return greenApples;
    }

    /**
     * @solution - try 2 : 색상을 파라미터화 한다.
     * @problem
     * -  만약에 필터 키준이 색상이 아니라 무게라면??
     */
    public static List<Apple> filterApplesByColor(List<Apple> basket, Color color) {
        // 특정 색상 사과만 담을 바구니
        List<Apple> filtersApples = new ArrayList<>();
        // 반복문을 통해 필터링
        for (Apple apple : basket) {
            if(apple.getColor() == color) {
                filtersApples.add(apple);
            }
        }
        return filtersApples;
    }

    /**
     * @solution - try 3 : 동작을 파라미터화 한다.
     *                      - 추상적 조건으로 필터링
     *
     * @problem
     * - 오렌지바구니를 필터링 해야한다면?
     * - 전자제품바구니를 필터링해야된다면?
     *
     */

    public static List<Apple> filterApples(List<Apple> basket, ApplePredicate p) {
        // 특정 색상 사과만 담을 바구니
        List<Apple> filtersApples = new ArrayList<>();
        // 반복문을 통해 필터링
        for (Apple apple : basket) {
            if(p.test(apple)) {
                filtersApples.add(apple);
            }
        }
        return filtersApples;
    }

    /**
     * @solution - try 4 : 제네릭 필터 메서드 생성
     */
    // 제네릭 표시를하면 리턴앞에 <>를 해줘야한다
    public static <T> List<T> filter(List<T> basket, GenericPredicate<T> p) {
        List<T> filterList = new ArrayList<>();
        for (T t : basket) {
            if(p.test(t)) {
                filterList.add(t);
            }
        }
        return filterList;
    }
}

// 추상메서드는 상황에따라 바뀔수 있기때문에 어떻게 오버라이딩에 따라 바뀐다.
