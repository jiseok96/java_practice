package AccessModifier.SamePackage;


/*

멤버들의 접근 제어자

public, private, protected, default를 구분

public : 모든 패키지에서 접근 가능
protected : 같은 패키지인 경우 접근 가능. 다른 패키지인 경우 상속관계면 접근 가능
default : 같은 패키지인 경우 접근 가능. 다른 패키지인 경우 접근 불가능
private : 같은 패키지, 같은 클래스인 경우 접근 가능

 */




import AccessModifier.OtherPackage.Other;

class SameClassChecker {

    /*

     1. 자기 자신을 호출하는 클래스.
        - 모든 메서드에 접근할 수 있다

     */


    public SameClassChecker(){               // 생성자. this를 통해서 자기 자신의 메서드를 호출하고있음.
        // 같은 클래스
        this._public();
        this._protected();
        this._default();
        this._private();
    }
    private void _private() {               // 접근 제어자가 private인 경우
        System.out.println("private");
    }
    void _default(){                        // 접근 제어자를 명시하지 않은 경우 : default 접근제어자
        System.out.println("default");
    }
    protected void _protected() {           // 접근제어자가 protected
        System.out.println("protected");
    }
    public void _public(){                  // 접근제어자가 public
        System.out.println("public");
    }

}

class SamePackageChecker extends Same {

    /*

     2. 같은 패키지에 있는 클래스에 접근하는 클래스
     - 인스턴스를 생성해서 접근할 때도 private 빼고 모두 가능하고,
     - 상속 관계를 이용해서 접근할 때도 private 빼고 모두 가능

     */


    public SamePackageChecker(){
        // 같은 패키지 : 같은 패키지의 Same 이라는 클래스의 인스턴스를 생성하여 메서드에 접근할 수 있는지 확인하기 위함
        Same same = new Same();
        same._public();
        same._protected();
        same._default();
        // same._private();

        // 같은 패키지 상속 관계 : 상속한 Same 이라는 클래스의 메서드에 어떻게 접근할 수 있는지 확인하기 위함
        this._public();
        this._protected();
        this._default();
        // this._private();
    }
}

class OtherPackageChecker extends Other {
    /*

     3. 다른 패키지에 있는 클래스에 접근하는 클래스 : protected 접근자가 좀 특별해. 상속받았을 경우 접근 가능하다.
     - 다른 패키지의 클래스를 인스턴스화해서 접근, 상속받아서 접근하면서 테스트
        public: import 접근 (O) , 상속 접근 (O)
        protected: import 접근 (x), 상속 접근 (O)
        default: 다른 패키지면 접근 불가능
        private: 다른 패키지면 접근 불가능

     */

    public OtherPackageChecker(){
        // 다른 패키지 : 같은 패키지의 Other 이라는 클래스의 인스턴스를 생성하여 메서드에 접근할 수 있는지 확인하기 위함
        Other other = new Other();
        other._public();                // 다른 패키지에 있는 public 에만 접근 가능
        // other._protected();
        // other._default();
        // same._private();

        // 다른 패키지, 서브 클래스 : 상속한 Other 이라는 클래스의 메서드에 어떻게 접근할 수 있는지 확인하기 위함
        this._public();
        this._protected();              // 상속받았을 경우 protected 에도 접근 가능
        // this._default();
        // this._private();
}




public class Checker {

}
}
