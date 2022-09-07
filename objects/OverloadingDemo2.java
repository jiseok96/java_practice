package objects;

/*

overloading : 같은 이름, 다른 메서드를 여러개 만듬
overriding : 같은 이름, 같은 메서드를 자식 클래스에서 정의




 */


public class OverloadingDemo2 extends OverloadingDemo{

    // overloading: 자식 클래스에서 새로 생성한 메서드. 동일한 이름이지만, 매개변수 갯수가 다름
    void A (String arg1, String mak){
        System.out.println("sub class: void");
    }



    // overriding: 부모 클래스와 동일한 이름의 메서드
    void A (){
        System.out.println("sub class: void A ()");
    }




    public static void main(String[] args){
        OverloadingDemo2 od2 = new OverloadingDemo2();
        od2.A();
        od2.A(1);
        od2.A("coding everybody");
        od2.A("coding everybody", "coding everyone");
    }
}
