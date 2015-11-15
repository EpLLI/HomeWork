package Potoki;
import java.util.Scanner;

public class Potoki {
	public static void main(String[] args) throws InterruptedException {
		Scanner n1 = new Scanner(System.in);
		String p = n1.nextLine();
		String z = "start";
		if (p.equals(z)) {
			NewTh nr = new NewTh();
			Thread t1 = new Thread(nr);
			Thread t2 = new Thread(nr);
			t1.setName("Thread1:");
			t1.start();

			t2.setName("Thread2:");
			t2.start();

		}
	}

	public static synchronized void print10() {

		int k = 1;
		for (int i = 1; i <= 10; i++) {
			System.out.print(Thread.currentThread().getName());
			for (int j = 1; j <= 10; j++) {
				System.out.print(" " + (k++) + " ");
			}
			System.out.println();
		}
	}
}

class NewTh extends Thread {
	public void run() {
		Potoki o = new Potoki();
		o.print10();
	}
}
