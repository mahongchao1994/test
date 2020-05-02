package guanglianda;

public class test {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("1....");
        Thread.sleep(30000);
        byte[] array = new byte[1024 * 1024 * 10];//10M
        System.out.println("2....");
        Thread.sleep(30000);
        array = null;//array没有引用，可以被回收了
        System.gc();
        System.out.println("3...");
        Thread.sleep(1000000L);
    }
}
