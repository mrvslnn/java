package day07_IfElseStatements;

import java.util.Scanner;

public class C2_IfElse01 {

	public static void main(String[] args) {
		
		// Kullanicidan dikd�rtgenin iki kenar�n� alin 
		//kare olup olmadigini yazd�r�n

		Scanner scan=new Scanner(System.in);
		
		System.out.println("L�tfen dikd�rtgen kenarlar�n� giriniz \nilk kenar� girince entera bas�n�z");
		
		double kenar1=scan.nextDouble();
		double kenar2=scan.nextDouble();
		
		if (kenar1==kenar2) {
			System.out.println("girdi�iniz dikd�rtgen karedir");
			
			
		} else {
			System.out.println("girdi�iniz dikd�rtgen kare de�il");
			scan.close();
		}
			

	}

}
