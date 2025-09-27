// 32. Daemon thread
class TestDaemonThread2 extends Thread {
    public void run(){ System.out.println("daemon: "+isDaemon()); }
    public static void main(String[] args){
        TestDaemonThread2 t1=new TestDaemonThread2();
        TestDaemonThread2 t2=new TestDaemonThread2();
        t1.setDaemon(true);
        t1.start(); t2.start();
    }
}
