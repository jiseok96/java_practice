package JavaStudyThird.exception;

/*

□ 예외 처리

try ~ catch: 예외 처리를 위한 문법
형태: try{ } catch(exception e){ }

try: 에러를 발생할 수 있는 경우 try문에 묶어서 넣어줘.
catch: 에러가 발생하는 경우 catch절 사용
e: 에러에 대한 정보를 갖고있는 개체를 catch문에 전달. exception은 타입.


// 예외 처리의 발생이 이해하기 조금 어렵다 ..


 */

class Calculator{
    int left, right;
    public void setOprands(int left, int right) {
        this.left = left;
        this.right = right;
    }

    /*

    □ Exception의 발생

    throw를 실행시키면, JAVA는 divide를 실행할 때, throw 뒤에 있는 객체를 자바 가상머신이 갖고있다가, try문 전에 중단하고
    divide를 호출한 main 메소드를 봤는데 try가 있다면, 거기 있는 catch 중에서, 지금 발생한 exception과 동일한 데이터타입을 가진 catch 구문을 찾아서,
    catch 구문을 메서드처럼 실행을 하는데, 그 때 우리가 new라고 선언한 인스턴스(ArithmeticException)를 e라는 변수에 넣어줘.

    그러면 그 변수 안에는 우리가 new를 통해 생성한 ArithmeticException 인스턴스가 들어가있고, 그 인스턴스의 상태중에 에러메세지("0으로 나눌 수 없습니다")를 내부적으로 갖고있음.
    그 상태에서 getMessage를 호출했기 때문에 메세지"0으로 나눌 수 없습니다"를 돌려주는 것이지.



     */

    public void divide(){
        if(right == 0){
            throw new ArithmeticException("0으로 나눌 수 없습니다.");  // exception을 발생시킴. 여기에 인자로 준 값이 getMessage() 시에 출력됨.
        }
        try {
            System.out.println("계산결과는");
            System.out.println(this.left / this.right);
            System.out.println("입니다.");
        } catch (Exception e){
            System.out.println("\n\ne.getMessge()\n" + e.getMessage());     // 가장 간단한 예외상황에 대한 힌트 제공
            System.out.println("\n\ne.toString()\n" + e.toString());        // e라는 인스턴스에 대한 더 자세한 정보 제공
            System.out.println("\n\ne.printStackTrace()");                  // 화면에 에러를 띄움
            e.printStackTrace();
        }
    }
}

public class CalculatorDemo {
    public static void main(String[] args){
        calculator c1 = new calculator();
        c1.setOprands(10, 0);
        try {
            c1.divide();                             // 10을 0으로 나누기 때문에 오류 발생(ArithmeticException: 수학적인 에러 발생, at: 발생 위치)
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }

    }
}
