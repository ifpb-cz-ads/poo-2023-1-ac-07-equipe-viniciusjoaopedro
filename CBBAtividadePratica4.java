/* Implemente e execute uma nova classe semelhante à da
Atividade 1, mas desta vez modifi que os parâmetros da 
estrutura for para forçar a saída de um erro no sistema, 
forçando o lançamento de uma Exception. */

public class CBBAtividadePratica4 {
    public static void main(String[] args) {

        // Cria o array com capacidade para 100 inteiros
        int[] array = new int[100]; 

        // Inicializa e imprime cada elemento do array com o número correspondente
        for (int i = 0; i < 101; i++) {
            array[i] = i;
            System.out.println(array[i]);
        }
    }
}