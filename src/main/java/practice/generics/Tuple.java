package practice.generics;

public class Tuple <X, Y>{

    private X x;
    private Y y;

    public Tuple(X x, Y y){
        this.x = x;
        this.y = y;
    }

    public X getX() {
        return x;
    }

    public Y getY() {
        return y;
    }

    public void showType(){
        System.out.println("Type of X is: " + x.getClass().getSimpleName());
        System.out.println("Type of Y is: " + y.getClass().getSimpleName());
    }
}

class Test{
    public static void main(String[] args) {
        Tuple<String, Tuple<String, Integer>> tuple = new Tuple<>("Hello", new Tuple<>("World", 22));
        tuple.showType();

        //Tuple<Object, Tuple<Object, Object>> ss = tuple;
    }
}
