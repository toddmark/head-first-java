package Thread;

class SaleTickets implements Runnable {
  private int tickets = 100;

  public void run() {
    synchronized (this) {
      while (tickets > 0) {
        try {
          Thread.sleep(20);
        } catch (InterruptedException e) {
          // TODO Auto-generated catch block
          e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + ", " + tickets--);
      }
    }
  }
}

public class DemoThread {
  public static void main(String[] args) {
    SaleTickets sale = new SaleTickets();
    Thread t1 = new Thread(sale);
    Thread t2 = new Thread(sale);
    Thread t3 = new Thread(sale);
    Thread t4 = new Thread(sale);
    t1.start();
    t2.start();
    t3.start();
    t4.start();
  }
}
