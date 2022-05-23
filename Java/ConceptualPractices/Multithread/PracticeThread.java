package Multithread;

public class PracticeThread extends Thread{
   
        synchronized public void run() {
           if(Thread.currentThread().getName() == "Thread-3"){
               Thread.interrupted();
           }
            for (int i = 0; i < 6; i++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(i + " from " + Thread.currentThread().getName());
            }
        }
        public static void main(String[] args) throws InterruptedException {
            PracticeThread test = new PracticeThread();
            for (int i = 0; i < 5; i++) {
                Thread thread = new Thread(test);
                thread.start();
                thread.join();
            }
           System.out.println("Thread ended");
           for (int i = 0; i < 5; i++) {
               System.out.println("Main Element : " + i);
           }
            System.out.println("Main thread name : " + Thread.currentThread().getPriority());
    
        }
    }

