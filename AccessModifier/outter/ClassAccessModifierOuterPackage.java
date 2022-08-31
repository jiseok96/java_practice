package AccessModifier.outter;

import AccessModifier.inner.PublicClass;


/*

default로 설정되어있는 클래스를 다른 패키지에서 사용하려고 하면 사용할 수 없음.

 */

public class ClassAccessModifierOuterPackage {
    PublicClass publicClass = new PublicClass();
    // DefaultClass defaultClass = new DefaultClass();
}



/*

클래스 접근제어자 결론:

public 클래스: 다른 패키지의 클래스에서도 사용할 수 있음
default 클래스: 같은 패키지에서만 사용할 수 있음


public 클래스의 경우 소스코드의 이름과 일치해야함. 즉, 하나의 소스코드에는 하나의 public 클래스만 존재할 수 있음

 */