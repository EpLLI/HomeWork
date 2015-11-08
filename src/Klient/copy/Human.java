package Klient.copy;

public class Human {
	private String name;
    private int pin;

    public Human(String name, int pin) {
        this.name = name;
        this.pin = pin;
    }

    public String getName() {
        return name;
    }

    public int getPin() {
        return pin;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    @Override
    public String toString() {
        return "Name: " + name + ". pin: " + pin + ".";
    }
}

