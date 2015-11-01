/**
 * Class works with the client value
 * Its values Serializable
 */
package Klient;

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
	//output method of data about the user
	@Override
	public String toString() {
		StringBuilder klientSchet = new StringBuilder(super.toString() + " Id: " + id);

		return new String(klientSchet);
	}

}
