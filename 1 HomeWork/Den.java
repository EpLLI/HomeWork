import java.util.Scanner;// ������������� ����� ������

public class Den {
	public static void main(String[] args) {
		int a;
		Scanner in = new Scanner(System.in);
		a = in.nextInt();
		switch (a) { // ����� ��������� �����
		case 1: // ���������
			System.out.println("�����������");
			break;
		case 2:
			System.out.println("�������");
			break;
		case 3:
			System.out.println("�����");
			break;
		case 4:
			System.out.println("�������");
			break;
		case 5:
			System.out.println("�������");
			break;
		case 6:
			System.out.println("������");
			break;
		case 7:
			System.out.println("�����������");
			break;
		default: // ��� �� ������������
			System.out.println("��� � ����� ������� �� ����������");
		}

	}

}
