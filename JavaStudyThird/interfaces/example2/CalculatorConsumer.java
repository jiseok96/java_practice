package JavaStudyThird.interfaces.example2;

/*

Calculatable에 정의되어있는 메서드에 따라 기능 구현, 사용자 구현이 동일하게 이루어질 수 있음.
미리 약속이 정의되어있게 되니, 사용을 구현하는 측에서는 이런 식으로 미리 Dummy라는 가짜 클래스를 만들어서 사용하게끔 해놓을 수 있지
(나중에 클래스 이름만 바꿔서 개발 완료된 기능으로 바꾸면 되니까)

: 따라서 interface를 사용하면 약속을 통해 서로 안심하고 개발할 수 있게됨. interface는 명세서같은 느낌인거지

 */



class CalculatorDummy implements Calculatable{
    public void setOprands(int first, int second, int third){}
    public int sum(){
        return 60;
    }

    public int avg(){
        return 20;
    }
}



public class CalculatorConsumer {

    public static void main(String[] args){
        CalculatorDummy c = new CalculatorDummy();
        c.setOprands(10, 20, 30);
        System.out.println(c.sum()+c.avg());
    }

}
