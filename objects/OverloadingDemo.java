package objects;

/*

메서드 overloading

- CalculatorDemo4에서 overloading 정의
- 이거는 따로 보기 쉽게 정의하고자 만들어놓은 클래스

 */


public class OverloadingDemo {

    /*

    매개변수의 수나 타입이 동일한데 return type이 달라. 그러면 해당 메서드를 호출할 때, 어떤 메서드를 사용할지 자바가 모르잖아.
    즉, return 값이 다르면 에러가 발생한다!

     */


    void A (){
        System.out.println("void A()");
    }

    void A (int arg1){
        System.out.println("void A (int arg1)");
    }

    void A (String arg1){
        System.out.println("void A (String arg1)");
    }

//    int A (){
//        System.out.println("int A()");
//        int b;
//        return b;
//    }

    public static void main(String[] args){
        OverloadingDemo od = new OverloadingDemo();
        od.A();
        od.A(1);
        od.A("coding every body");
    }
}
