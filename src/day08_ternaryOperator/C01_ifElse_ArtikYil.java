package day08_ternaryOperator;

import java.util.Scanner;

public class C01_ifElse_ArtikYil {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("L�tfen y�l girin");
		int yil=scan.nextInt();
		
		if ( yil % 4 == 0 && yil % 100!= 0)
		{System.out.println("art�k y�ld�r");}
		
		else if (yil %400==0)
		{ System.out.println("art�k y�ld�r");
		}
		else {System.out.println("de�il");}
		
		scan.close();
		
	}

}
