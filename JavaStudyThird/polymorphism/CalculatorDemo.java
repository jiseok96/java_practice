package JavaStudyThird.polymorphism;


/*

abstract 에서 사용하던 예시를 그대로 사용(example 3)

 */

abstract class Calculator{
    int left, right;
    public void setOprands(int left, int right){
        this.left = left;
        this.right = right;
    }

    int _sum(){
        return this.left + this.right;
    }

    public abstract void sum();
    public abstract void avg();

    public void run(){
        sum();
        avg();
    }
}

class CalculatorDecoPlus extends Calculator {
    public void sum(){
        System.out.println("+ sum:"+(this.left+this.right));
    }
    public void avg(){
        System.out.println("+ avg:"+((this.left+this.right)/2));
    }
}

class CalculatorDecoMinus extends Calculator {
    public void sum(){
        System.out.println("- sum:"+(this.left+this.right));
    }
    public void avg(){
        System.out.println("- avg:"+((this.left+this.right)/2));
    }
}




public class CalculatorDemo {
    public static void execute(Calculator cal){
        System.out.println("실행 결과");
        cal.run();
    }

    public static void main(String[] args){

        /* 다형성의 사용
            - 클래스에서 다형성의 사용을 통해 실행클래스에 정의되어있는 메서드 execute를 사용할 수 있음
         */
        Calculator c1 = new CalculatorDecoPlus();
        c1.setOprands(10, 20);
        c1.run();

        Calculator c2 = new CalculatorDecoMinus();
        c2.setOprands(10, 20);
        c2.run();

        execute(c1);
        execute(c2);

        // 다형성을 사용하지 않았다면

//        CalculatorDecoPlus c1 = new CalculatorDecoPlus();
//        c1.setOprands(10, 20);
//        c1.run();
//
//        CalculatorDecoMinus c2 = new CalculatorDecoMinus();
//        c2.setOprands(10, 20);
//        c2.run();
//
//        execute(c1);
//        execute(c2);

        /*

        이와 같이 코드가 구성되었을 것이고
        execute 메서드의 매개변수도 Calculator를 CalculatorDecoPlus (or CalculatorDecoMinus) 로 특정해서 정의했어야함.
        그럴 경우 execute(c1) or execute(c2) 중에 하나만 실행이 되었을 것.

        따라서 동일한 내용의 execute 메서드를 매개변수만 달리해서 오버라이딩했어야겠지 > 반복의 발생

        이걸 다형성을 통해서
        1. execute 메서드의 매개변수 타입을 부모클래스로 줄 수가 있는거고,
        2. 생성되는 CalculatorDecoPlus, CalculatorDecoMinus 의 타입을 부모클래스인 Calculator로 지정해줄 수가 있는 것이지
         */



    }
}


