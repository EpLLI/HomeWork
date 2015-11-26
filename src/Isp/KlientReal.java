package Isp;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

import Klient.Klient;
import Scheta.Krediti;
import Scheta.Vkladi;

public class KlientReal {
	public static ArrayList<Krediti> kred;
	public static ArrayList<Vkladi> vklad;
	public static ResourceBundle rb;
	public static Logger logger = Logger.getInstance();

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		kred = genKredo();
		vklad = genVklado();
		ArrayList<Krediti> foundKrediti = null;
		ArrayList<Vkladi> foundVkladi = null;

		int id = 2900;
		System.out.println("Pinkod|Пинкод");
		Scanner n = new Scanner(System.in);
		int p = n.nextInt();// enter pincode пинкод
		if (id == p) {// It is working in coincidence pincode

			Klient kli = new Klient("Pupkin", 2900, "A001");// Klient data
			System.out.println(kli);
			System.out.println("Select language | Выберите язык:");
			System.out.println("1 = English  |  2 = Русский");

			do {
				Scanner scanner = new Scanner(System.in);

				Locale l;

				while (true) {
					String in = scanner.next();

					if (in.equalsIgnoreCase("1")) {
						l = new Locale("en", "US");
						logger.log("User selected US locale");
						break;
					}
					if (in.equalsIgnoreCase("2")) {
						l = new Locale("ru", "RU");
						logger.log("User selected RU locale");
						break;
					}
				}
				rb = ResourceBundle.getBundle("I18n/strings", l);
				System.out.println(rb.getString("Type"));// mennyu
															// implementation
				// methods
				System.out.println(rb.getString("1_balans"));

				System.out.println(rb.getString("2_sort"));
				System.out.println(rb.getString("3_id"));
				System.out.println(rb.getString("4_vse"));
				System.out.println(rb.getString("5_vivod"));
				System.out.println(rb.getString("9_vihod"));
				int c = n.nextInt();

				if (foundKrediti != null)
					printfoundKrediti(foundKrediti);
				switch (c) {// mennyu implementation methods
				case 1:
					System.out.println("Type selection ");
					System.out.println("1 Oricatelni Balans");
					System.out.println("2 Polozitelnii Balans");
					System.out.println("3 Symarnii Balans");
					int t = n.nextInt();
					logger.log("User selected balans");
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
					logger.log("User selected sort");
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
					logger.log("User selected poisk id");
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
					logger.log("User selected vivod vseh kreditov");
					System.out.println(kred);
					System.out.println(vklad);
					break;
				case 5:
					if (foundKrediti != null) {

						foundKrediti = findKreditiByFile();
					}

					if (foundKrediti == null) {
						System.out.println("net");
					}
					break;
				case 9:
					logger.log("User selected exit");
					System.exit(0);
					break;
				default:
					System.out.println("Net takoi");
					break;
				}

			} while (true);
		}
	}

	/**
	 * collection of credits
	 * 
	 * @return
	 */
	private static ArrayList<Krediti> genKredo() {
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

	/**
	 * collection of deposits
	 * 
	 * @return
	 */
	private static ArrayList<Vkladi> genVklado() {
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

	/**
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

	/**
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

	/**
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

	/**
	 * choice method blocked deposits
	 */
	public static ArrayList<Vkladi> falseScetVkladi() {
		ArrayList<Vkladi> foundVkladi = new ArrayList<Vkladi>();
		for (Vkladi vkla : vklad) {
			if (vkla.getStat() == false) {
				foundVkladi.add(vkla);
			}
		}
		return foundVkladi;
	}

	/**
	 * choice method active deposits
	 */
	public static ArrayList<Vkladi> trueScetVkladi() {
		ArrayList<Vkladi> foundVkladi = new ArrayList<Vkladi>();
		for (Vkladi vkla : vklad) {
			if (vkla.getStat() == true) {
				foundVkladi.add(vkla);
			}
		}
		return foundVkladi;
	}

	/**
	 * Search method by ID
	 */
	public static ArrayList<Vkladi> idPoiskVkladi() {
		ArrayList<Vkladi> foundVkladi = new ArrayList<Vkladi>();
		Scanner n = new Scanner(System.in);
		System.out.println("Vvedite Id");
		int t = n.nextInt();
		for (Vkladi vkla : vklad) {
			if (vkla.getId() == t) {
				foundVkladi.add(vkla);
			}
		}
		return foundVkladi;
	}

	/**
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

	/**
	 * the method of choice blocked
	 */
	public static ArrayList<Krediti> falseScetKrediti() {
		ArrayList<Krediti> foundKrediti = new ArrayList<Krediti>();
		for (Krediti kredit : kred) {
			if (kredit.getStat() == false) {
				foundKrediti.add(kredit);
			}
		}
		return foundKrediti;
	}

	/**
	 * the method of choice of active
	 */
	public static ArrayList<Krediti> trueScetKrediti() {
		ArrayList<Krediti> foundKrediti = new ArrayList<Krediti>();
		for (Krediti kredit : kred) {
			if (kredit.getStat() == true) {
				foundKrediti.add(kredit);
			}
		}
		return foundKrediti;
	}

	/**
	 * search method by ID
	 */
	public static ArrayList<Krediti> idPoiskKrediti() {
		ArrayList<Krediti> foundKrediti = new ArrayList<Krediti>();
		Scanner n = new Scanner(System.in);
		System.out.println("Vvedite Id");
		int t = n.nextInt();// number of rooms
		for (Krediti kredit : kred) {
			if (kredit.getId() == t) {
				foundKrediti.add(kredit);
			}
		}
		return foundKrediti;
	}

	/**
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

	public static ArrayList<Krediti> findKreditiByFile() {
		ArrayList<Krediti> foundKrediti = new ArrayList<Krediti>();
		try {
			ObjectInputStream objIn = new ObjectInputStream(new FileInputStream("objects.dat"));
			boolean check = true;

			while (check) {
				try {
					foundKrediti.add((Krediti) objIn.readObject());
				} catch (EOFException ex) {
					check = false;
					logger.log("Error");
				}
			}
			objIn.close();
		} catch (Exception e) {
			e.printStackTrace();
			logger.log("Error");
		}
		return foundKrediti;
	}

	public static void printfoundKrediti(ArrayList<Krediti> foundKrediti) throws IOException {
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("objects.dat"));
		for (Krediti s : foundKrediti) {
			if (s != null) {
				System.out.println(s.toString());
				out.writeObject(s);
			}
		}
		out.close();
		System.out.println("");
	}

}
