package JavaStudyFourth.collection;

/*

□ Collection 2: Set 과 Iterator


□ Set ( HashSet )
containsAll(): 부분집합 여부를 판단
addAll(): 합집합을 보여줌
retainAll(): 교집합
removeAll(): 차집합


□ Set 과 List 의 차이: 중복이 보장 되느냐, 순서가 보장 되느냐
Set: 중복 불가, 순서 없음
List : 중복 가능, 순서 있음

 */


import java.util.HashSet;
import java.util.Iterator;

public class SetDemo {

    public static void main(String[] args){
        HashSet<Integer> A = new HashSet<Integer>();   // set은 중복 불가.
        A.add(1);
        A.add(2);
        A.add(2);
        A.add(2);
        A.add(2);
        A.add(3);

        HashSet<Integer> B = new HashSet<Integer>();
        B.add(3);
        B.add(4);
        B.add(5);

        HashSet<Integer> C = new HashSet<Integer>();
        C.add(1);
        C.add(2);

        System.out.println(A.containsAll(B));  // containsAll() : A라는 HashSet 이 B HashSet 안에 있는 내용들을 모두 포함하고 있느냐
        System.out.println(A.containsAll(C));

        A.addAll(B);  // A 라는 집합에 B를 모두 더한다 : 합집합
        A.retainAll(B); //
//        A.removeAll(B);  // B 집합에 있는 애들을 A 집합에서 삭제


        /* Iterator : 모든 Collection interface 들이 갖고 있는 API(interface)

        iterator 메서드의 return 타입은 Iterator. Iterator 라는 인스턴스를 만드면 Set은 그대로 두고 가상의 어떤 집합이 생긴다고 생각하면 됨
        Iterator 인스턴스는 hasNext, next 두 메서드를 갖고있음

        - hasNext: hi 라는 인스턴스 안에 값들이 갖고 있는지 확인. 갖고 있으니 True가 되어 while문 실행됨
        - next: hi 인스턴스 안에 있는 값 중에 하나를 return 해주고, hi 안에서 해당 값을 삭제함 (오리지널 집합을 삭제하는 것이 아니야)

        >> 하다 보면 hi라는 값들이 더이상 없으면 hasNext 가 False 가 되겠지. 그러면 while 문 종료. 이것이 iterator



         */
        Iterator hi = (Iterator) A.iterator();
        while(hi.hasNext()){
            System.out.println(hi.next());
        }
    }


}

/*

Collection Interface

List 인터페이스에 존재하는 메서드
get(int index) : 해당 인덱스의 값을 가져옴   : set 은 순서가 없으니, get 을 못쓰겠지

 */
