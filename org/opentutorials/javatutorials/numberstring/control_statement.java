package org.opentutorials.javatutorials.numberstring;

/*

논리 연산자
and : &&
or  : ||
not : !


 */


public class control_statement {

    public static void main(String[]args) {

        // if 문
        if (false){
            System.out.println(1);
        } else if(true){
            System.out.println(2);
        } else {
            System.out.println(3);
        }

        String id = "jiseok";
        if(id.equals("jiseok")){
            System.out.println("right");
        } else {
            System.out.println("wrong");
        }

        // switch vs if
        switch(1){
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            default:
                System.out.println("default");
        }

        int val = 1;
        if(val == 1){
            System.out.println("one");
        } else if(val == 2){
            System.out.println("two");
        } else if(val == 3){
            System.out.println("three");
        }


        // while 문
        int i = 0;
        while(i < 10){
            System.out.println(i++);
        }

        // for 문
        //       초기화, 종료조건, 반복실행
        for (int j = 0; j < 10; j++){
            if (j == 5)                     // break 삽입
                break;
            System.out.println(j);
        }


    }



}
