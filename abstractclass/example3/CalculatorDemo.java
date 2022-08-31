package abstractclass.example3;



/*

run 이라는 메서드는 여기서 정의해주고,
사용자는 Calculator라는 클래스를 상속받을 클래스를 직접 만들어준 후에, sum과 avg를 정의해서 사용해야함

 */

abstract class Calculator{
    int left, right;
    public void setOprands(int left, int right){
        this.left = left;
        this.right = right;
    }

    public abstract void sum();
    public abstract void avg();

    public void run(){
        sum();
        avg();
    }
}

/*
사용자 1: Calculator를 상속받는 클래스를 하나 생성하여
sum 과 avg 메서드를 overriding 하여 사용함.
 */

class CalculatorDecoPlus extends Calculator{
    public void sum(){
        System.out.println("+ sum:"+(this.left+this.right));
    }
    public void avg(){
        System.out.println("+ avg:"+((this.left+this.right)/2));
    }
}


/*
사용자 2: Calculator를 상속받는 클래스를 하나 생성하여
sum 과 avg 메서드를 overriding 하여 사용함.
 */

class CalculatorDecoMinus extends Calculator{
    public void sum(){
        System.out.println("- sum:"+(this.left+this.right));
    }
    public void avg(){
        System.out.println("- avg:"+((this.left+this.right)/2));
    }
}

/*
여기서, 사용자 1과 사용자 2가 만든 코드에 중복이 있어 (this.left+this.right)
이런 애들은 메소드로 뽑아서 부모클래스인 Calculator에 정의해줄 수 있겠지


ex)

int _sum(){
    return this.left + this.right
}

*/


public class CalculatorDemo {
    public static void main(String[] args){
        CalculatorDecoPlus c1 = new CalculatorDecoPlus();   // CalculatorDecoPlus 클래스를 인스턴스화
        c1.setOprands(10, 20);                    // 부모클래스인 Calculator에 정의되어있는 메서드 실행. 계산기에 필수적인 메서드이므로 부모클래스에 정의해놓은거지
        c1.run();                                           // 1. 자식클래스에는 run이 없으므로 부모클래스에 정의되어있는 run을 실행. 그러면 부모클래스의 sum, avg를 실행함.
                                                            // 2. 근데 부모클래스 run, avg에는 정의되어있는게 없잖아? 그니까 자식클래스에 정의된 sum과 avg를 실행
    }                                                       // 즉, 메서드 실행 순서는 부모클래스에 정의해놓고(run), 그 구체적인 실행은 자식클래스에 정의한 것(sum, avg)
}
