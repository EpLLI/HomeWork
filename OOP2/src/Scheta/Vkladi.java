/**
 * Class to work with the Vkladi value
 */

package Scheta;

public class Vkladi extends Scheta {

	private int money;
	private int procent;
	private int pribil;

	public Vkladi(int money, int procent, int id, boolean stat, int pribil) {
		super(id, stat);
		this.money = money;
		this.procent = procent;
		this.pribil = pribil;
	}

	public int getMoney() {
		return money;
	}

	public int getProcent() {
		return procent;
	}

	public int getPribil() {
		return pribil;
	}

	public void setPribil(int pribil) {
		this.pribil = pribil;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public void setProcent(int procent) {
		this.procent = procent;
	}

}
