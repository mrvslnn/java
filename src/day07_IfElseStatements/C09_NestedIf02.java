package day07_IfElseStatements;

import java.util.Scanner;

public class C09_NestedIf02 {

	public static void main(String[] args) {
		
		 /*
         * 
         * Nested If kullanarak asagidaki soruyu cozen kodu yaziniz. Kullanicidan bir
         * sifre girmesini isteyin Eger ilk harf buyuk harf ise �A� olup olmadigini
         * kontrol edin. Ilk harf A ise �Gecerli Sifre� degilse �Gecersiz Sifre�
         * yazdirin. Eger ilk harf kucuk harf ise �z� olup olmadigini kontrol edin. Ilk
         * harf z ise �Gecerli Sifre� degilse �Gecersiz Sifre� yazdirin.
         * 
         */

		Scanner scan=new Scanner(System.in);
		
		System.out.println("L�tfen �ifre giriniz");
	   
		char sifreIlkHarf=scan.next().charAt(0);
		
	if (sifreIlkHarf>='a' && sifreIlkHarf<='z') { if (sifreIlkHarf=='z') {System.out.println("�ifre ge�erli");}
	                                              else {System.out.println("�ifre ge�ersiz");}}
	     
	   else if (sifreIlkHarf>='A' && sifreIlkHarf<='Z') { if (sifreIlkHarf=='A') {System.out.println("�ifre ge�erli");}
	        else {System.out.println("�ifre ge�ersiz"); }}
	
   else { System.out.println("�ifre harf ile ba�lamal�d�r");} 
	
	
	scan.close();
	
	
	}

}
