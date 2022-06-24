/**
 * Created by iyasuwatts on 10/17/17.
 */

import java.util.Scanner;

public class Main {
	static String name = "";
    public static void main(String[] args ) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter your name: ");
		String name = in.nextLine();

	if (name.equals("Alice")) {
		System.out.println("Alice");
	}
	else if (name.equals("Bob")) {
		System.out.println("Bob");
	}
	else {
		System.out.println("Invalid");
	}
    }
}
