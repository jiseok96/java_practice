package objects;


/*
클래스 메소드에 대한 이해
 */


class Calculator3{

    public static void sum(int left, int right){
        System.out.println(left+right);
    }

    public static void avg(int left, int right){
        System.out.println((left+right)/2);
    }
}


// 실행 클래스



public class CalculatorDemo3 {

    public static void main(String[] args){
        Calculator3.sum(10,20);
        Calculator3.avg(10, 20);

        Calculator3.sum(20, 40);
        Calculator3.avg(20,40);

    }

    /*

이전에는 Calculator c1 = new Calculator(); 와 같은 방법으로 인스턴스를 생성해서 사용했지만, 여기서는 Calculator3로 바로 생성해버림
그것이 가능한 것은 위의 calculator 클래스에서 sum과 avg가 클래스 메소드로 생성되어있기 때문(static이 붙어있음)

즉, static이 붙어있는 static method는 클래스에 직접 접속해서 사용할 수 있음.
이렇게 사용하는 이유?

c1, c2, c3 처럼 여러개의 계산기 인스턴스를 생성하는 것은 각각 다른 값을 가져야하기 때문임
클래스 메소드를 사용한다는 것은, 어떤 상태를 공유할 필요 없이 그냥 한 번만 사용하면 될 때, 굳이 메모리를 사용하면서 인스턴스를 만들 필요가 없으므로
(메모리 절약, 빠른 동작 가능)

 */

}


/*
정리

static 이 붙어있으면 클래스 멤버(변수, 메소드), static이 안붙어있으면 인스턴스 멤버(변수, 메소드)

1. 인스턴스 메소드는 클래스 멤버(클래스 변수, 클래스 메소드)에 접근할 수 있다.
2. 클래스 메소드는 인스턴스 멤버(인스턴스 변수, 인스턴스 메소드)에 접근할 수 없다.

> 이건 당연한거야. 설계도에 해당하는 클래스가 먼저 존재하고, 필요에 따라 인스턴스가 생성되기 때문임
> 인스턴스 변수: Non-static field
  클래스 변수: static field 라고 불리기도 함


즉, 클래스가 갖게되는 성질이 class memeber(class variable, class method)
클래스가 생성한 인스턴스가 갖게되는 값이 instance member(instance variable, instance method)


 */