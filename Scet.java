
public class Scet {

	public static void main(String[] args) {
		String str = "��� ������ ������� �� ��������� ���� ������� � ������� ������ ���";
		int length = str.length(); // ���������� ����� ������
		int del = (int) length / 2; // ����� ����� ������ �� 2
		System.out.println("����� ������ = " + length);

		System.out.println(del);
		String pervCast = str.substring(0, del); // ������ ������ ����� � 0 ��
													// Del
		String vtorCast = str.substring(del); // ������ ������ ����� � Del ��
												// �����
		System.out.println(pervCast);
		System.out.println(vtorCast);
	}

}
