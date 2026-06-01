package codingexercises;

public class PrintNumbersUsingThreads implements Runnable {

  public static void main(String[] args) {
    PrintNumbersUsingThreads task = new PrintNumbersUsingThreads();
    Thread thread = new Thread(task);
    thread.start(); // starts the new thread
  }

  @Override
  public void run() {
    for (int i = 0; i < 5; i++) {
      System.out.println(i);
    }
  }
}





