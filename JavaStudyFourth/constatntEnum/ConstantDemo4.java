package JavaStudyFourth.constatntEnum;

/*

□ 열거형(Enum): 서로 연관된 상수들의 집합 ( * 배열: 서로 연관된 값들의 집합 )

- enum 은 클래스

Enum 의 장점
- 코드가 매우 단순해짐
- 인스턴스의 생성과 상속을 방지 : 제작자가 만든 의도대로만 사용할 수 있음
- 키워드 enum을 사용하기 때문에, 열거를 위한 코드라는 것을 분명히 확인할 수 있음


 */

// Demo 3의 클래스와 이름이 동일하므로 s를 붙임

enum Fruits {
    APPLE, PEACH, BANANA
}

enum Companies {
    GOOGLE, APPLE, ORACLE
}


public class ConstantDemo4 {
    public static void main(String[] args) {
        Fruits type = Fruits.APPLE;
        switch(type) {
            // switch문으로 전달한 type이 Fruits 임을 알기 때문에, 그냥 Frutis. 이런거 필요 없음
            case APPLE:
                System.out.println(57 + "kcal");
                break;
            case PEACH:
                System.out.println(34 + "kcal");
                break;
            case BANANA:
                System.out.println(93 + "kcal");
                break;
        }
    }
}
