package JavaStudyFourth.generics;

/*
  Generic의 사용
    - Generic의 특성 3 : 레퍼런스 타입만 사용할 수 있음(래퍼클래스)

 */

class EmployeeInfo2{
    public int rank;
    EmployeeInfo2(int rank){this.rank = rank;}
}
class Person2<T, S>{
    public T info;
    public S id;
    Person2(T info, S id){
        this.info = info;
        this.id = id;
    }
}

public class GenericDemo2 {
    public static void main(String[] args) {
        Integer id = 1;
        Person2<EmployeeInfo2, Integer> p1 = new Person2<EmployeeInfo2, Integer>(new EmployeeInfo2(1), id);
        System.out.println(p1.id.intValue());   // intValue : Integer가 갖고있는 메서드. 해당 래퍼클래스가 갖고있는 데이터를 원시타입으로 가져올 수 있음
    }
}
