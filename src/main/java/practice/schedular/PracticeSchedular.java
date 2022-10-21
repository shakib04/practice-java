package practice.schedular;

import java.util.Timer;
import java.util.TimerTask;

class MyTask extends TimerTask{

    int i = 0;

    @Override
    public void run() {

        System.out.println("i = " + ++i );
    }
}

public class PracticeSchedular {
    public static void main(String[] args) {
        Timer timer = new Timer();
        TimerTask timerTask = new MyTask();
        timer.schedule(timerTask, 0, 1000);
    }
}
