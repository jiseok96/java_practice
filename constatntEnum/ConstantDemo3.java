package constatntEnum;



// 해결방법 2

// interface에서 필드를 작성한다는 것은 public static final이라는 것을 암시.

interface FRUIT {
    int APPLE = 1, PEACH = 2, BANANA = 3;
}

interface COMPANY{
    int GOOGLE = 1, APPLE = 2, ORACLE = 3;
}

// 해결 방법 3

// 자기 자신을 인스턴스한 값을 APPLE 에다가 넣음
class Fruit{
    public static final Fruit APPLE = new Fruit();
    public static final Fruit PEACH = new Fruit();
    public static final Fruit BANANA = new Fruit();
}

class Company{
    public static final Company GOOGLE = new Company();
    public static final Company APPLE = new Company();
    public static final Company ORACLE = new Company();
}



public class ConstantDemo3 {

    /*

    Demo 2와 달리 상황이 바뀌어 기업 이름이 필요하게 되었음

    APPLE에서 에러 발생. 변수 명이 겹치고, final이기 때문에 값을 바꿀 수 없는데 값을 바꾸려는 시도를 하므로 자바 컴파일러에서 에러 발생

    해결 방법 1: 변수 앞에 접두사를 붙여줌 > 이름이 충돌하는 문제 해결 가능  ex) FRUIT_APPLE, COMPANY_APPLE
    해결 방법 2: interface 사용 ex) FRUIT.APPLE, COMPANY.APPLE

    > error case 1: 근데 COMPANY의 APPLE과 FRUIT의 APPLE이 모두 숫자 1인 경우, 비교했을 때 같다고 발생할 수 있지. 이런 문제를 해결해야해.

    해결 방법 3: 클래스의 객체로 생성 ex) Company.APPLE, Fruit.APPLE

    > error case 2: 이제 switch문의 type을 Fruit로 바꿔보자. error 발생. 왜냐면 switch문에서 지원하는 데이터 타입이 제한적이거든
       - switch 문에서 사용할 수 있는 데이터타입: byte, short, char, int, enum, String, Character, Byte, Short, Integer
       - 따라서 생성한 클래스 데이터타입을 사용할 수 없음(if 문에서만 사용 가능. switch 문에서는 불가능)

     */

    // 해결방법 1
    private final static int FRUIT_APPLE = 1;
    private final static int FRUIT_PEACH = 2;
    private final static int FRUIT_BANANA = 3;

    private final static int COMPANY_GOOGLE = 1;
    private final static int COMPANY_APPLE = 2;
    private final static int COMPANY_ORACLE = 3;


    public static void main(String[] args){

        // error case 1
        if(FRUIT.APPLE == COMPANY.APPLE){
            System.out.println("과일 애플과 회사 애플이 같다.");
        }

        // 해결 방법 3: 클래스로 구현할 경우 자바 컴파일러에서 에러 발생시킴. 두 APPLE에 담긴 값이 객체 Fruit, 객체 Company 이므로 비교할 수 없음
//        if(Fruit.APPLE == Company.APPLE){
//            System.out.println("과일 애플과 회사 애플이 같다.");
//        }

        // error case 2
//        Fruit type = Fruit.APPLE;
//        switch(type){
//            case Fruit.APPLE:
//                System.out.println(57+"kcal");
//                break;
//            case Fruit.PEACH:
//                System.out.println(34+"kcal");
//                break;
//            case Fruit.BANANA:
//                System.out.println(93+"kcal");
//                break;
//        }
    }
}
