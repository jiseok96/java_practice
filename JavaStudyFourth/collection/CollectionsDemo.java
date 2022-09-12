package JavaStudyFourth.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

class Computer implements Comparable{
    int serial;
    String owner;
    Computer (int serial, String owner){
        this.serial = serial;
        this.owner = owner;
    }

    public int compareTo(Object o){
        return this.serial - ((Computer)o).serial;
    }

    public String toString(){
        return serial+" "+owner;
    }
}

public class CollectionsDemo {

    public static void main(String[] args){
        List<Computer> computers = new ArrayList<Computer>();
        computers.add(new Computer(500, "egoing"));
        computers.add(new Computer(200, "leezche"));
        computers.add(new Computer(32233, "graphittie"));
        Iterator i = computers.iterator();
        System.out.println("before");
        while (i.hasNext()){
            System.out.println(i.next());
        }

        /*

        Collections: 정렬 등 데이터 처리를 위한 클래스. 안의 메서드는 모두 static 이므로 인스턴스화할 필요 없음
        Collections 의 sort 메서드: list 를 받고, 그 안의 객체는 Comparable 인터페이스를 구현해야함. (따라서 위에서 Comparable 구현)

         */

        Collections.sort(computers);
        System.out.println("\nafter");
        i = computers.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
    }

}
