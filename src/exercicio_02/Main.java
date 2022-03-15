package exercicio_02;

public class Main {

	public static void main(String[] args) {
		Balanco balanco = new Balanco();
		balanco.setMes1(10);
		balanco.setMes2(20);
		balanco.setMes3(30);

		Double resultadoTrimestre = balanco.calculaTrimestre();

		System.out.println("O balanço trimestral foi de: " + resultadoTrimestre);
	}

}
