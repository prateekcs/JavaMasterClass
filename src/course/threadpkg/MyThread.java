package course.threadpkg;

public class MyThread /*extends Thread */ implements Runnable{

    @Override
    public void run() {
        //super.run();    // replace it with what we want to do with thread
        ///3synchronized (this){

            try {
                System.out.println("Thread going to sleep " +Thread.currentThread().getName());
                Thread.sleep(10000);
                synchronized (this){
                    this.notifyAll();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            //3}

        /*for (int i = 0;i<3;i++){
            //System.out.println("i value is " +i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread is " +Thread.currentThread().getName()+ " i value is "+i);*/
        }
    }
    public void letsWait(){
        System.out.println(Thread.currentThread().getName()+ " Entered");
        synchronized (this){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
       System.out.println(Thread.currentThread().getName()+ " Thread wakeup");
    }

    public static void main(String[] args) {
        //2System.out.println("Thread ::" + Thread.currentThread().getName());
        //MyThread t = new MyThread();
        MyThread obj = new MyThread();
        Thread t1 = new Thread(obj);
        t1.setName("A");
        /*Thread t2 = new Thread(obj);
        t2.setName("B");
        Thread t3 = new Thread(obj);
        t3.setName("C");   */
        t1.start();//or run method
        obj.letsWait();
        Thread.yield();
        /*t2.start();
        t3.start();*/
    }
}
