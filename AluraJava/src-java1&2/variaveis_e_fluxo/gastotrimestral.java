package variaveis_e_fluxo;
public class gastotrimestral {
	
	public static void main(String [] args) {
		
		int gastosJaneiro= 1500;
		int gastosFevereiro = 23000;
		int gastosMarco = 17000;
		
		
		int gastosTrimestral = gastosJaneiro + gastosFevereiro + gastosMarco; 
		
		System.out.println("O gasto Triemstral da empresa � de " + gastosTrimestral);
		//Exercicio 01 alura - variaveis de fluxo
		
		/*imprimir a m�dia mensal de gasto*/
		
		int media = gastosTrimestral/3;
		System.out.println("Valor da m�dia mensal � de R$" + media );
		//Exercicio 02 alura
		
	}
	

}
