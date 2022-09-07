package JavaStudyFourth.reference;

/*

□ 기본 자료형(primitive Type): 복제

    b를 2로 바꾸어도 a는 1이야.
    a 라는 변수에 1을 넣어.
    b 라는 변수에는 a가 가진 값 1을 복제해서 넣어
    b 를 2로 바꾸면 b=2, a=1

□ 참조 자료형(JavaStudyFourth.reference Type): 참조

    new A를 하면 인스턴스 A가 컴퓨터 어딘가에 만들어져
    a 라는 변수는 인스턴스 A의 위치에 대한 정보를 가져
    b = a 하면 변수 b에는 변수 a가 갖고 있는 위치에 대한 정보를 가져
    b.id = 2 하면 인스턴스 A가 갖고 있는 id를 2로 변경하게 되는 것

    따라서 a.id를 출력하면 변경된 인스턴스 A의 id 값인 2가 출력
    주소값만을 갖고 있게 되는거야


 */

class A{
    public int id;
    A(int id){
        this.id = id;
    }
}



public class ReferenceDemo {
    public static void runValue(){
        int a = 1;
        int b = a;
        b = 2;
        System.out.println("runValue, " +a);
    }

    public static void runReference(){
        A a = new A(1);
        A b = a;
        b.id = 2;
        b = new A(2);  // b 에 새로운 값이 들어가는 것. 따라서 a와 b는 연관이 없어지는거지.
        System.out.println("runReference, "+a.id);
    }


    public static void main(String[] args){
        runValue();

    }
}
