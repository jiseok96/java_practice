package JavaStudyThird.interfaces.example1;

/*

interface : 메소드를 강제하는 역할. 구현하지 않는 경우 컴파일조차 되지 않음.

어떤 객체가 있고, 그 객체가 특정한 인터페이스를 사용한다면, 그 객체는 반드시 인터페이스의 메소드들을 구현해야 한다.

 */


interface I{             // I 는 클래스가 아니라 interface이다. 안에 있는 메서드는 본체가 존재하지 않음.
    public void z();     // abstract와 같이 사용하는 곳에서 메서드 z를 구현해줘야 함
}

class A implements I{    // implements : class A는 Interface I를 구현한다.
    public void z(){}
}

public class InterfacesPratice {
}
