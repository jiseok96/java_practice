package JavaStudyThird.interfaces.example2;

/*

interface가 정의된 파일

여러 개발자가 동시에 일을 할 떄 ex: 기능구현 따로, 사용 따로...
interface를 통해 틀을 잡아둘 수 있어

사용: CalculatorConsumer.java

 */


public interface Calculatable {
    public void setOprands(int first, int second, int third);
    public int sum();
    public int avg();
}
