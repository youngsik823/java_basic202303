package day07.lotto;

import java.util.Arrays;

public class Lotto {
    public static int[] arr;
    public static int[] temp;
    public static void information() {
        arr = new int[6];
        temp = new int[arr.length];
        for (int i = 0; i < temp.length; i++) {
            temp[i]=(int) (Math.floor(Math.random()*43)+1);
        }
        arr = temp;
        temp = null;
        System.out.println(Arrays.toString(arr));
    }
    public static boolean compare(int[] arr, int input) {
        for (int i1 : arr) {
            if(input == i1){
                System.out.println("# 중복된 숫자입니다.");
                return true;
            }
        }
        return false;
    }

}
