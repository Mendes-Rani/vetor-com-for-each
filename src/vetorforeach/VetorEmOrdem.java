/**Programa simples para representar um vetor de números inteiros e exibir seus valores em ordem crescente utilizando o método "Arrays.sort()". O programa ordena o vetor e, em seguida, percorre os valores ordenados utilizando um loop "for-each" para imprimir cada valor na tela, um por linha.
 *
 */
package vetorforeach;

import java.util.Arrays;

public class VetorEmOrdem {
    public static void main(String[] args) {
        int num[] = {3, 5, 1, 8, 4};

        Arrays.sort(num); //Ordena o vetor em ordem crescente

        for(int valor: num){
            System.out.println(valor);
        }
    }
}
