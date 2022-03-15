package exercicio_04;

public class Main {

	public static void main(String[] args) {
		Contador contador = new Contador();
		
		contador.setNumero(5);
		System.out.println("Numero inicial: " + contador.getNumero());
		
		System.out.println("Incrementando...");
		contador.incrementa();
		System.out.println("Numero atual: " + contador.getNumero());
		
		System.out.println("Decrementando...");
		contador.decrementa();
		System.out.println("Numero atual: " + contador.getNumero());
	}

}
