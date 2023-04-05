package day07.lotto;

import java.util.Arrays;
import java.util.Scanner;

public class LottoSimulator {
    public static int[] arr;
    public static int[] temp;
    public static Scanner sc = new Scanner(System.in);
    public static int count;
    public static int i = 0;

    public static void run() {
        arr = new int[6];
        temp = new int[arr.length];
        while (i<6) {
            System.out.print(i + 1 + "번째 번호 >>");
            int input = Integer.parseInt(sc.nextLine());
            if(Lotto.compare(arr, input)){
                continue;
            }
            arr[i] = input;
            i++;
        }

        while (true) {
            ++count;
            for (int j = 0; j < temp.length; j++) {
                temp[j] = (int) (Math.floor(Math.random() * 10) + 1);
            }
//            System.out.println(Arrays.toString(temp));
//            System.out.println(Arrays.toString(arr));
            if (Arrays.equals(arr, temp)) {
                System.out.println("# " + count + "장만에 1등에 담청되었습니다. ㅊㅋㅊㅋ");
                break;
            }
            System.out.println("# " + count + "장째 구매중... ㅠㅠ");
        }


    }

}
