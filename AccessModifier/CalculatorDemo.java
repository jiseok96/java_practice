package AccessModifier;

/*

□ 접근 제어자

public: 클래스 밖에서도 접근할 수 있음
private: 클래스 안에서만 접근할 수 있음

- public이 private을 호출하는 메서드인 경우 private에 접근할 수 있다.


 */


class Calculator{
    private int left, right;                        // c1.left = 100 이런 식으로 변경할 수 없고 setOpragnds를 통해서만 가능

    public void setOprands(int left, int right){
        this.left = left;
        this.right = right;
    }

    private int _sum(){                             // private 이므로 클래스 밖에서 _sum()으로 호출할 수 없음
        return this.left+this.right;
    }

    public void sumDecoPlus(){                      // 이 메서드를 통해서 private인 _sum() 메서드를 실행할 수 있음
        System.out.println("++++"+_sum()+"++++");
    }

    public void sumDecoMinus(){
        System.out.println("----"+_sum()+"----");
    }
}


public class CalculatorDemo {
    public static void main(String[]args){
        Calculator c1 = new Calculator();
        c1.setOprands(10, 20);
        c1.sumDecoPlus();
        c1.sumDecoMinus();
    }

}
