package day04.array;

import java.util.Arrays;

// 스트링배열을 제어하는 설계도
public class StringList {

    // 필드
    String[] sArr;

    // 생성자
    StringList() {
//        System.out.println("StringList 생성자 끌려옴");
        sArr = new String[0];
    }

    StringList(String... initData) {
        sArr = new String[initData.length];
        for (int i = 0; i < sArr.length; i++) {
            sArr[i] = initData[i];
        }
    }


    // 메서드
    // 배열에 저장된 데이터 수를 알려주는 기능
    int size() {
        return sArr.length;
    }

    // 배열에 맨 끝에 데이터를 추가하는 기능
    void push(String newData) {
        String[] temp = new String[sArr.length + 1];
        for (int i = 0; i < sArr.length; i++) {
            temp[i] = sArr[i];
        }
        temp[temp.length - 1] = newData;
        sArr = temp;
    }

    // 배열 맨 끝 데이터 삭제하는 기능
    String pop() {
        String deleteTarget = sArr[sArr.length - 1];
        String[] temp = new String[sArr.length - 1];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = sArr[i];
        }
        sArr = temp;
        return deleteTarget;
    }

    // 배열 내부데이터 출력
    public String toString() {
        return Arrays.toString(sArr);
    }

    // 배열이 텅텅 비었는지 확인
    boolean isEmpty() {
        if (sArr.length == 0) {
            return true;
        } else {
            return false;
        }
    }

//    boolean isEmpty() {
//        return sArr.length == 0;
//}
    void clear() {
       sArr = new String[0];
    }
    
    // 인덱스 탐색 (indexOf)
    
    // 자료유무 확인 (includes)
    
    // 중간 삭제 (remove)
    
    // 중간 삽입 (insert)

}