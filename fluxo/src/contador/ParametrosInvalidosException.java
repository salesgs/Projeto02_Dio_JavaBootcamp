package contador;

public class ParametrosInvalidosException extends Exception {

	protected static void messageError() {
	  System.out.println("O segundo parâmetro deve ser maior que o primeiro");
	}
}
