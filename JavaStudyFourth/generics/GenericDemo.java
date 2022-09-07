package JavaStudyFourth.generics;

/*

□ Generic을 사용하는 이유
    1. 코드의 중복을 제거
    2. 타입이 안전함

 */



class StudentInfo{
    public int grade;
    StudentInfo(int grade){this.grade=grade;}
}

class StudentPerson{
    public StudentInfo info;
    StudentPerson(StudentInfo info){this.info = info;}
}

class EmployeeInfo{
    public int rank;
    EmployeeInfo(int rank){this.rank = rank;}
}

class EmployeePerson{
    public EmployeeInfo info;
    EmployeePerson(EmployeeInfo info){this.info = info;}
}

// 코드의 중복을 피하기 위한 새로운 클래스의 생성.
class Person{
    public Object info;    // 모든 클래스의 조상인 Object를 사용함으로써 모든 종류의 클래스를 받을 수 있음
    Person(Object info){this.info = info;}
}

/*
 해당 코드는 클래스로 생성한 인스턴스 ( si, ei) 를 매개변수로 받는 클래스 StudentPerson, EmployeePerson을 인스턴스( sp, ep )로 만듦
 - 반복되기 때문에 수정해주면 좋음
 */

public class GenericDemo {
    public static void main(String[] args){
        // 수정 전
        StudentInfo si = new StudentInfo(2);
        StudentPerson sp = new StudentPerson(si);
        System.out.println(sp.info.grade);
        EmployeeInfo ei = new EmployeeInfo(1);
        EmployeePerson ep = new EmployeePerson(ei);
        System.out.println(ep.info.rank);

        // 수정 후
        Person p1 = new Person("부장");
        EmployeeInfo ei1 = (EmployeeInfo) p1.info;   // 타입을 EmployeeInfo로 특정화했으니, EmployeeInfo 라고 형변환을 해줌
        System.out.println(ei1.rank);

        // Object 를 다 받을 수 있게 해버리면서, 엉뚱한 "부장"이라는 데이터타입이 들어가게끔 만들어버림. 따라서 컴파일러에서 에러가 발생하지 않음.
        // 이런 것을 'Type이 안전하지 않다' 라고 이야기함. 이런 것을 방지하기 위해 generic을 사용
        // 즉, generic은 중복을 피하고, Type을 안전하게 만들어주는 역할을 함
    }
}
