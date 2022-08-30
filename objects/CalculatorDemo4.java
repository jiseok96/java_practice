package objects;

/*

□ 생성자

CalculatorDemo2를 보자. setOprands 함수를 통해서 left, right를 설정해줘야 설정된 값들로 연산이 되겠지.
다른말로 하면 Calculator를 사용하기 위해서는 setOprands를 해야만 한다는 것인데, 이것은 좀 비효율적.

따라서 아예 Calculator를 생성할 때, left, right를 받아버리면 되겠지. 이것을 도와주는 것이 '생성자'

□ 생성자의 형태 : public 생성자이름(){}
  - 메소드(생성자)의 이름이 class와 동일해야함

□ 생성자의 특징
  - 생성자를 따로 생성하지 않았을 경우, 자바에서 자동으로 생성자를 만들어줌
  - 자동으로 생성된 생성자는 클래스 이름과 동일하고, 매개변수를 받지 않으며 아무것도 실행하지 않음
  - 하지만 매개변수를 1개 받는 생성자가 정의되어있는 경우, 자바는 아무것도 받지 않는 생성자를 자동으로 만들어주지 않음

 */

class Calculator02 {
    int left, right, top, down;
    String name;
    public Calculator02(int left, int right){       // 이게 생성자. 클래스와 동일한 이름을 가짐. 기존 setOprands가 하던 일을 함
        this.left = left;                           // java는 class 가 생성될 때, 그 class랑 똑같은 이름의 메서드가 선언되도록 약속되어있음
        this.right = right;                         //
    }

    // 메서드 overloading : 동일한 이름의 메서드여도 매개변수의 수와 타입이 다르면 다른 메서드로 취급됨

    public Calculator02(int top){
        this.top = top;
    }                                               // 생성자는 이름이 동일하더라도, 받아오는 매개변수가 다르다면 상관없음. 이것이 overloading

    public Calculator02(String name){                      // Calculator 객체 생성 시 값을 하나만 줬을 때, 준 값이 int 면 위에꺼, String이면 아래꺼를 실행.

    }

    public void sum(){
        System.out.println(this.left + this.right);
    }

    public void avg(){
        System.out.println((this.left + this.right) / 2);
    }
}

/*
자식 클래스를 만들 때, 부모클래스에 기본생성자 (input을 받지 않는 생성자) 가 없는 경우 에러가 발생
 - 해결 방법 1 : 부모클래스에 기본생성자를 만들어준다
 - 해결 방법 2 : super 사용해서 직접 정의해놓은 생성자를 사용한다.

super :

 */

class subtractionCalculator2 extends Calculator02{
    public subtractionCalculator2(int left, int right) {
        super(left, right);                       // super는 부모클래스를 이야기함. super하고 ()가 붙어있으면 부모클래스의 생성자라는 뜻
    }                                             // 여기서 보면 subtractionCalculator2에서 받은 두 매개변수를 부모클래스의 생성자에 준다는 뜻이지
}                                                 // super를 사용할 때는 super가 가장 먼저 나타나야함. 부모가 초기화되고 나서야 자식이 초기화될 수 있게끔 하려고 있는 정책.

public class CalculatorDemo4 {

    public static void main(String[] args){
        // 해당 함수 안에서 기능을 실행하세요
        Calculator02 c1 = new Calculator02(10, 20);  // 여기서 new로 생성할 때 Calculator02는 클래스가 아니야. 이 Calculator02는 생성자. \
    }                                                          // 인스턴스를 생성하는 것. 이라는 의미에서 생성자라는 이름이 붙은 것이지


}
