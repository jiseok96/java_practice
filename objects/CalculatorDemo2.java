package objects;

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

    public void avg(){
        System.out.println((this.left + this.right) / 2);
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

    }
}
