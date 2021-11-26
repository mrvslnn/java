package day30_DateTime;

import java.time.LocalDate;

public class C01_LocalDate {

	public static void main(String[] args) {
	LocalDate tarih = LocalDate.now(); // tarih isminde obj creat ettik
		System.out.println("Bug�n�n tarihi : " + tarih);
		System.out.println("Bug�nden 21 g�n sonras� " + tarih.plusDays(21));
		System.out.println("Bug�nden 3 y�l sonras� " + tarih.plusYears(3));
		System.out.println("Bug�nden 3 g�n 5 ay 2 yil sonrasi : " + tarih.plusDays(3).plusMonths(5).plusYears(2));
	    System.out.println("Bug�nden 40 g�n �ncesi : "+tarih.minusDays(40));
	    System.out.println("Bug�n�n 5 yil �ncesinin 2 ay sonrasinin 3 hafta ertesi : "+tarih.minusYears(5).plusMonths(2).plusWeeks(3));
	
	    System.out.println(tarih.getDayOfMonth());   //2
	    System.out.println(tarih.getDayOfYear());   //214. g�n
	    System.out.println(tarih.getDayOfWeek());   //monday
	    System.out.println(tarih.getMonthValue());  //8. ay
	    System.out.println(tarih.getMonth());       //august
	
	LocalDate dogumGunDate= LocalDate.of(1974, 4, 3);
	System.out.println("dogum tarihi "+dogumGunDate);
	System.out.println("dogum g�n� "+dogumGunDate.getDayOfWeek());//wednesday
	System.out.println(dogumGunDate.isAfter(tarih));//false
	System.out.println(dogumGunDate.isBefore(tarih));//true
	System.out.println(dogumGunDate.equals(tarih));//false
	
	


	}
	

}
