package day07_IfElseStatements;

import java.util.Scanner;

public class C3_IfElse02 {

	public static void main(String[] args) {
		
		//kullan�c�dan bir karakter girmesini isteyin
		//girilen karakterin harf olup olmad�g�n� yazd�r�n
		
		
		Scanner scan=new Scanner(System.in);
	
		System.out.println("l�tfen bir karakter giriniz");
		
		char karakter=scan.next().charAt(0);
		
		if (karakter>='A' && karakter<='Z' || karakter>='a'&& karakter<='z') {
			System.out.println("girilen karakter harftir");
		} else {
			System.out.println("girilen say� harf de�il");
		}
			
		scan.close();
			
	
	}

}
