package JavaStudyThird.exception;

/*

finally: 예외 여부와 관계 없이 실행되는 로직

finally 가 필요한 경우: DB와 연결했을 때, 에러가 발생하든 말든 접속은 끊어줘야하잖아.

 */

class A{
    private final int[] arr = new int[3];
    A(){
        arr[0]=0;
        arr[1]=10;
        arr[2]=20;
    }

    public void z(int first, int second){
        try{
            System.out.println(arr[first]/ arr[second]);
        } catch(ArithmeticException e){
            System.out.println("ArithmeticException e");
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException e");
        } catch(Exception e){
            System.out.println("위의 에러들이 아니라면 이걸 실행 ");
        } finally {
            System.out.println("예외 여부와 관계 없이 실행되는 로직");
        }
    }
}


public class ExceptionDemo1 {
    public static void main(String[] args){
        A a = new A();
        a.z(10, 1);                // Error 1 : ArrayIndexOutOfRange , 존재하지 않는 인덱스 (10)번을 호출
        a.z(1, 0);                 // Error 2 : ArithmeticException, 0으로 나누지 못함
    }
}
