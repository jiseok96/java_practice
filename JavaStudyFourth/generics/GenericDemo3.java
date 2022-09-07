package JavaStudyFourth.generics;

/*

- Generic의 생략
- 메서드에서의 Generic

 */

class EmployeeInfo3{
    public int rank;
    EmployeeInfo3(int rank){this.rank = rank;}
}
class Person3<T, S>{
    public T info;
    public S id;
    Person3(T info, S id){
        this.info = info;
        this.id = id;
    }

    // 메서드에서 Generic의 사용. 메서드의 데이터타입을 아직 정해주고 싶지 않을 때 다음과 같이 사용할 수 있음
    public <U> void printInfo(U info){
        System.out.println(info);
    }
}

public class GenericDemo3 {
    public static void main(String[] args) {
        EmployeeInfo3 e = new EmployeeInfo3(1);
        Integer i = 1;

        // JAVA는 생성자의 매개변수를 통해서 e, i의 데이터타입을 알 수 있음.
        // 위에서 e, i의 데이터타입을 알려줬기 때문에 JAVA는 데이터타입을 알고 있고, 따라서 generic을 생략할 수 있음.
        // Person3<EmployeeInfo3, Integer> p1 = new Person3<EmployeeInfo3, Integer>(e, i);
        Person3 p1 = new Person3(e, i);

        // Generic 메서드의 사용
        p1.<EmployeeInfo3>printInfo(e);
    }
}
