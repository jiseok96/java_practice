package constatntEnum;

public class ConstantDemo2 {

    /*

    Demo 1과 달리 3개의 변수들을 선언(전역변수)
    final을 통해서 값이 절대 바뀌지 않는다는 것을 보증. 따라서 APPLE, PEACH, BANANA가 상수가 되는 것

    > 주석이 없어도 이름을 통해 무엇인지 알 수 있음

     */

    private final static int APPLE = 1;
    private final static int PEACH = 2;
    private final static int BANANA = 3;

    public static void main(String[] args){
        int type = APPLE;
        switch(type){
            case APPLE:
                System.out.println(57+"kcal");
                break;
            case PEACH:
                System.out.println(34+"kcal");
                break;
            case BANANA:
                System.out.println(93+"kcal");
                break;
        }
    }
}
