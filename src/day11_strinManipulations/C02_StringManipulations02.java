package day11_strinManipulations;

import java.util.Scanner;

public class C02_StringManipulations02 {

	public static void main(String[] args) {
		

		Scanner scan=new Scanner(System.in);
	System.out.println("L�tfen mail adresinizi girin");
	String mail=scan.next().toLowerCase();
	
	if (mail.contains("gmail.com")){
		
			if(mail.indexOf("gmail.com")== mail.lastIndexOf("gmail.com")){
			
			System.out.println("kaydedildi");}
			
			else { System.out.println("l�tfen adresinizi dogru girin");}}
	
	else { System.out.println("gmail adresinizi girin");	}	
			
	scan.close();
	
	}
}
