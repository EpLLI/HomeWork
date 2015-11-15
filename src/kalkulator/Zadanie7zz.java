package kalkulator;

import java.util.Scanner;

public class Zadanie7zz {
	
	
	public static void main(String[] args) {
		while(true) {
		    
		int a;
		Scanner in = new Scanner(System.in);
		a = in.nextInt();
		char b;
		int z;
		int r;
		b = in.next().charAt(0); //considered a char
		switch (b) { // Asking expression Svicha
		case '+': // arguments +
			z = in.nextInt();
			r=z+a;
			System.out.println("a+z="+r);
			break;
		case '*':// arguments *
			z = in.nextInt();
			r=z*a;
			System.out.println("a*z="+r);
			break;
			
		case 'q':// arguments exit
			break;
			
		}
	}

	}
}