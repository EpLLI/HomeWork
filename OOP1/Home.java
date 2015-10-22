
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
		int nomEt = 0;
		System.out.println("Type selection ");
		Scanner n = new Scanner(System.in);
		int c = n.nextInt();

		switch (c) {// Select the type of sample
		case 1:// area

			foundHome2 = findHomeBySe(se);
			printFoundHome(foundHome2);
			break;
		case 2:// by room count

			foundHome = findHomeByKolKom(kolKom);
			printFoundHome(foundHome);
			break;
		case 3:// by room count and floor number

			foundHome = findHomeByNomKomNomEt(kolKom, nomEt);
			printFoundHome(foundHome);
			break;
		default:
			System.out.println("Net takoi");
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
		Scanner n = new Scanner(System.in);
		System.out.println("Vvedite kolicestvo komnat");
		int kom = n.nextInt();// number of rooms
		for (House house : houses) {

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
			if (s != null) {
				System.out.println("Apartment number " + s.getNomKv());
			}
		}
	}

	// Method for selecting at room count
	public static House[] findHomeBySe(int se) {
		House[] foundHome2 = new House[4];
		int i = 0;
		System.out.println("Vvedite ploscat kvartiri");
		Scanner n = new Scanner(System.in);
		int plo = n.nextInt();// Sets Square
		for (House house : houses) {

			if (house.getSe() > plo) {
				foundHome2[i] = house;
				i++;
			}
		}
		return foundHome2;
	}

	// the sampling method for the floor number and the number of rooms
	public static House[] findHomeByNomKomNomEt(int nomKom, int nomEt) {
		House[] foundHome3 = new House[4];
		int i = 0;
		System.out.println("Vvedite kolicestvo komnat i promezytok etazei");
		Scanner n = new Scanner(System.in);
		int kom = n.nextInt();
		int etMin = n.nextInt();
		int etMax = n.nextInt();
		for (House house : houses) {

			if ((house.getKolKom() == kom) && (house.getNomEt() > etMin) && (house.getNomEt() < etMax)) {
				foundHome3[i] = house;
				i++;
			}

		}
		return foundHome3;
	}

}
