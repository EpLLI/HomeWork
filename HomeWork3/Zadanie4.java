
public class Zadanie4 {

	public static void main(String[] args) {
		String text = "zdes text iz kotorogo nuzhno udalit vse slova kak vo etoo slovo ";
		System.out.println(text);// text Line

		String[] strArr = text.split(" ");// breaking array
		StringBuilder sb = new StringBuilder();// enter the string buffer
		for (int i = 0; i < strArr.length; i++) {// replacement cycle

			char first = strArr[i].charAt(0); // Choose the first letter of each
												// word

			if (!((strArr[i].length() % 20 == 4) && ((first == 'e') || (first == 'a') || (first == 'i') || // Conditions
																											// for
																											// Clearing
																											// the
																											// words
			(first == 'y') || (first == 'u') || (first == 'o')))) {

				sb.append(strArr[i]).append(" ");// add the string buffer
			}

		}
		String outText = sb.toString().trim();

		System.out.print(outText + " " + "\n\n");
	}
}
