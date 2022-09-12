package JavaStudyFourth.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*

□ Collections 3 : Map

Map: Key 와 value 의 쌍으로 이루어짐
- Key 는 중복될 수 없음


 */


public class MapDemo {

    public static void main(String[] args){
        HashMap<String, Integer> a = new HashMap<String, Integer>();
        a.put("one", 1);
        a.put("two", 2);
        a.put("three", 3);
        a.put("four", 4);
        System.out.println(a.get("one"));
        System.out.println(a.get("two"));
        System.out.println(a.get("three"));

        iteratorUsingForEach(a);
        iteratorUsingIterator(a);
    }


    static void iteratorUsingForEach(HashMap map){

        /*

        map 인터페이스가 가진 entrySet 메서드를 통해 Set 데이터타입의 컨테이너가 만들어지는데, 그 인스턴스가 entries 라는 인스턴스에 담기는거지

        그 각각의 값들은 Map이 갖고있는 Entry 타입.
        Map.Entry 가 갖고 있는 두 가지의 주요 메서드: getKey(), getValue()


         */

        Set<Map.Entry<String, Integer>> entries = map.entrySet();     // entrySet 메서드: Set 데이터 타입의 컨테이너가 만들어짐.
        for (Map.Entry<String, Integer> entry: entries){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

    static void iteratorUsingIterator(HashMap map){
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        Iterator<Map.Entry<String, Integer>> i = entries.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
    }
}
