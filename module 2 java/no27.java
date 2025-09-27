// 27. Thread by Runnable
class MyRunnable implements Runnable {
    public void run(){ System.out.println("Thread running"); }
    public static void main(String[] args){
        new Thread(new MyRunnable()).start();
    }
}
