/* Implemente e execute uma classe que, por meio do Scanner, solicita
10 números inteiros ao usuário. Então utilize um array para armazenar 
o valor desses números, imprima todos eles e por último mostre o número 
de maior valor. */

import java.util.Scanner;

public class CBBAtividadePratica6 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Cria um array para 10 números inteiros
        int[] numeros = new int[10];

        // Pede para digitar 10 números inteiros e os armazena no array
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o " + (i+1) + "º número inteiro: ");
            numeros[i] = input.nextInt();
        }

        // Imprime todos os números armazenados no array
        System.out.println("Números digitados:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
        
        // Encontra o número de maior valor no array
        int maiorNumero = 0;
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maiorNumero) {
                maiorNumero = numeros[i];
            }
        }
        
        System.out.println("\nO maior número digitado foi: " + maiorNumero);

        input.close(); // Fecha o objeto Scanner

    }
}