package scope;


class C{
    int v = 10;
    void m(){
        int v = 20;
        System.out.println(v);         // 지역변수인 v 를 호출
        System.out.println(this.v);    // 전역변수인 v 를 호출. this는 main 함수에서 생성된 c1을 가리킴
    }                                  // c1의 v 값을 출력하게끔 되는 것이지
}

public class ScopeDemo7 {

    public static void main(String[] args){
        C c1 = new C();
        c1.m();
    }


}
