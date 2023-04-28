/* Crie um programa que armazene um vetor com as notas de dez alunos,
calcule e imprima a média dessas notas e depois informe a quantidade
de notas acima e abaixo da média calculada. */

import java.util.Scanner;

public class CTExercicio3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Cria um vetor (array) para a as notas de 10 alunos
        double[] notas = new double[10];

        // Pede para digitar as notas doas 10 alunos e as armazena no array
        for (int i = 0; i < notas.length; i++) {
            System.out.print("Digite a " + (i+1) + "ª nota: ");
            notas[i] = input.nextInt();
        }

        // Imprime todas as notas armazenadas no array
        System.out.println("As notas foram:");
        for (int i = 0; i < notas.length; i++) {
            System.out.print(notas[i] + " ");
        }
        
        // Calcula a media das notas no array       
        double somaDasNotas = 0;
        double media = 0;        
        for (int i = 0; i < notas.length; i++) {            
            somaDasNotas = somaDasNotas + notas[i];
        }
        
        media = somaDasNotas/(notas.length);
        System.out.println("\nA média foi: " + media);
        
        // Verifica quais notas estão acima ou abaixo da media
        int acima = 0;
        int abaixo = 0;
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] < media) {
                abaixo++;
            } else if (notas[i] > media) {
                acima++;
            }
        }
        
        System.out.println("Existem " + abaixo + " nota(s) abaixo da média.");
        System.out.println("Existem " + acima + " nota(s) acima da média.");

        input.close(); // Fecha o objeto Scanner
    }
}