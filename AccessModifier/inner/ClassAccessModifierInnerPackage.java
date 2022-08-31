package AccessModifier.inner;

/*

클래스의 접근 제어자

- 클래스의 접근 제어자는 public과 default(아무것도 설정하지 않음) 2 가지
- 같은 패키지에 있는 클래스들의 경우 Public이든 default이든 모두 접근 가능


 */



public class ClassAccessModifierInnerPackage {
    PublicClass publicClass = new PublicClass();
    DefaultClass defaultClass = new DefaultClass();
}
