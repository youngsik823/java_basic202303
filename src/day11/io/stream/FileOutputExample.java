package day11.io.stream;

import java.io.*;

public class FileOutputExample {

    public static void main(String[] args) {

        String msg = "멍멍이는 ~~~ 왈왈~\n하하호호";

        // 데이터를 외부로 내보낼때 출력스트림
        // try 블록 안에 선언을 해줘야 알아서 오토크로징을 제공
        try ( FileOutputStream fos = new FileOutputStream("D:/exercise/dog.txt");) {
           

            fos.write(msg.getBytes());  // getBytes는 문자열을 바이트로 바꿔줌
            System.out.println("파일 저장에 성공!");

        } catch (FileNotFoundException e) {
            System.out.println("파일 저장 처리에 실패했습니다.");
        } catch (IOException e) {
            System.out.println("출력 시스템에 문제가 생겼습니다.");
        } 

        /* finally {
            try {
               if(fos != null) fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }*/
    }
}
