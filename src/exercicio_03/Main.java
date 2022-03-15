package exercicio_03;

public class Main {

	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.setSaldo(200);
		
		System.out.println("Extrato da conta: " + conta.exibirExtrato());
		
		System.out.println("Sacar 50");
		conta.sacar(50);
		

		System.out.println("Extrato da conta: " + conta.exibirExtrato());
	}

}
