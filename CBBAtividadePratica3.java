/* Implemente e execute uma classe que construa um array
com capacidade de armazenar 100 inteiros; inicialize então 
cada elemento do array com os números de 0 até 99 e imprima-os 
por meio de uma estrutura for como já foi exemplifi cado, mas 
em vez de definir explicitamente o intervalo do looping,
utilize o atributo lenght do array para definir seu tamanho. */

public class CBBAtividadePratica3 {
	public static void main(String[] args) {
		
		// Cria o array com capacidade para 100 inteiros
	    int[] array = new int[100]; 

	    // Inicializa cada elemento do array com o número correspondente
	    for (int i = 0; i < array.length; i++) {
        array[i] = i;
	    }
	    
	    // Imprime cada número do array
	    for (int i = 0; i < array.length; i++) {
        System.out.println(array[i]);
	    }
	}
}
