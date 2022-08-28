package objects;

/*

□ 생성자

CalculatorDemo2를 보자. setOprands 함수를 통해서 left, right를 설정해줘야 설정된 값들로 연산이 되겠지.
다른말로 하면 Calculator를 사용하기 위해서는 setOprands를 해야만 한다는 것인데, 이것은 좀 비효율적.

따라서 아예 Calculator를 생성할 때, left, right를 받아버리면 되겠지. 이것을 도와주는 것이 '생성자'
 */

class Calculator02 {
    int left, right;
    public Calculator02(int left, int right){       // 이게 생성자. 클래스와 동일한 이름을 가짐. 기존 setOprands가 하던 일을 함
        this.left = left;                           // java는 class 가 생성될 때, 그 class랑 똑같은 이름의 메서드가 선언되도록 약속되어있음
        this.right = right;                         //
    }

    public void sum(){
        System.out.println(this.left + this.right);
    }

    public void avg(){
        System.out.println((this.left + this.right) / 2);
    }
}

public class CalculatorDemo4 {

    public static void main(String[] args){
        // 해당 함수 안에서 기능을 실행하세요
        Calculator02 c1 = new Calculator02(10, 20);  // 여기서 new로 생성할 때 Calculator02는 클래스가 아니야. 이 Calculator02는 생성자. \
    }                                                          // 인스턴스를 생성하는 것. 이라는 의미에서 생성자라는 이름이 붙은 것이지


}
