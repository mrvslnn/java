package day09_switchCase;

import java.util.Scanner;

public class C2_SwitchCase02 {

	public static void main(String[] args) {
		// Soru3 : Kullanicidan bir sayi girmesini isteyin
		// Girilen sayi
		 //10 ise �Iki basamakli en kucuk sayi 
		 //100 ise �uc basamakli en kucuk sayi�
		 //1000 ise �dort basamakli en kucuk sayi�
		 //diger durumlarda �Girdigin sayiyi degistir� yazdirin

		Scanner scan=new Scanner(System.in);
		System.out.println("Bir tamsay� girin");
		int sayi=scan.nextInt();
		
		switch(sayi) {
		
		case 10: System.out.println("iki basamakl� en k���k say�");
	break;
		case 100: System.out.println("�� basamakl� en k���k say�");
	break;
		case 1000: System.out.println("D�rt basamakli en k���k say�");
	break;
	
	default :
		System.out.println("Girdi�iniz say�y� de�i�tirin");
		
		}
		scan.close();
		
	}

}
