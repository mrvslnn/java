package day09_switchCase;

import java.util.Scanner;

public class C1_SwichCase01 {

	public static void main(String[] args) {
		// Soru1 : Kullanicidan haftanin kacinci gunu oldugunu sorun ve gun ismini yazdirin

		Scanner scan=new Scanner(System.in);
		System.out.println("L�tfen haftan�n ka��nc� g�n�nde oldu�unuzu girin :");
		int gunNo=scan.nextInt();
		
		switch(gunNo) {
		
		case 1: System.out.println("bug�n pazartesi");
	break;	
		case 2 :System.out.println("bug�n sal�");
	break;	
		case 3 : System.out.println("bug�n �ar�amba");
	break;
        case 4: System.out.println("bug�n persembe");
	break;
		case 5 :System.out.println("bug�n cuma");
	break;	
		case 6 : System.out.println("bug�n cumartesi");
	break;	
		case 7 : System.out.println("bug�n pazar");
    break; //burda break olmasayd� defoult da �al���r�d�
		default: System.out.println("ge�erli g�n giri�i yaz�n");	
	
		
		}
		
	scan.close();
	}

}
