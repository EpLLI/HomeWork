import java.util.Scanner; // инициализация ввода данных 

public class Castnoe {
	public static void main(String[] args) {
		int a, b, c;
		Scanner in = new Scanner(System.in); // ввод данных
		a = in.nextInt();
		b = in.nextInt();
		c = a / b; // расчёты
		System.out.println(c); // вывод

	}

}
