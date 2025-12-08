public class Practice1_SimpleRunnable {
    public static void main(String[] args) {
        Runnable r = () -> System.out.println("Hello World");
        Thread thread = new Thread(r);
        thread.start();
    }
}
