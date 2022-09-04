package JavaStudyThird.polymorphism;

/*

□ Interface와 다형성

  - 어떤 클래스가 어떤 Interface를 구현하고 있다면, 그 클래스의 인스턴스는 그 인터페이스일 수 있다.

 */


interface I{}
class C implements I{}

public class PolymorphismDemo2 {
    public static void main(String[] args){
        I obj = new C();
    }
}
