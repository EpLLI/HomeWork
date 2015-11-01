/**
 * Class to work with the Krediti value
 */
package Scheta;

public class Krediti extends Scheta {

	private int money;
	private int procent;
	private int dolg;

	public Krediti(int money, int procent, int dolg, int id, boolean stat) {
		super(id, stat);
		this.money = money;
		this.procent = procent;
		this.dolg = dolg;
	}

	public int getMoney() {
		return money;
	}

	public int getProcent() {
		return procent;
	}

	public int getDolg() {
		return dolg;
	}

	public void setDolg(int dolg) {
		this.dolg = dolg;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public void setProcent(int procent) {
		this.procent = procent;
	}

}
