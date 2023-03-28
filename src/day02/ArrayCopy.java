package day02;

import java.util.Arrays;

public class ArrayCopy {
    public static void main(String[] args) {

        // 배열 복사 알고리즘
//        String[] pets = new String[] {"멍멍이", "야옹이", "쨱쨱이"};

        // 선언과 동시에 초기화한다면 new Type[] 생략가능

//        for (String p : new String[] {"야옹이", "냠냠이", "콩콩이"}) {
//            // 변수 만드는 상황 아니면 무조건 new String[] 를 붙여야 한다.
//            
//        }
        String[] pets = {"멍멍이", "야옹이", "쨱쨱이"};
//        String[] petsCopy = pets;
        // 배열을 복사하는거는 주소를 복사하는거다 즉 공유

        // 1. 원본과 동일한 사이즈의 배열을 하나 더 생성
        String[] petsCopy = new String[pets.length];

        // 2. 원본의 각 인덱스 값들을 사본에 인덱스로 일일히 복사
        for (int i = 0; i < pets.length; i++) {
            petsCopy[i] = pets[i];
        }

        pets[1] = "사마귀";

        System.out.println("원본주소: " + pets);
        System.out.println("사본주소: " + petsCopy);

        System.out.println("원본배열" + Arrays.toString(pets));
        System.out.println("사본배열" + Arrays.toString(petsCopy));
    }
}
