package JavaStudyThird.exception;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionDemo2 {
    public static void main(String[] args){
        //java.io.FileNotFoundException: 해당 파일이 없는 경우
        BufferedReader bReader = null;
        try {
            bReader = new BufferedReader(new FileReader("out.txt"));    // 해당 파일이 java_practice 안에 들어있어야함
        } catch (FileNotFoundException e) {                                     // 파일이 없는 경우 FileReader라는 생성자는 예외를 발생시켜 사용자가 에러를 처리하라고 던짐
            e.printStackTrace();
//            throw new RuntimeException(e);
        }

        String input = null;
        try {
            input = bReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
//            throw new RuntimeException(e);
        }
        System.out.println(input);
    }
}
