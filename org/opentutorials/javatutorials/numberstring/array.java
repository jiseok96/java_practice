package org.opentutorials.javatutorials.numberstring;

public class array {

    public static void main(String[]args){

        String[] classGroup = {"ahn", "kim", "park", "jeong"};    // classGroup이라는 배열 [] 에는 문자열 String 들이 담긴다
        System.out.println(classGroup[0]);

        // 배열을 만드는 또다른 방법
        String[] class_group = new String[4];    // class_group 배열 만들기. 갯수를 지정해줘야함
        class_group[0] = "ahn";
        System.out.println(class_group.length);  // 몇 개가 들어있는지가 아니라, 몇 개를 넣을 수 있는지가 length로 출력됨
        class_group[1] = "kim";
        System.out.println(class_group.length);
        class_group[2] = "park";
        System.out.println(class_group.length);
        class_group[3] = "jeong";
        System.out.println(class_group);
        System.out.println(classGroup);


        // 배열과 반복문의 결합

        String[] members = {"최진혁", "최유빈", "한이람"};

        for (int i = 0; i < members.length; i++){
            String member = members[i];
            System.out.println(member + "이 상담을 받았습니다");
        }

        // for each 구문
        for (String e: members) {          // members에 있는 원소들을 하나씩 e로 받겠다는 뜻
            System.out.println(e);
        }

    }

}
