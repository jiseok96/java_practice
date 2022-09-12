package JavaStudyFourth.collection;

/*

Collection 1: List (ArrayList)


ArrayList 는 길이를 지정 안해줘도 데이터를 담을 수 있음.
대신 Object type으로 지정되므로 형변환해서 가져와야함

 */

import java.util.ArrayList;

public class ArrayListDemo {

    public static void main(String[] args){
        String[] arrayObj = new String[2];
        arrayObj[0] = "one";
        arrayObj[1] = "two";
        arrayObj[2] = "three"; // error 발생
        for(int i = 0; i<arrayObj.length; i++){
            System.out.println(arrayObj[i]);
        }

        ArrayList a1 = new ArrayList();
        a1.add("one");
        a1.add("two");
        a1.add("three");
        for(int i=0; i<a1.size(); i++){
            // String value = a1.get(i);   ArrayList에 담기는 타입은 Object type. 따라서 String 에 담으려면 형변환을 해줘야함
            String value = (String) a1.get(i);
            System.out.println(value);

            // 근데 위의 방법은 옛날방식. 따라서 ArrayList<String> a1 = new ArrayList<String>() 이런 식으로 해서 사용하면 아래서 형변환해줄 필요 없음
        }
    }
}
