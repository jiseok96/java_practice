package JavaStudyThird.exception;

/*

□ 나만의 예외처리 만들기

1. checked인지 unchecked인지 정하기
   - checked 사용 : API 쪽에서 예외를 던졌을 때 API 사용자 쪽에서 예외 상황을 복구할 수 있는 경우
   - unchecked 사용 : 사용자가 API 사용법을 어겨서 발생하는 문제거나 예외 상황이 이미 발생한 시점에서 그냥 프로그램을 종료하는 것이 덜 위험한 경우.

 */


/*

아래의 내용은 RuntimeException 클래스 하에 DivideException을 만들기.
만약 Exception 클래스를 상속받도록 만들었다면, calculator class에서 선언했을 때 에러가 발생함.
- exception 클래스를 상속받게 된다는 것은 checked 가 된다는 뜻이니까. try catch문을 사용하거나, 사용자에게 오류처리를 넘겨버려야함.

 */



class DivideException extends RuntimeException{

    public int left;
    public int right;

    // 아래에서 생성자를 선언했으므로, 기본생성자를 따로 만들어준 것
    DivideException(){
        super();
    }

    // 부모 클래스의 생성자를 호출할 때 message를 전달 > ArithmeticException 이 문자열을 받고 있으므로, 그걸 구현하기 위해 새로운 생성자를 만든 것
    DivideException(String message){
        super(message);
    }

    DivideException(String message, int left, int right){
        super(message);
        this.left = left;
        this.right = right;
    }
}

class calculator {
    int left, right;
    public void setOprands(int left, int right){
        this.left = left;
        this.right = right;
    }

    public void divide(){

        // 이런 식으로 left, right 값을 받으면, 해당 상태에 대한 값이 DivideException 클래스의 변수에 저장이되므로
        if(right==0){
            throw new DivideException("0으로 나눌 수 없습니다.", this.left, this.right);
        }
        System.out.println(this.left/this.right);
    }

}



public class CalculatorDemo2 {
    public static void main(String[] args){
        calculator c1 = new calculator();
        c1.setOprands(10, 0);
        try {
            c1.divide();                             // 10을 0으로 나누기 때문에 오류 발생(ArithmeticException: 수학적인 에러 발생, at: 발생 위치)
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
//            System.out.println(e.left);
//            System.out.println(e.right);
        }
    }
}

