package practice;


class AnotherService{
    private String s;

    AbstractClassTest abstractClassTest;

    public void injectDependency(){
        abstractClassTest = new AbstractClassTest(s){};
    }
}

public abstract class AbstractClassTest {

    public AbstractClassTest(String a) {}

}

class Runner extends AbstractClassTest{


    public Runner(String a) {
        super(a);
    }

    public static void main(String[] args) {

    }
}
