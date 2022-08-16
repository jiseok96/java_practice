package org.opentutorials.javatutorials.numberstring;

/*

* 숫자 자료형 : 정수는 long 을, 실수는 double을 많이 사용함
    정수 : int, long
    실수 : float, double

* 문자 자료형
    문자 : char
    문자열 : String

* Primitive Type : Wrapper 클래스
    int : Integer
    long : Long
    double : Double
    float : Float
    boolean : Boolean
    char : Char

 */

public class data_type {

    public static void main(String[]args) {

        // 숫자 자료형
        int i = 0;
        System.out.println(i);
        System.out.println(i++);     // 값이 참조된 후에 증가
        System.out.println(++i);     // 값이 참조되기 전에 증가

        double j = 2.2;        // 실수인 경우 기본 자료형이 double. float로 지정한 경우 에러 발생.
        float k = 2.2F;        // float로 지정하고 싶으면 F를 붙여주면 됨
        long l = 214783648L;   // 위와 마찬가지로 정수의 기본 자료형은 int type임. 따라서 범위 밖의 int 자료형을 long 타입으로 지정해주려면 L 을 명시적으로 붙여줘야함

        // 문자 자료형
        char x = 'x';
        String y = "문자열";   // 방법 1 : 리터럴 표기(객체 생성 없이 고정된 값을 그대로 대입하는 방법. Primitive Type)
        String z = new String("문자열");    // 방법 2 : 새로운 String 객체 생성. 다만 위의 방식이 더 많이쓰임 (가독성) (Reference Type)
        System.out.println(y+z);

        // 문자열 함수

        String a = "hello";
        String b = new String("hello");

        // equals 함수
        System.out.println(a.equals(b));  // 값 비교 (True)
        System.out.println(a == b);       // 동일한 객체인지 비교 (False)

        // indexOf 함수 : 해당 문자 or 문자열의 index 출력
        String c = "This is a String";
        System.out.println(c.indexOf("String"));  // S의 index가 10이므로 10 출력

        // charAt 함수 : 해당 인덱스의 문자 출력
        System.out.println(c.charAt(10));

        // contains 함수 : 해당 문자 or 문자열의 포함 여부 출력
        System.out.println(c.contains("is"));

        // replaceAll 함수
        System.out.println(c.replaceAll("This", "It"));



        //
    }
}
