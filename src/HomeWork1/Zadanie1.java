package HomeWork1;


public class Zadanie1 {

	public static void main(String[] args) {
		String str = "Eta stroka napisana prosto tak dla primera";
		int length = str.length(); // determine the length of the string
		int del = (int) length / 2; // divide by 2
		System.out.println("The length of the line=" + length);

		System.out.println(del);
		String pervCast = str.substring(0, del); // Record the first part
													// Del
		String vtorCast = str.substring(del); // recording the second part
												// конца
		System.out.println(pervCast);
		System.out.println(vtorCast);
	}

}
