package JavaStudyThird.finals;

/*

final

변수: 변수에 static이 지정되어있는 경우 그 값을 변경할 수 없음.
메소드: 메소드의 final이 지정되어있는 경우 오버라이딩 할 수 없음.
클래스: 클래스에 final이 지정되어있는 경우 상속할 수 없음.

결론 : final이 지정되면 절대로 그 값을 바꿀 수 없다.


 */


class A {
    final void b(){

    }
}

class B extends A{
    // void b(){}     // class A의 함수 b 를 오버라이딩하면 error 발생. final로 되면 오버라이딩 불가능!
}

final class C{
    final void b(){}
}

//class D extends C{}  // error 발생. final로 된 class는 상속할 수 없음