package JavaStudyThird.exception;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*

- B에 대해 C는 사용자
- C에 대해 ThrowExceptionDemo가 사용자
- ThrowExceptionDemo는 결국 일반 사용자가 사용

B에서 에러가 발생하면, 그 에러의 처리를 C에게 넘길 수 있어. 마찬가지로 C는 그 처리를 ThrowExceptionDemo에게 넘길 수도 있지.

 */

class B{
    // ExceptionDemo2의 기능을 여기로 가져옴.
    void run() throws FileNotFoundException, IOException {        // throws 에러내용: 사용자에게 해당 에러가 발생할 수 있다고 전달. 해당 에러를 처리할 것을 강제함.
        //java.io.FileNotFoundException: 해당 파일이 없는 경우
        BufferedReader bReader = null;
        String input = null;

        // 아래서 에러들을 처리했으므로 여기서 try catch문을 삭제할 수 있음.
        bReader = new BufferedReader(new FileReader("out.txt"));
        input = bReader.readLine();
        System.out.println(input);
    }
}

class C{

    // 여기서도 IOException을 throws 해버렸으니, 아래의 IOException 에 대한 catch문을 없앨 수 있겠지
    void run() throws IOException{
        B b = new B();

        // 위에서 정의한 에러에 대한 처리
        try {
            b.run();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);              // 강의에서는 e.printStackTrace()가 구현되는데, 여기서는 자동으로 throw new 를 해버림
        } catch (IOException e) {                       // throw new가 뭘까 ?
            throw new RuntimeException(e);
        }
    }
}

public class ThrowExceptionDemo {
    public static void main(String [] args){
        C c = new C();
        try {
            c.run();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
