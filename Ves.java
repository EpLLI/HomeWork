import java.util.Scanner;// ������������� ����� ������

public class Ves {

	public static void main(String[] args) {
		int vesR, rost, vesRec;
		Scanner in = new Scanner(System.in);
		vesR = in.nextInt();
		rost = in.nextInt();
		vesRec = (rost - 100); // ���������� ���� �����������
		if (vesR > vesRec) { // ��������� � ���������
			System.out.println("�������");
		} else {
			System.out.println("������ �����");
		}

	}

}
