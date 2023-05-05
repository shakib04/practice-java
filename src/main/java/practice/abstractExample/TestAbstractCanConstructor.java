package practice.abstractExample;


import java.util.ArrayList;
import java.util.List;

/**
 * An abstract class cannot be instantiated, which means you are not allowed to create an object of it.
 * A class derived from the abstract class must implement all those methods that are declared as abstract in the parent class
 *
 */

abstract class AbstractClassExample{

    int a;
    String b;

    public AbstractClassExample(int a, String b) {
        this.a = a;
        this.b = b;
    }

    protected void print(){
        System.out.println(this.a);
        System.out.println(this.b);
    }

    protected abstract void test();
}

class ImplementAbstractClassWhoHasCons extends AbstractClassExample{

    public ImplementAbstractClassWhoHasCons() {
        super(0, null);
        //super(a, b);
    }


    @Override
    protected void test() {
        System.out.println("calling test...");
    }
}



public class TestAbstractCanConstructor {

    public static void main(String[] args) {
        new ImplementAbstractClassWhoHasCons().print();

        SubClassButAbstract ss = new SubClassButAbstract(){
            @Override
            protected void sss() {
                System.out.println("hello from sss");
            }

            @Override
            public void test() {
                //super.test();
                System.out.println("test from main");
            }
        };
        ss.test();
        ss.sss();
    }
}


/**
 * A subclass of non-abstract superclass cannot be abstract
 */
//example of non-abstract class
class NonAbstractClass{

}

abstract class SubClassButAbstract extends NonAbstractClass{

    abstract protected void sss();

    public void test(){
        List<SubClassButAbstract> gg = new ArrayList<>();
        gg.add(new SubClassButAbstract() {
            @Override
            protected void sss() {

            }

            @Override
            public void test() {
                super.test();
            }
        });

        gg.add(new SubClassButAbstract() {
            @Override
            protected void sss() {

            }
        });
        System.out.println("hello from test");
    }

}
