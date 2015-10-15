
public class Zadanie5 {

	public static void main(String[] args) {

		String str = "feersca";// text Line

		char[] ws = str.toCharArray();// translate string to an array
		for (int i = 0; i < ws.length; i++) {
			char n = ws[i];// choose letter
			int c = 0;// zero out counter
			System.out.print(n + " ");
			for (int k = 0; k < ws.length; k++) {
				if (n == ws[k]) {// We compare characters
					c = c + 1;// the coincidence of increasing counter

					if (c > 1) {// If the counter is greater than 1 deduce
						System.out.print("Ne odin  ");
					}

				}
			}

		}

	}
}
