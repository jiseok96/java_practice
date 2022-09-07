package JavaStudyFourth.constatntEnum;

/*

1. enum은 클래스이므로 생성자를 만들 수 있다

- 동일한 이름을 만듦으로 써 생성자 구현(메서드와 동일)
- 실행 시 "Call Constructor" 메세지를 3번 호출 : 각 enum 하나하나(APPLE, PEACH, BANANA) 가 인스턴스화 되면서 생성자도 3번 호출되는 것
- this는 각 enum 값들을 가리킴

2. enum은 클래스이므로 각각의 필드 값을 부여할 수 있음

예시
- enum에 필드 값 color 생성
- 생성자에서 color를 파라미터로 받아 필드 값으로 받아내도록 설정
- enum을 지정할 때, 생성자의 파라미터 값을 넣어줘야함

3. 당연히 method도 생성할 수 있겠지
- enum에 color 의 값을 설정해주는 getColor 메서드 추가


□ 열거형의 특성 정리

- 열거형은 연관된 상수들을 저장
- 그 값들이 변경되지 않도록 보장(final)
- 열거형 자체가 클래스이므로 단순히 상수가 아니라 더 많은 역할(내부에 생성자, 필드, 메서드를 가질 수 있음)을 할 수 있음
- values를 통해 저장된 값들을 하나하나 꺼내어 처리할 수 있음

 */

enum Fruit1{
    APPLE("red"), PEACH("pink"), BANANA("yellow");
    private String color;

    public String getColor(){   // 함수를 통해 값을 변경하도록, 필드 값인 color 는 private 으로 설정
        return this.color;
    }

    Fruit1(String color){
        System.out.println("Call Constructor" + this);
        this.color = color;
    }
}

enum Comapany1{
    GOOGLE, APPLE, ORACLE
}

public class ConstatntDemo5 {
    public static void main(String[] args) {
        Fruit1 type = Fruit1.APPLE;
        switch (type) {
            case APPLE:
                System.out.println(57 + "kcal, color" + Fruit1.APPLE.getColor());
                break;
            case PEACH:
                System.out.println(34 + "kcal, color" + Fruit1.PEACH.getColor());
                break;
            case BANANA:
                System.out.println(93 + "kcal, color" + Fruit1.BANANA.getColor());
                break;

        }

        // values: enum의 각 값에 하나씩 접근할 수 있음
        for(Fruit1 f : Fruit1.values()){
            System.out.println(f);
        }
    }

}
