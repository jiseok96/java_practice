package JavaStudyFourth.generics;

/*

 여러 가지의 타입을 다 받는 것을 방지하기 위해 extends를 사용함


 */

// 추상 메서드. 그 자식이 getLevel 이라는 메서드를 구현하도록 강제
abstract class Info{
    public abstract int getLevel();
}

// 자식 레벨에서 getLevel 구현
class EmployeeInfo4 extends Info{
    public int rank;
    EmployeeInfo4(int rank){this.rank = rank;}
    public int getLevel(){
        return this.rank;
    }
}

// generic 클래스는 지금, info의 데이터타입 T를 사용하고있음. 근데 T에 완전 쌩뚱맞은게 들어오면 안되잖아.
// 따라서 Info 클래스이거나, 그 자식들만 오도록 강제하고 싶은 것
class Person4<T extends Info>{
    public T info;
    Person4(T info){
        this.info = info;
    }
}

public class GenericDemo4 {
    public static void main(String[] args) {
        // 사용 가능
        Person4 p1 = new Person4<EmployeeInfo4>(new EmployeeInfo4(1));

        // 위에 Generic 클래스에 extends를 해놓았어. String이 Info의 자식이 아니므로 컴파일 에러 발생
//        Person4<String> p2 = new Person4<String>("부장");
    }
}
