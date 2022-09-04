package JavaStudyThird.polymorphism;

/*

메서드의 다형성

- Overloading 을 통한 메서드의 다형성.
- Parameter 값을 무엇을 주느냐에 따라 다른 메서드가 구현됨

 */


class O{
    public void a(int param){
        System.out.println("숫자 출력");
        System.out.println(param);
    }

    public void a(String param){
        System.out.println("문자 출력");
        System.out.println(param);
    }
}

public class PolymorphismOverloadingDemo {
    public static void main(String[] args){
        O o = new O();
        o.a(1);
        o.a("one");
    }
}
