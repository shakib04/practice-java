package practice.generics;

import javax.xml.transform.TransformerException;

class Generic<T, X>{
    private T obj;

    public Generic(T obj, X obj2){
        this.obj = obj;
    }

    public T getObj(){
        return this.obj;
    }

    public void showType(){
        System.out.println("Type of T is: " + obj.getClass().getSimpleName());
    }
}

class Generic2<T>{
    private T obj;

    public Generic2(T obj){
        this.obj = obj;
    }
}

public class GenericsPractice {
    public static void main(String[] args) {
        Generic<Integer, String> integerGeneric = new Generic<>(88, "");
        integerGeneric.showType();

        Generic2<String> oo = new Generic2<>("22");

        Generic2<String> ss = oo;
    }
}
