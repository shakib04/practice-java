package practice.generics;

  class Generic02<T>{
    private T obj;

    public Generic02(T obj){
        this.obj = obj;
    }

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }

    public void showType(){
        System.out.println("Type of t is " + obj.getClass().getName());
    }

    public static void main(String[] args) {

    }
}

public class GenericsPractice02 {

    public static void main(String[] args) {
        GenericsPractice02 genericsPractice02 = new GenericsPractice02();

//        GenericsPractice02.Generic<Integer> dd = genericsPractice02.new Generic<>(22);
//        dd.showType();
        //genericsPractice02.Generic<Integer> ss = new Generic<>();

    }
}
