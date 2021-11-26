package day31_varargs;

public class C04_Varargs04 {

	public static void main(String[] args) {

		int arr[] = { 1, 3, 5, 7, 9 };

		System.out.println("Array toplam� : " + arrTopla(arr));
		System.out.println("Varargs toplami : " + varargstopla(1, 3, 5, 7, 9));
		System.out.println("Varargs�n arr parametreli toplami : " + varargstopla(arr));
		
		
	}   // varargs array gibi davrand��� i�in herhangi bir arrayi parametre olarak alabilir

	private static int varargstopla(int... i) {
		int topla = 0;
		for (int each : i) {
			topla += each;
		}
		return topla;
	}

//array elemanlar�n� toplayan metod
	private static int arrTopla(int[] arr) {
		int topla = 0;
		for (int a : arr) {
			topla += a;
		}
		return topla;
	}
//varargs elemanlar� toplayan metod

}
