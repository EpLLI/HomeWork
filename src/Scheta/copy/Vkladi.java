package Scheta.copy;

import java.io.Serializable;

public class Vkladi extends Scheta implements Serializable {

	private int pribil;

	public Vkladi(int money, int procent, int id, boolean stat, int pribil) {
		super(id, stat, money, procent);

		this.pribil = pribil;
	}

	public int getPribil() {
		return pribil;
	}

	public void setPribil(int pribil) {
		this.pribil = pribil;
	}
	@Override
	public String toString() {
		StringBuilder klientSchet = new StringBuilder(super.toString()+" Pribil "+pribil+"\n");

		return new String(klientSchet);}
}
