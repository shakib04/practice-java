package practice;

public class ThreadSafetyEx {
    int count;

    private static ThreadSafetyEx instance = null;

    private ThreadSafetyEx() {

    }

    public void increment() {
        count++;
    }

    public static ThreadSafetyEx getInstance() {
        if (instance == null) {
            instance = new ThreadSafetyEx();
        }
        return instance;
    }


    public static void main(String[] args) throws Exception {
        ThreadSafetyEx threadSafetyEx = getInstance();
        //threadSafetyEx.increment();
//        for (int i = 0; i < 2000; i++) {
//            threadSafetyEx.increment();
//        }

        MultiThread multiThread1 = new MultiThread();
        multiThread1.setName("MultiThread-1");
        MultiThread multiThread2 = new MultiThread();
        multiThread2.setName("MultiThread-2");

        multiThread1.start();
        multiThread2.start();

        multiThread1.join();
        multiThread2.join();

//        Thread thread1 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                for (int i = 0; i < 1000; i++) {
//                    threadSafetyEx.increment();
//                }
//            }
//        });
//
//        Thread thread2 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                for (int i = 0; i < 1000; i++) {
//                    threadSafetyEx.increment();
//                }
//            }
//        });
//
//        thread1.start();
//        thread2.start();

//        thread1.join();
//        thread2.join();

        System.out.println(threadSafetyEx.count);
    }
}

class MultiThread extends Thread {

    ThreadSafetyEx threadSafetyEx;

    public MultiThread() {
        this.threadSafetyEx = ThreadSafetyEx.getInstance();
    }

    public MultiThread(ThreadSafetyEx threadSafetyEx) {
        this.threadSafetyEx = threadSafetyEx;
    }

    @Override
    public void run() {
        for (int i = 0; i < 700; i++) {
            threadSafetyEx.increment();
        }
    }
}
