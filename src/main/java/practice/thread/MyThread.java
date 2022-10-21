package practice.thread;

import java.util.Arrays;
import java.util.Collections;

public class MyThread extends Thread {
    int[] values = {6, 5, 1, 7, 8};
    public void run(){
        for(int i = 0; i<5;i++)
            values[i]= values[i] * 2;
        System.out.println(Collections.singletonList(values));
    }

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
    }
}


class test{
    public static void main(String[] args) {
        for (int i = 0; i < 300; i++) {
            System.out.println(new Thread());
        }
    }
}







