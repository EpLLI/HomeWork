package HomeWork3;


public class Zadanie6 {

	public static void main(String[] args) {
		String text = "οτοτ";// text Line
		System.out.println(text);// text Line
		String text2 = "τοτο";// text Line
		System.out.println(text2);
		char[] str = text2.toCharArray();// translate 2 string to an array
		;
		char[] str1 = new char[str.length];//create an empty array of length equal to the first
		int k = str.length - 1;
		for (int i = 0; i < str.length; i++) {
			str1[i] = str[k];//assigned to the first last
			k = k - 1;
		}
		String s3 = new String(str1);//create a string from an array
		if (text.equals(s3)) {//compare the text in a new line
			System.out.println("Rearrange");
		} else {
			System.out.println("not Rearrange");
		}
		}

}
