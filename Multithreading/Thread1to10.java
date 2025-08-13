public class Thread1to10 {
   class PrintNumbers extends Thread {
    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                System.out.println(i);
                if (i == 5) {
                    Thread.sleep(5000); // 5000 milliseconds delay
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        PrintNumbers t1 = new PrintNumbers();
        t1.start();
    }
}