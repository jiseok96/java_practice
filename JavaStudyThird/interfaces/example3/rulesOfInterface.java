package JavaStudyThird.interfaces.example3;

/*
interface의 규칙
1. 하나의 클래스에 여러 개의 인터페이스를 구현할 수 있다
2. 인터페이스도 상속이 된다.
3. interface에 정의되는 메서드는 public 이어야만 한다. (당연한거지)


abstract vs interface

interface
- 클래스가 아닌 인터페이스라는 고유한 형태를 가지고있음.
- 구체적인 로직이나 상태를 가지고있을 수 없음

abstract
- 일반적인 클래스
- 구체적인 로직이나 상태를 가지고있을 수 있음

 */


// 1. 하나의 클래스에 여러 개의 인터페이스를 구현할 수 있다
//     - 반드시 구현을 해야한다. 메서드 x나 z중 하나라도 구현하지 않으면 오류가 발생한다.

interface I1{
    public void x();
}

interface I2{
    public void z();
}

class A implements I1, I2{
    public void x(){}
    public void z(){}
}

// 2. 인터페이스도 상속이 된다.

interface I3{
    public void x();
}

interface I4 extends I3{     // interface I3을 상속받는 I4
    public void z();
}

class B implements I4{       // I4를 상속받는 class B의 경우, 자식 interface에 정의된 메서드 z와 부모 메서드에 정의된 메서드 x를 모두 구현해야함
    public void z() {}
    public void x() {}
}

// 3. interface에 정의되는 메서드는 public 이어야만 한다. (당연한거지)

public class rulesOfInterface {
}
