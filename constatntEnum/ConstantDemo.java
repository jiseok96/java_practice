package constatntEnum;

public class ConstantDemo {
    public static void main(String[] args){
        /*
        1. 사과
        2. 복숭아
        3. 바나나

        해당 코드는 숫자별로(type) 과일을 정해놓은 상황.

        해당 코드의 문제
        1. 주석이 사라질 경우 어떤 내용인지 파악 어려움
        2. 주석과의 거리가 멀어질 경우 확인하기 어려움

        >> 숫자 대신에 우리가 쉽게 이해할 수 있는 이름을 사용하면 됨

        */
        int type = 1;
        switch(type){
            case 1:
                System.out.println(57);
                break;
            case 2:
                System.out.println(34);
                break;
            case 3:
                System.out.println(93);
                break;
        }
    }
}
