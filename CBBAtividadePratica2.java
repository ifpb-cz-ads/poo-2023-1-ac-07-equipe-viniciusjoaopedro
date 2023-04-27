/* Implemente e execute uma nova classe que construa um array 
 * com capacidade de armazenar 100 inteiros, mas dessa vez 
 * inicialize cada elemento do array com os números 
 * de 1 até 100 e imprima-os por meio de uma estrutura for,
conforme foi exemplifi cado. */

public class CBBAtividadePratica2 {
    public static void main(String[] args) {

        // Cria o array com capacidade para 100 inteiros
        int[] array = new int[100]; 

        // Inicializa e imprime cada elemento do array com o número correspondente
        for (int i = 0; i < 100; i++) {
            array[i] = i+1;
            System.out.println(array[i]);
        }
    }
}