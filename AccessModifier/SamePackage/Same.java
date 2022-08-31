package AccessModifier.SamePackage;

public class Same {
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
