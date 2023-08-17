package application;

import java.util.Locale;
import java.util.Scanner;

import services.PrintService;

public class Generics {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Locale.setDefault(Locale.US);
	
	PrintService<String> ps = new PrintService<>();
	
	System.out.print("how many values: ");
	int n = sc.nextInt();
	
	for (int i=0; i< n; i++) {
		String value = sc.next();
		ps.addValue(value);
	}
	
	ps.print();
	System.out.println("first: " +ps.first());
	
	
	
	sc.close();
	}

}
