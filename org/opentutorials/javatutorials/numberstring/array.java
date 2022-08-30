package org.opentutorials.javatutorials.numberstring;

import java.util.ArrayList;
import java.util.List;

public class array {

    public static void main(String[]args){

//        String[] classGroup = {"ahn", "kim", "park", "jeong"};    // classGroup이라는 배열 [] 에는 문자열 String 들이 담긴다
//        System.out.println(classGroup[0]);
//
//        // 배열을 만드는 또다른 방법
//        String[] class_group = new String[4];    // class_group 배열 만들기. 갯수를 지정해줘야함
//        class_group[0] = "ahn";
//        System.out.println(class_group.length);  // 몇 개가 들어있는지가 아니라, 몇 개를 넣을 수 있는지가 length로 출력됨
//        class_group[1] = "kim";
//        System.out.println(class_group.length);
//        class_group[2] = "park";
//        System.out.println(class_group.length);
//        class_group[3] = "jeong";
//        System.out.println(class_group);
//        System.out.println(classGroup);

        outputNumber();

        // 배열과 반복문의 결합
//
//        String[] members = {"최진혁", "최유빈", "한이람"};
//
//        for (int i = 0; i < members.length; i++){
//            String member = members[i];
//            if (member.equals("최진혁")){
//                continue;
//            }
//            System.out.println(member + "이 상담을 받았습니다");
//        }

//        // for each 구문
//        for (String e: members) {          // members에 있는 원소들을 하나씩 e로 받겠다는 뜻
//            System.out.println(e);
//        }
//
//        String a = null;
//        String b = null;

//        boolean s = CompareString(a ,b, 2, 1);
//
//        List<Tree> trees = new ArrayList<>();
//        trees.add(new Tree());
//        trees.get(0);
//


    }

    public static boolean CompareString(String a, String b, int i, int j){

        if (a == b && i > j || (a == "" && b =="")) {
            System.out.println("true");
            return true;
        } else {
            System.out.println("false");
            return false;
        }

    }


    public static class Tree {
        String leap;
    }

    public static void outputNumber(){                              // 위와 아래 동일한 이름의 outputNumber 메서드이지만,
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};            // 입력 값의 유무에 따라 다른 함수가 호출됨.

        for (int i = 0; i < numbers.length; i++ ){
            if (numbers[i] / 2 == 0){
                System.out.println("짝수");
                System.out.println(numbers[i]);
            } else if (numbers[i]/2 == 1) {
                System.out.println("홀수");
                System.out.println(numbers[i]);

            } else {

                System.out.println("기타" + numbers[i]);
            }
        }
    }

    public static void outputNumber(int j) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] / 2 == 0) {
                System.out.println("짝수");
                System.out.println(numbers[i]);
            } else if (numbers[i] / 2 == 1) {
                System.out.println("홀수");
                System.out.println(numbers[i]);

            } else {

                System.out.println("기타" + numbers[i]);
            }
        }
    }
}

