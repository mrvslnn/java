package Java;

import java.util.Scanner;

public class had�_�y�s�n {

	public static void main(String[] args) {

	/*
		 substSquare isminde bir method verildi�inde
		   bu method parametre olara iki int al�r
		   return tipi int olur
		   getSumOfSquares methodunu kullanarak
		Parameter 1 toplamin karesi+Parameter 2 toplamin karesi= sonuc
		   �rnek:
		    int 1 = 10;              yazaca��n�z method 10 u kullanarak 3250 sonucu verir
		    int 2 = 5;                yazaca��n�z method 5 i kullanarak 225 sonucu verir
		    3025 + 225 = 3250
		    return 3250
		    */
		  Scanner scan = new Scanner(System.in);
		  
		  System.out.println("lutfen birinci sayiyi giriniz");
		  int sayi1=scan.nextInt();
		  
		  System.out.println("lutfen ikinci sayiyi giriniz");
		  int sayi2=scan.nextInt();
		  
		  int sonuc=subsSquare(sayi1 , sayi2);  
		  System.out.println(sonuc);
		 
	}

	
	private static int getSumOfSquares(int n) {
		int toplam=0;
		for (int i = 0; i <= n ; i++) {
			toplam+=i;
		}
		return toplam*toplam;
	}

	private static int subsSquare(int sayi1, int sayi2) {
		return getSumOfSquares(sayi1)+getSumOfSquares(sayi2);
		
	}

	




	
}
