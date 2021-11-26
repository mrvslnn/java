package day41_excGarbargeCollector;

public class C01 {
	/*
	'ortalama' isminde bir method olu�turun ve int v  - int f 
	 isminde 2 adet parametresi olsun.
	int v = vize
	int f = final
	E�er  vize 100 den b�y�k, veya final 100'den b�y�k, 
	veya vize 0'dan k���k, veya final 0'dan k���k ise,
	Sistem ArithmeticException hatas� versin ve "Notlar 0-100 
	aras�nda olmal�" mesaj�n� d�nd�rs�n.
	Di�er durumlarda ise,
	vizenin y�zde 40 �n�, finalin y�zde 60 �n� als�n 
	ve toplas�n.(ortalama =)
	vizeye 120, finale 80 girin.
	Program�n �al��mas�n� sa�lay�n. (handle edin)
	 */
	
	public static void main(String[] args) {
     try {
		ortalama(120,80);
	} catch (Exception e) {
		System.out.println(e);
		
	}
	
	}
	public static void ortalama(int v, int f) {
		if (v>100||v<0||f>100||f<0) {
			throw new ArithmeticException("Notlar 0-100 aras�nda olmal�");
		}else {
			System.out.println((v*4)/10+ (f*6)/10);
		}
	}
	
}
