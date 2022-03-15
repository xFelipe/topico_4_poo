package exercicio_03;

public class Conta {

	private double saldo;

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void depositar(double saldo) {
		if (saldo <= 0) {
			System.out.println("Operação inválida. Não é possível depositar um valor negativo");
			return;
		};
		this.saldo += saldo;
	}

	public void sacar(double saque) {
		if (saque <= 0) {
			System.out.println("Operação inválida. Não é possível sacar um valor negativo");
			return;
		};

		double taxaDeSaque = 1.005;
		this.saldo -= saque * taxaDeSaque;
	}

	public double exibirExtrato() {
		return this.saldo;
	}
	
	
}
