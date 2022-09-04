package JavaStudyThird.polymorphism;

/*

클래스와 다형성

- 클래스의 인스턴스를 생성할 떄, 부모클래스의 타입으로 지정해줄 수 있음.
- 부모클래스로 타입을 지정한 경우 자식 클래스에서 선언된 것들은 사용할 수 없음.
- 근데 자식클래스에서 메서드를 overriding을 했다면, 인스턴스화한 클래스(자식클래스)의 메서드를 호출해

 */


class A{
    public String x(){
        return "A.x";
    }
}
class B extends A{
    public String x(){
        return "B.x";
    }
    public String y(){
        return "y";
    }
}

class B2 extends A{
    public String x(){
        return "B2.x";
    }
}

/*
class B, B2로 객체를 만들었는데, 그걸 담는 변수의 타입이 A로 정의되어있네.
class B, B2가 A를 상속받고있음.
 */

public class PolymorphismDemo1 {
    public static void main(String[] args){
        A obj = new B();
        A obj2 = new B2();
        obj.x();
        // obj.y();                    // y는 구현 못해. 왜냐면 obj라는 변수의 데이터 타입이 A 잖아. 그래서 B를 못써.
        System.out.println(obj.x());   // x는 오버라이딩 되어있음. obj.x를 호출했을 경우 클래스 B(자식클래스)의 메서드를 호출해.
        System.out.println(obj2.x());  // 얘도 마찬가지겠지. 클래스 B2(자식클래스)의 메서드를 호출해
    }
}

/*

즉, 서로다른 두 개의 객체(obj, obj2)가 동일한 데이터 타입(A)으로 존재하면서 각각의 클래스(B, B2)에 정의되어있는 메서드(x)를 호출할 때는,
'각각의 클래스에 소속되어있는 메서드에 정의되어있는 방식대로 동작'한다.

 */
