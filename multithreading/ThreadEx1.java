package multithreading;

class TestThread extends Thread{

    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("Hello" + i);
        }

    }


}

class ChildThread extends Thread{
    public ChildThread(ThreadGroup group){
        super(group, "dummy");
    }
}

class TestThread2 implements Runnable{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("Implement" + i);
        }
    }
}

class TestThread3 extends Thread{
    public void run(){
        System.out.println("HI");
    }
}

public class ThreadEx1 {
    public static void main(String[] args) {

        Thread thread = Thread.currentThread();
        System.out.println("main: "+ thread);

        TestThread t1 = new TestThread();
        TestThread2 t2 = new TestThread2();
        TestThread3 t3 = new TestThread3();

        Thread t = new Thread(t2);
        //new thread object
        t1.start();

        t.start();

        t3.start();
    }


}


