package objects;


/*
- 클래스 변수와 인스턴스 변수에 대한 설명
- 상속에 대한 설명
 */


class Calculator{
    int left, right;                // 인스턴스 변수. 클래스를 통해 생성된 각 객체가 다른 값들을 가짐
    static double PI = 3.14;        // 클래스 변수. 모든 객체가 동일한 값을 가짐
    static int base = 0;

    public void setOprands(int left, int right){
        this.left = left;           // this : Calculator 클래스를 통해 만들어진 인스턴스 (c1, c2)를 가리킴
        this.right = right;         // 즉, 위에서 선언한 클래스변수 left, right를 가리킴
                                    // 만약 받아오는 매개변수가(int left, int right) 중복되지 않으면(ex int _left, int _right)
                                    // this가 없어도 전역변수인 left, right를 사용할 수 있음.
                                    // 왜냐면 java가 지역변수 left, right에 해당하는 값이 없으면 전역변수에서 찾아보기 때문
    }

    public void sum(){
        System.out.println(this.left + this.right + base);
    }    // 클래스 변수인 base는 따로 설정해주지 않는 이상 0

    public int avg(){
        System.out.println((this.left + this.right) / 2);
        return ((this.left + this.right) / 2);
    }

}


// 상속

class SubtractionableCalculator extends Calculator {      // extends Calculator 를 통해서 상속을 구현할 수 있음
    public void subtract() {                              // Calculator의 기능 + 여기서 구현한 subtract 함수 사용 가능
        System.out.println(this.left - this.right);       // 실제 사용 : public class의 main 함수의 c3에서 사용중
    }
}



/*

□ Overriding : 부모 클래스와 자식클래스에 동일한 메서드를 갖고있는 경우 자식클래스에 정의된 메서드를 사용함. 이것이 메서드 overriding

- 조건 1 : 메서드의 이름이 같아야함
- 조건 2 : 메소드의 매개변수가 동일해야함 (매개변수의 갯수, 매개변수의 타입이 정확히 일치해야함)
- 조건 3 : 메소드의 리턴 타입이 동일해야함

위의 조건들을 메서드의 서명(signature) 이라고 이야기함. 즉 메서드의 signature가 동일해야 overriding을 실행할 수 있음!
메서드의 signature가 다르다면 에러 발생.

 */

class DivisionableCalculator extends SubtractionableCalculator {     // 이처럼 상속된 클래스를 또 상속해서 사용할 수 있음
    public void division(){
        System.out.println(this.left/this.right);
    }

    // 메서드 오버라이딩. 부모에 있는 sum() 과 동일한 메서드를 자식에서 정의해줌
    public void sum(){
        System.out.println("실행 결과는" + (this.left + this.right)+"입니다");
    }

    public int avg(){                     // 상위 클래스와 중복을 피하려면 다음과 같이 super를 사용하면 됨.
        return super.avg();               // 이렇게 정의했을 경우 코드를 수정하고 싶으면 부모꺼를 바꾸면 됨
    }
}



public class CalculatorDemo2 {

    public static void main(String[] args) {

        Calculator c1 = new Calculator();   // c1과 c2는 인스턴스. 동일한 클래스로 만들어졌으나, 서로 다른 변수를 가지고 있음
        c1.setOprands(10, 20);
        c1.sum();
        c1.avg();

        Calculator c2 = new Calculator();
        c2.setOprands(20, 40);
        c2.sum();
        c2.avg();
        c2.base = 10;   // Calculator 클래스로 생성한 객체 c2의 클래스변수인 base의 값을 바꾸자, 바꾼 값이 입력됨을 확인할 수 있음
        c2.sum();

        // 상속의 사용: SubtractionableCalculator 클래스의 사용
        SubtractionableCalculator c3 = new SubtractionableCalculator();
        c3.setOprands(10, 20);
        c3.sum();
        c3.subtract();

        // 상속의 사용 2: 상속된 클래스를 당연히 또 상속할 수 있음
        DivisionableCalculator c4 = new DivisionableCalculator();
        c4.setOprands(30, 40);
        c4.subtract();
        c4.division();
        c4.sum();               // 실행 시 자식클래스의 sum() 메서드가 실행됨

    }
}
