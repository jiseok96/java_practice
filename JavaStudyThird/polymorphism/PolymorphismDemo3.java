package JavaStudyThird.polymorphism;


/*

인터페이스와 다형성
 - 객체 생성 시, 그 객체에서 구현한 인터페이스가 존재하는 경우(implements), interface에 정의된 속성만을 가진 클래스처럼 사용할 수 있다.
 - 맨 아래 정리 참조

 */

interface I2{
    public String A();
}

interface I3{
    public String B();
}

class D implements I2, I3{
    public String A(){
        return "A";
    }
    public String B(){
        return "B";
    }
}

public class PolymorphismDemo3 {

    /*
    3개의 인스턴스
    1번: 클래스의 타입을 그대로 선언
    2번: 그 클래스가 가지고 있는 인터페이스중의 하나를 구현중. 메서드 A의 생성을 강제함
    3번: 그 클래스가 가지고 있는 인터페이스중의 하나를 구현중. 메서드 B의 생성을 강제함
     */

    public static void main(String[] args){
        D obj = new D();
        I2 objI2 = new D();
        I3 objI3 = new D();

        obj.A();
        obj.B();

        objI2.A();          // 클래스(D)가 인터페이스에서 정의된 멤버(메서드 A)만을 가지고 있는 클래스처럼 사용할 수 있음.
        // objI2.B();       // 에러 발생.

        // objI3.A();       // 에러 발생
        objI3.B();          // 클래스(D)가 인터페이스에서 정의된 멤버(메서드 B)만을 가지고 있는 클래스처럼 사용할 수 있음.
    }
}

/*

정리:

- 해당 클래스 전체를 사용하고 싶으면 그 클래스 타입으로 인스턴스 타입을 지정해주면됨
- 해당 클래스의 부분만을 사용하고 싶으면, 해당 인터페이스로 인스턴스의 타입을 지정해주면 됨
ex) I2로 지정하면 I2에 지정된 A 메서드만을 갖고있는 객체 D처럼 사용 가능 , I3로 지정하면 I3에 지정된 B 메서드만을 갖고 있는 객체 D처럼 사용 가능

 */