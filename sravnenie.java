import java.util.Scanner;// ������������� ����� ������

public class sravnenie {

	public static void main(String[] args) {
		int a, b;
		Scanner in = new Scanner(System.in);
		a = in.nextInt();
		b = in.nextInt();
		if (a < b) { // ���������
			System.out.println("������ ����� ������");
		} else if (a > b) {
			System.out.println("������ ����� ������");
		} else {
			System.out.println("��� �����");
		}

	}

}
