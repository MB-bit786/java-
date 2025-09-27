// 30. Start thread twice
class TestThreadTwice1 extends Thread {
    public void run(){ System.out.println("running"); }
    public static void main(String[] args){
        TestThreadTwice1 t=new TestThreadTwice1();
        t.start(); t.start();
    }
}