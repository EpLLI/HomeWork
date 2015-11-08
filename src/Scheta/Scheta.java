package Scheta;

import java.io.Serializable;

abstract class Scheta implements Serializable {
	private int money;
	private int procent;
	private int id;
	private boolean stat;

	public Scheta(int id, boolean stat, int procent, int money) {
		this.id = id;
		this.stat = stat;
		this.procent = procent;
		this.money = money;
	}

	public int getId() {
		return id;
	}

	public boolean getStat() {
		return stat;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setStat(boolean stat) {
		this.stat = stat;
	}

	public int getMoney() {
		return money;
	}

	public int getProcent() {
		return procent;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public void setProcent(int procent) {
		this.procent = procent;
	}
	@Override
	public String toString() {
		StringBuilder klientSchet = new StringBuilder("Schet  " + " Id: " + id+" Money:  "+money+"$"+" Procent  "+procent+"%"+" Stat:  "+stat);

		return new String(klientSchet);
	}
}
