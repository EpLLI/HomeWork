package Isp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import Klient.Klient;
import Scheta.Krediti;
import Scheta.Scheta;
import Scheta.Vkladi;

public class KlientReal {
	public static ArrayList<Krediti> kred;
	private static ArrayList<Vkladi> vklad;

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		kred = s();
		vklad = si();
		ArrayList<Krediti> foundKrediti = null;
		ArrayList<Vkladi> foundVkladi = null;
		int id = 2900;
		System.out.println("Pinkod");
		Scanner n = new Scanner(System.in);
		int p = n.nextInt();// enter pincode
		if (id == p) {// It is working in coincidence pincode
			Klient kli = new Klient("Pupkin", 2900, "A001");// Klient data
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("objects.dat"));// Serializable
			Date now = new Date(System.currentTimeMillis());
			out.writeObject(now);
			out.writeObject(kli);
			out.close();// end Serializable

			ObjectInputStream in = new ObjectInputStream(new FileInputStream("objects.dat")); // De
																								// Serializable
			Date d1 = (Date) in.readObject();
			System.out.println("A Date object: " + d1);// conclusion date

			System.out.println(kli);
			System.out.println("Type selection ");// mennyu implementation
													// methods
			System.out.println("1 balans");
			System.out.println("2 sort for stat");
			System.out.println("3 id poisk");
			System.out.println("4 vse sceta");

			int c = n.nextInt();

			switch (c) {// mennyu implementation methods
			case 1:
				System.out.println("Type selection ");
				System.out.println("1 Oricatelni Balans");
				System.out.println("2 Polozitelnii Balans");
				System.out.println("3 Symarnii Balans");
				int t = n.nextInt();
				switch (t) {

				case 1:
					foundKrediti = rascetOtricBalans();

					break;
				case 2:

					foundVkladi = rascetPolozBalans();

					break;
				case 3:
					foundVkladi = rascetObsciBalans();

					break;
				default:
					System.out.println("Net takoi");
				}
				break;

			case 2:
				System.out.println("Type sortirovki ");
				System.out.println("1 Zablokirovanie Vkladi");
				System.out.println("2 Razblokirovanie Vkladi ");
				System.out.println("3 Zablokirovanie Krediti");
				System.out.println("4 Razblokirovanie Krediti");
				int z = n.nextInt();
				switch (z) {

				case 1:
					foundVkladi = falseScetVkladi();
					printf(foundVkladi);
					break;

				case 2:
					foundVkladi = trueScetVkladi();
					printf(foundVkladi);
					break;
				case 3:
					foundKrediti = falseScetKrediti();
					printFo(foundKrediti);
					break;
				case 4:// by room count and floor number
					foundKrediti = trueScetKrediti();
					printFo(foundKrediti);
					break;

				default:
					System.out.println("Net takoi");
					break;
				}
				break;
			case 3:
				System.out.println("Type id Poiska ");
				System.out.println("1 Id poisk Krediti");
				System.out.println("2 Id poisk Vkladi ");
				int y = n.nextInt();
				switch (y) {

				case 1:

					foundKrediti = idPoiskKrediti();
					printFo(foundKrediti);
					break;
				case 2:

					foundVkladi = idPoiskVkladi();
					printf(foundVkladi);
					break;
				default:
					System.out.println("Net takoi");
					break;
				}
				break;
			case 4:
				System.out.println(kred);
				System.out.println(vklad);
				break;
			default:
				System.out.println("Net takoi");
				break;
			}
		}
	}

	private static ArrayList<Krediti> s() {// credit collection
		ArrayList<Krediti> kred = new ArrayList<Krediti>();
		Krediti kred1 = new Krediti(5000, 20, -4500, 2000, true);
		kred.add(kred1);
		Krediti kred2 = new Krediti(10000, 15, -8000, 2001, false);
		kred.add(kred2);
		Krediti kred3 = new Krediti(15000, 10, -15500, 2002, true);
		kred.add(kred3);
		Krediti kred4 = new Krediti(20000, 5, -1000, 2003, false);
		kred.add(kred4);
		return kred;
	}

	private static ArrayList<Vkladi> si() {// collection of contributions
		ArrayList<Vkladi> vklad = new ArrayList<Vkladi>();
		Vkladi vklad1 = new Vkladi(20000, 20, 2004, true, 1000);
		vklad.add(vklad1);
		Vkladi vklad2 = new Vkladi(30000, 25, 2005, false, 1500);
		vklad.add(vklad2);
		Vkladi vklad3 = new Vkladi(40000, 30, 2006, true, 2500);
		vklad.add(vklad3);
		Vkladi vklad4 = new Vkladi(50000, 30, 2007, false, 5000);
		vklad.add(vklad4);
		return vklad;
	}

	/*
	 * The method of calculation of the negative balance
	 */
	public static ArrayList<Krediti> rascetOtricBalans() {
		ArrayList<Krediti> foundKrediti = new ArrayList<Krediti>();

		int t = 0;
		for (Krediti vkla : kred) {

			t = t + vkla.getDolg();

		}
		System.out.println("Otrictelni balanse Scetov=  " + t + "$");
		return foundKrediti;
	}

	/*
	 * The method of calculation of the positively balance
	 */
	public static ArrayList<Vkladi> rascetPolozBalans() {
		ArrayList<Vkladi> foundVkladi = new ArrayList<Vkladi>();

		int t = 0;
		for (Vkladi vkla : vklad) {

			t = t + vkla.getPribil();
		}
		System.out.println("Polozitelnii balanse Scetov=  " + t + "$");
		return foundVkladi;
	}

	/*
	 * The method of calculation of the balance
	 */
	public static ArrayList<Vkladi> rascetObsciBalans() {
		ArrayList<Vkladi> foundVkladi = new ArrayList<Vkladi>();

		int t = 0;
		for (Vkladi vkla : vklad) {

			t = t + vkla.getPribil();
		}
		int z = 0;
		for (Krediti kredit : kred) {

			z = z + kredit.getDolg();
		}
		int y = 0;
		y = z + t;
		System.out.println("Symarnii balanse Scetov=  " + y + "$");
		return foundVkladi;
	}

	/*
	 * choice method blocked deposits
	 */
	public static ArrayList<Vkladi> falseScetVkladi() {
		ArrayList<Vkladi> foundVkladi = new ArrayList<Vkladi>();
		int i = 0;
		for (Vkladi vkla : vklad) {
			if (vkla.getStat() == false) {
				foundVkladi.add(vkla);
				i++;
			}
		}

		return foundVkladi;
	}

	/*
	 * choice method active deposits
	 */
	public static ArrayList<Vkladi> trueScetVkladi() {
		ArrayList<Vkladi> foundVkladi = new ArrayList<Vkladi>();
		int i = 0;
		for (Vkladi vkla : vklad) {
			if (vkla.getStat() == true) {
				foundVkladi.add(vkla);
				i++;
			}
		}

		return foundVkladi;
	}

	/*
	 * Search method by ID
	 */
	public static ArrayList<Vkladi> idPoiskVkladi() {
		ArrayList<Vkladi> foundVkladi = new ArrayList<Vkladi>();

		int i = 0;
		Scanner n = new Scanner(System.in);
		System.out.println("Vvedite Id");
		int t = n.nextInt();
		for (Vkladi vkla : vklad) {
			if (vkla.getId() == t) {
				foundVkladi.add(vkla);
				i++;
			}
		}

		return foundVkladi;
	}

	/*
	 * the output method associated to the deposits
	 */
	public static void printf(ArrayList<Vkladi> foundVkladi) {

		for (Vkladi s : foundVkladi) {
			if (s != null) {
				System.out.println("Vklad : " + s.getId() + " " + s.getMoney() + "$  " + s.getProcent() + "%"
						+ " Pribil " + s.getPribil() + "$" + "  " + s.getStat());
			}
		}
	}

	/*
	 * the method of choice blocked
	 */
	public static ArrayList<Krediti> falseScetKrediti() {
		ArrayList<Krediti> foundKrediti = new ArrayList<Krediti>();
		int i = 0;
		for (Krediti kredit : kred) {
			if (kredit.getStat() == false) {
				foundKrediti.add(kredit);
				i++;
			}
		}

		return foundKrediti;
	}

	/*
	 * the method of choice of active
	 */
	public static ArrayList<Krediti> trueScetKrediti() {
		ArrayList<Krediti> foundKrediti = new ArrayList<Krediti>();
		int i = 0;
		for (Krediti kredit : kred) {
			if (kredit.getStat() == true) {
				foundKrediti.add(kredit);
				i++;
			}
		}

		return foundKrediti;
	}

	/*
	 * search method by ID
	 */
	public static ArrayList<Krediti> idPoiskKrediti() {
		ArrayList<Krediti> foundKrediti = new ArrayList<Krediti>();
		int i = 0;
		Scanner n = new Scanner(System.in);
		System.out.println("Vvedite Id");
		int t = n.nextInt();// number of rooms
		for (Krediti kredit : kred) {
			if (kredit.getId() == t) {
				foundKrediti.add(kredit);
				i++;
			}
		}

		return foundKrediti;
	}
	/*
	 * the output method on Krediti
	 */
	public static void printFo(ArrayList<Krediti> foundKrediti) {

		for (Krediti s : foundKrediti) {
			if (s != null) {
				System.out.println("Kredit : " + s.getId() + " " + s.getMoney() + "$  " + s.getProcent() + "%"
						+ " Dolg " + s.getDolg() + "$" + "  " + s.getStat());
			}
		}
	}

}
