package application;

import java.util.Scanner;
import java.util.Locale;

public class program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		String[] vect = new String[] { "Maria", "Bob", "Alex", "Vicente" };

		for (int i = 0; i < vect.length; i++) {
			System.out.println(vect[i]);
		}
		System.out.println("=================");
		for (String obj : vect) {
			System.out.println(obj);
		}
		sc.close();
	}
}
