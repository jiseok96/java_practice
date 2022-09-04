package JavaStudyThird.finals;

/*



final: 다른 곳에서 절대 못바꿈. 값을 고정해버림

 */


class Calculator{

    static final double PI = 3.14;      // final을 설정하면 다른 곳에서 사용자가 절대 바꾸지 못함.
    int left, right;

    public void setOprands(int left, int right){
        this.left = left;
        this.right = right;
        //Calculator.PI = 6;   // ERROR 발생. 이미 final로 고정되어있으므로
    }
    public void sum(){
        System.out.println(this.left+this.right);
    }
    public void avg(){
        System.out.println((this.left+this.right)/2);
    }
}


public class ClaculatorDemo1 {
    public static void main(String[]args){
        Calculator c1 = new Calculator();
        c1.setOprands(10, 20);
        c1.sum();
        c1.avg();
//        c1.PI = 6;   // 마찬가지로 여기서도 못바꿈
    }
}

