package variaveis_e_fluxo;

/*Imprima o resultado do somat�rio de 1 at� 1000 
(inclusive). Para isso voc� deve utilizar alguma vari�vel extra que armazena
a soma tempor�ria e aument�-la a cada novo passo. Compartilhe sua solu��o.*/

//Exercicio 04 variaveis de fluxo

public class somatorio1a100 {
	
	public static void main(String [] args) {
		int i = 0;
		int valor = 0;
		
		while (i <=1000) {
			System.out.println(valor);
			valor= valor+ 1;
			i++;
			}
	}

}
