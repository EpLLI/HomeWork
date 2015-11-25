package Zadanie13_1;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Ocered {

	public static void main(String[] args) {
		int c = 1;
		ExecutorService kas = Executors.newFixedThreadPool(3);
		for (int i = 0; i < 10; i++) {
			Runnable kli = new Kli(c++);
			kas.execute(kli);
		}
		kas.shutdown();
	}
}

class Kli implements Runnable {
	private int counter;
	String[] items = { "Chai", "Bulocka", "Sup" };

	public Kli(int counter) {
		this.counter = counter;
	}

	@Override
	public void run() {
		System.out.println("Kassa " + counter + " in");
		int k = 0;
		String name = Thread.currentThread().getName();
		for (int i = 0; i < items.length; i++) {
			System.out.println("Klient " + counter + " Kassa " + name.substring(name.length() - 1) + ": " + items[i]);
		}
		System.out.println("Klient " + counter + " out");
		System.out.println("Kassa svobodna");
	}
}