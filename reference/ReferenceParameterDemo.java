package reference;

public class ReferenceParameterDemo {

    static void _value(int b){
        b = 2;
    }

    static void runValue(){
        int a = 1;
        _value(a);
        System.out.println("runValue, "+a);
    }

    // runValue에서 _value 메서드를 통해 받아온 매개변수 b(int a = b)를 바꿔도 a의 값은 변하지 않음. 기본 자료형이니까.

    static void _reference1(A b){
        b = new A(2);
    }

    static void runReference1(){
        A a = new A(1);
        _reference1(a);
        System.out.println("runReference1, "+a.id);
    }

    // b의 값이 바뀌어도 a의 값은 변하지 않겠지. 왜냐면, b에서 새로 인스턴스를 생성하니까. b만 바뀜

    static void _reference2(A b){
        b.id = 2;
    }

    static void runReference2(){
        A a = new A(1);
        _reference2(a);
        System.out.println("runReference2, "+a.id);
    }

    // 이건 바뀌겠지. 가져온 객체의 id를 바꾸는거니까.

    public static void main(String[] args){
        runValue();
        runReference1();
        runReference2();
    }
}
