
/**The class for the selection results
 * that fit the requirements.
 * Requirements overlap area and the number of rooms.
 */
import java.util.Scanner;

public class Home {
	public static House[] houses;

	public static void main(String[] args) {
		House[] foundHome = null;
		House[] foundHome2 = null;
		houses = builHouse();
		int se = 90;
		int kolKom = 0;
		System.out.println("Type selection " );
		Scanner n = new Scanner(System.in);
		int c = n.nextInt();

		switch (c) {// Select the type of sample
		case 1:// area

			foundHome2 = findHomeBySe(se);
			break;

		case 2:// by room count

			foundHome = findHomeByKolKom(kolKom);
			break;
		}
		if (foundHome2 != null) {
			printFoundHomeS(foundHome2);// Conclusions The results of the first
										// sample
		}

		if (foundHome != null) {
			printFoundHome(foundHome);// the output of the second sample
		}

	}

	public static House[] builHouse() {// data initialization
		House[] houses = new House[4];
		House houses1 = new House(45, 63, 7, 2);
		houses[0] = houses1;
		House houses2 = new House(46, 95, 7, 3);
		houses[1] = houses2;
		House houses3 = new House(33, 45, 5, 1);
		houses[2] = houses3;
		House houses4 = new House(77, 45, 9, 1);
		houses[3] = houses4;
		return houses;
	}

	/*
	 * Method for selecting at room count.
	 * 
	 */
	public static House[] findHomeByKolKom(int kolKom) {
		House[] foundHome = new House[4];
		int i = 0;

		for (House house : houses) {
			int kom = 1;// number of rooms

			if (house.getKolKom() == kom) {
				foundHome[i] = house;
				i++;
			}
		}
		return foundHome;
	}

	// Method for outputting data
	public static void printFoundHome(House[] foundHome) {
		for (House s : foundHome) {

			System.out.println("Apartment number " + s.getNomKv());
		}
	}

	// Method for selecting at room count
	public static House[] findHomeBySe(int se) {
		House[] foundHome2 = new House[4];
		int i = 0;
		for (House house : houses) {
			int plo = 95;// Sets Square

			if (house.getSe() == plo) {
				foundHome2[i] = house;
				i++;
			}
		}
		return foundHome2;
	}

	// Method for outputting data
	public static void printFoundHomeS(House[] foundHome2) {
		for (House r : foundHome2) {
			if (foundHome2 != null) {
				System.out.println("Apartment number " + r.getNomKv());
			}
		}
	}
}
