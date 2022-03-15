package exercicio_01;

public class Main {

	public static void main(String[] args) {
		Numero num = new Numero();
		num.setN1(100);
		num.setN2(200);
		
		System.out.println("n1: " + num.getN1());
		System.out.println("n2: " + num.getN2());
		
		System.out.println("Troca!");
		num.troca();
		

		System.out.println("n1: " + num.getN1());
		System.out.println("n2: " + num.getN2());
	}

}
