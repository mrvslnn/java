package day37_overriding;

public class Dog extends Animal {
	@Override//annotation mutlaka child da yazilir parent ve child 
	//methodlar�nda iliski kurar
	//extends nas�l parent ve child iliskisi kuruyorsa
	//override da child ve parent class�ndaki methodlar aras�nda iliski
	//kurar
	
	public void beslenme() {
		System.out.println("kemik ile beslenir");
	}

	@Override
	public void tatli() {//public olur protected olmaz
		System.out.println("fistik sarma");
	}
	@Override
	public String icecek() {
		System.out.println("tursu suyu");
		return "yaras�n";
	}
	@Override
	public Integer topla() {
		return 41+54;
	}

	@Override
	public Dog fatih() {
		
		return new Dog();
	}
	}

