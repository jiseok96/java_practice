package scope;

public class ScopeDemo {

    static void a(){
        int i = 0;
    }

    public static void main(String[] args){
        for (int i=0; i < 5; i++){
            a();                        // i를 0으로 초기화시키는 함수이지만, i가 지역변수이기 때문에 a()라는 메소드 안에서만 i의 값이 0이됨
            System.out.println(i);      // 따라서 해당 함수의 i에는 영향을 끼치지 않음. 다른말로하면 a() 메소드에서 i의 유효범위는 a() 메소드에 해당하는 것임
        }
    }
}