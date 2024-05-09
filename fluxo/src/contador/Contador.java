package contador;
import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt();
		
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();
		try {
			contador(parametroUm,parametroDois);		
		}catch(ParametrosInvalidosException e) {
			e.messageError();
		}
	
	}
	
	  
	  public static void contador(int numero1, int numero2 )throws ParametrosInvalidosException {
		  if(numero1 > numero2) //PRIMEIRO VALOR NÃO PODE SER MAIOR QUE O SEGUNDO
			  throw new ParametrosInvalidosException();
		  else{
			   int cont = numero2 - numero1;
			   for(int i=1;i<=cont;i++){
				   System.out.println("IMPRIMINDO NUMERO " +i);
				 }
		  }
		}
	
}