package JavaStudyFourth.objectclass;

class Calculator{
    int left, right;

    public void setOprands(int left, int right){
        this.left = left;
        this.right = right;
    }
    public void sum(){
        System.out.println(this.left+this.right);
    }
    public void avg(){
        System.out.println((this.left+this.right)/2);
    }
    public String toString(){
        // 부모 클래스의 toString + 자식클래스에서 재정의한 toString 출력
        return super.toString()+ ", left:" + this.left+", right:" +this.right;
    }

}

public class CalculatorDemo {
    public static void main(String[] args){
        Calculator c1 = new Calculator();
        c1.setOprands(10, 20);
        System.out.println(c1);

        /*
        □ toString 메서드 : 객체를 문자로 출력
        JavaStudyFourth.objectClass.Calculator@73035e27
        - JavaStudyFourth.objectClass : 패키지
        - Calculator : 클래스
        - @ : 비교를 위한 것 (아무 의미 없음)
        - 73035e27 : 인스턴스의 주소

        toString을 굳이 사용하지 않아도 동일한 결과를 출력
        이것이 가능한 이유는 Calculator 클래스가 자동으로 Object 클래스를 상속하고 있기 때문. Object 클래스의 내부에 toString이 있어
        더 나은 출력물을 만들고 싶으면, toString 메서드를 오버라이딩해서 재정의하면됨

         □

         */
    }
}
