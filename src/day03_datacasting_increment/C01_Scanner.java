package day03_datacasting_increment;

import java.util.Scanner;

public class C01_Scanner {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("l�tfen isminizi ve soyisminizi yaz�n�z,\nisminizi yazd�ktan sonra enter a bas�n�z ");
		
		String name=scan.nextLine();
		String surname=scan.nextLine();
		
		System.out.println("isminiz : "+ name + "\nSoyisminiz : "+ surname +"\nKursumuza kayd�n�z al�nm��t�r. te�ekk�r ederiz.");
		
		scan.close();
		

	}

}
