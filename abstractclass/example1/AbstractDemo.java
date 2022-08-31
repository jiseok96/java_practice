package abstractclass.example1;


/*

□ 추상 클래스와 추상 메서드

abstract: 상속을 강제하기 위한 규제.


추상 클래스: 사용하기 위해서 반드시 이것을 상속받은 클래스를 만들어서 사용해야함
- 추상 클래스 내에는 추상 메서드가 아닌 메서드도 존재할 수 있음


추상 메서드: 자식클래스에서 메서드를 오버라이딩해야만 사용할 수 있음
- 추상 메서드는 본체가 존재하지 않음. 따라서 사용하는 쪽에서 정의해서 써야됨

*/

abstract class A{
    public abstract int b();    // b는 추상 메소드. 본체가 존재하지 않음. 따라서 메서드를 오버라이딩해서 b의 구체적인 로직을 사용하는 쪽에서 정의해서 사용해야함

    // 본체가 있는 메소드는 abstract 키워드를 가질 수 없다.
    //public abstract int c(){System.out.println("Hello")}

    // 추상 클래스 내에는 추상 메소드가 아닌 메소드가 존재할 수 있다.
    public void d(){
        System.out.println("world");
    }
}

class B extends A {
    public int b(){    // A를 상속한 클래스 B에서 b 메서드를 오버라이딩. 반드시 메서드 b의 본체를 생성해서 오버라이딩 해줘야함. b 가 부모클래스에서 추상메서드니까.
        return 1;      // 즉, 구체적인 사용은 메서드를 사용하는 쪽에 넘기는 것이야!
    }
}


public class AbstractDemo {

    public static void main(String[] args){
        // A obj = new A();      // 추상클래스인 A는 인스턴스화할 수 없음
        B obj = new B();
    }
}
