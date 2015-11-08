package Scheta;

import java.io.Serializable;

public class Krediti extends Scheta implements Serializable {

	private int dolg;

	public Krediti(int money, int procent, int dolg, int id, boolean stat) {
		super(id, stat, money, procent);
		this.dolg = dolg;
	}

	public int getDolg() {
		return dolg;
	}

	public void setDolg(int dolg) {
		this.dolg = dolg;
	}
	@Override
	public String toString() {
		StringBuilder klientSchet = new StringBuilder(super.toString()+" Dolg "+dolg+"\n");

		return new String(klientSchet);}
}
