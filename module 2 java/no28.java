// 28. Thread by extending Thread
class MyThread extends Thread {
    public void run(){ System.out.println("Thread running"); }
    public static void main(String[] args){
        new MyThread().start();
    }
}