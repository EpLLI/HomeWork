import java.util.Scanner;// ������������� ����� ������

public class Rubl {
	public static void main(String[] args) {
		int a;
		Scanner in = new Scanner(System.in);
		a = in.nextInt();
		if (a % 100 > 10 && a % 100 < 15) { // ������� ����������
			System.out.println(a + " ������");
		} else if (a % 10 == 1) { // ������� 1 ������ ����
			System.out.println(a + " �����");
		} else if (a % 10 == 2) // ������� 2 ������ ����
		{
			System.out.println(a + " �����");
		} else if (a % 10 == 3) // ������� 2 ������ ����
		{
			System.out.println(a + " �����");
		} else if (a % 10 == 4) // ������� 2 ������ ����
		{
			System.out.println(a + " �����");
		} else {
			System.out.println(a + " ������");
		}
	}
}