/**
 * 
 */
package objetos;

import java.util.Scanner;

/**
 * @author Cleiton
 *
 */
public class TestaMetodo {
	public static void main(String[] args) {
		String opSucess = "Opera��o Realizada com sucesso! ";
		String opFail = "Opera��o n�o realizada!";
		
		Scanner entrada1 = new Scanner(System.in);
		System.out.print("Digite o valor a ser retirado: ");
		double valSaque = entrada1.nextDouble();

		
		Scanner entrada2 = new Scanner(System.in);
		System.out.print("Digite o valor a ser Depositado: ");
		double valDeposito = entrada2.nextDouble();
		
		Scanner entrada3 = new Scanner(System.in);
	
		Conta contaDoPaulo = new Conta();
	    contaDoPaulo.saldo = 0;
	    
	    if(contaDoPaulo.deposita(valDeposito)){
	    	System.out.println(opSucess+ "O valor depositado foi de "+valDeposito);
	    	System.out.println("atualmente o saldo � "+contaDoPaulo.saldo);
	    	}else {
	    		System.out.print(opFail +"\nMotivo: O Valor n�o pode ser negativo!!");
	    	}

	 // boolean conseguiuRetirar = contaDoPaulo.saca(20);
        if( contaDoPaulo.saca(valSaque)) {
        	System.out.println(opSucess);
        	System.out.println("Saldo atual da Conta ap�s o saque de "+valSaque+" � " +contaDoPaulo.saldo); 	
        }else {
        	System.out.println(opFail +"\nSaldo Insuficiente! ");
        }
       	    
	    
        Conta contaMarcela = new Conta();
        contaMarcela .deposita(1000);
        
		System.out.print("Digite o valor a que ser� transferido: ");
		double valTransf = entrada3.nextDouble();
		
        if(contaMarcela.transfere(valTransf, contaDoPaulo)) {
        	System.out.println(opSucess);
        }else {
        	System.out.println(opFail);
        }
        
        System.out.println(contaMarcela.saldo);
        System.out.println(contaDoPaulo.saldo);
	  }
}
