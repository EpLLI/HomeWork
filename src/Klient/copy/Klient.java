package Klient.copy;

import java.io.Serializable;

public class Klient extends Human implements Serializable {
	private String id;

	public Klient(String name, int pin, String id) {
		super(name, pin);
		this.id = id;

	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		StringBuilder klientSchet = new StringBuilder(super.toString() + " Id: " + id);

		return new String(klientSchet);
	}

}
