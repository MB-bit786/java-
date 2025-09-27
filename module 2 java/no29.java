// 29. Two threads with sleep
class TwoThreads {
    public static void main(String[] args){
        Thread t1=new Thread(() -> {
            try{ Thread.sleep(2000); System.out.println("T1"); }catch(Exception e){}
        });
        Thread t2=new Thread(() -> {
            try{ Thread.sleep(2000); System.out.println("T2"); }catch(Exception e){}
        });
        t1.start(); t2.start();
    }
}