package objects;

class Calculator{
    int left, right;

    public void setOprands(int left, int right){
        this.left = left;           // this : Calculator 클래스를 통해 만들어진 인스턴스 (c1, c2)를 가리킴
        this.right = right;         // 즉, 위에서 선언한 클래스변수 left, right를 가리킴
    }

    public void sum(){
        System.out.println(this.left + this.right);
    }

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

    }
}
