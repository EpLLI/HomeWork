
public class Scet {

	public static void main(String[] args) {
		String str = "Эта строка состоит из множества слов которые я написал просто так";
		int length = str.length(); // определяем длину строки
		int del = (int) length / 2; // делим длину строки на 2
		System.out.println("Длина строки = " + length);

		System.out.println(del);
		String pervCast = str.substring(0, del); // запись первой части с 0 до
													// Del
		String vtorCast = str.substring(del); // запись второй части с Del до
												// конца
		System.out.println(pervCast);
		System.out.println(vtorCast);
	}

}
