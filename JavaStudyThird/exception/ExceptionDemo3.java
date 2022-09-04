package JavaStudyThird.exception;


/*

checked vs unchecked

- checked: 부모 중에 RuntimeException이 없음. 반드시, 그 예외처리가 존재해야함
- unchecked: 부모 중에 RuntimeExcetion이 있음. 예외처리를 해도되고 안해도됨

ArithmeticException vs IOException

- ArithmeticException은 예외를 처리하지 않아도 컴파일 에러가 발생하지 않음
- IOException은 예외처리를 하지 않으면 컴파일이 되지 않으므로 try catch를 사용하거나, throw를 통해 사용자가 정의하도록 넘겨줘야함



 */


import java.io.IOException;

class E{
    void throwArithmeticException(){
        throw new ArithmeticException();
    }
    void throwIOException(){
        try{
            throw new IOException();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
    void throwIOException2() throws IOException{
        throw new IOException();
    }
}

public class ExceptionDemo3 {
}
