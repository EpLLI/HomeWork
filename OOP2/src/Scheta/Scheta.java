/**
 * class values ​​account
 */
package Scheta;

public class Scheta {
	private int id;
	private boolean stat;

	public Scheta(int id, boolean stat) {
		this.id = id;
		this.stat = stat;
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


}
