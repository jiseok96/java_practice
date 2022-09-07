package JavaStudyFourth.objectclass;

class Student{
    String name;

    Student(String name){
        this.name=name;
    }

    // equals 메서드는 다음과 같은 형태를 가짐.
    // 이걸 재정의 하려면 overriding 하면 되는데, equals가 받아오는 파라미터는 Student 클래스.
    // 다형성에서 자식클래스의 객체는 부모 클래스로 받을 수 있다고 한 점을 사용하여, equals를 재정의합시다.
    public boolean equals(Object obj){
        Student s = (Student)obj;    // 부모를 자식으로 형변환하는 방법. (자식 > 부모는 자동으로 됨)
        return this.name == s.name;
    }

    public boolean equals(Student obj){
        if(obj.name == this.name){
            return true;
        } else {
            return false;
        }
    }
    // 이런 식으로 equals를 재정의해버렸다.


}


public class ObjectDemo {
    public static void main(String[] args){
        Student s1 = new Student("egoing");
        Student s2 = new Student("egoing");
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
    }
    /*

    □ equals

    == :
    equals :

    == 으로 비교를 하던, equals로 비교를 하던 두 값은 다르다(false)고 출력됨
    하지만, name이라는 변수의 값이 같다면 같은 것으로 간주하게끔 Overriding 할 수 있어. Object의 하위클래스인 Student에서 하면 됨
    분석을 해보면, s2라는 클래스가 equals라는 함수의 변수로 주어진다는 것이지.
    s2의 name 변수와 s1의 name 변수를 비교해서 출력하면 됨
     */

}
