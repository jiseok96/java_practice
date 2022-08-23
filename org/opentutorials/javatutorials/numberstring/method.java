package org.opentutorials.javatutorials.numberstring;

public class method {

    // 메소드의 형식
    public static String numbering(int init, int limit) {
        int i = init;
        String output = "";
        while (i <limit) {
//            System.out.println(i);
            output += i;
            i++;
        }
        return output;
    }

    public static void main(String[] args){
        String result = numbering(5, 10 );
        System.out.println(result);
    }

}
