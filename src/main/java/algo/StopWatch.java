package algo;

public class StopWatch {

    private long startTime = 0;
    private long stopTime = 0;
    private boolean running = false;

    public void start() {
        this.startTime = System.nanoTime();
        this.running = true;
    }

    public void stop() {
        this.stopTime = System.nanoTime();
        this.running = false;
    }

    //elaspsed time in nanoseconds
    public long getElapsedTimeInNanos() {
        long elapsed;
        if (running) {
            elapsed = (System.nanoTime() - startTime);
        } else {
            elapsed = (stopTime - startTime);
        }
        return elapsed;
    }


    //elaspsed time in nanoseconds
    public long getElapsedTimeInMicros() {
        long elapsed;
        if (running) {
            elapsed = (System.nanoTime() - startTime) / 1000;
        } else {
            elapsed = (stopTime - startTime) / 1000;
        }
        return elapsed;
    }


    //elaspsed time in seconds
    public long getElapsedTimeInMillis() {
        long elapsed;
        if (running) {
            elapsed = (System.nanoTime() - startTime) / (1000 * 1000);
        } else {
            elapsed = (stopTime - startTime) / (1000 * 1000);
        }
        return elapsed;
    }
}

class StopWatchTestRunner{
    public static void main(String[] args) throws Exception{
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        Thread.sleep(50);
        stopWatch.stop();
        System.out.println(stopWatch.getElapsedTimeInMillis());
    }
}