package day07_IfElseStatements;

import java.util.Scanner;

public class C08_NestedIf01 {

	public static void main(String[] args) {
	
		// Kullanicidan cinsiyet ve yas aliniz
		// Eger calisan kadinsa 60 yasindan buyuk oldugunda emekli olabilir,
		// calisan erkekse 65 yasindan buyukse emekli olabilir yazdirin
		// emekli olamayacaksa emekli olamazsin daha ... yil calisman lazim yazdirin
   
		Scanner scan=new Scanner(System.in);
		
		System.out.println("L�tfen cinsiyetinizi giriniz\nErkek i�in E, Kad�n i�in K girin");
		
		char cinsiyet=scan.next().toUpperCase().charAt(0);
		
		System.out.println("L�tfen ya��n�z� tam say� olarak giriniz");
		 
		int yas=scan.nextInt();
		
		if (cinsiyet=='K') { if(yas>=60) { System.out.println("emekli olabilirsiniz");}
		                  else { System.out.println("Emekli olamazs�n�z "+(60-yas)+ " sene daha �al��mal�s�n�z");}
		
		               }
		
		else { if (yas>=65) {System.out.println("Emekli olabilirsiniz");}
		      else { System.out.println("Emekli olamazs�n�z "+ (65-yas)+ " sene daha �al��mal�s�n�z");}
		}
			
		
		scan.close();
		
}
}






























