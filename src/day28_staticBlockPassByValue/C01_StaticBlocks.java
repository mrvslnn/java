package day28_staticBlockPassByValue;

public class C01_StaticBlocks {

	static int sayi=10;
	
	static {
		System.out.println("1.Static block �al��t�");
		sayi=20;
	}
	static {
		System.out.println("2.Static block �al��t�");
		sayi=30;
	}
	static {
		System.out.println("3.Static block �al��t�");
		sayi=45;
	}
	public static void main(String[] args) {
		
		System.out.println("main methodun ilk sat�r�nda sayi:"+sayi);
	}
	static {
		System.out.println("main methoddan sonraki block �al��t�");
		sayi=100;
	}
}
