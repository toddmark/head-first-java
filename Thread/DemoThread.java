package Thread;

class SaleTickets implements Runnable  {
  public void run () {
    for (int i = 0; i < 60; i++) {
      System.out.println(Thread.currentThread().getName() + ", " + i);
    }
  }
}

public class DemoThread {
  public static void main(String[] args) {
    SaleTickets sale = new SaleTickets();
    Thread t1 = new Thread(sale);
    Thread t2 = new Thread(sale);
    t1.start();
    t2.start();
  }
}
