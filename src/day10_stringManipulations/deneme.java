package day10_stringManipulations;

import java.util.Scanner;

public class deneme {

	public static void main(String[] args) {
		
		
		Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz");
        String cumle=scan.nextLine().toLowerCase();
        System.out.println("Lutfen bir kelime giriniz...");
        String kelime=scan.next().toLowerCase();
        
        if  (cumle.indexOf(kelime)==-1) { System.out.println("c�mlede kullan�lmam��");}
        else if (cumle.indexOf(kelime)==(cumle.lastIndexOf(kelime))) { System.out.println("1 kere kullan�lm��");}
        
        else { System.out.println("1 den fazla kullan�lm��");}
        
      

	scan.close();
	
	}

}
