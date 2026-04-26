/**Programa simples para representar um vetor de números inteiros e buscar um valor específico utilizando o método "Arrays.binarySearch()". O programa exibe os valores do vetor e, em seguida, utiliza o método para encontrar a posição do valor desejado. O resultado é exibido na tela indicando a posição do valor encontrado ou informando que o valor não foi encontrado.
 *
 */
package vetorforeach;

import java.util.Arrays;

public class VetorBuscaValor {
    public static void main(String[] args) {
        int vet[] = {3, 7, 6, 1, 9, 4, 2};
        for(int v:vet){
            System.out.print(v + " ");
        }
        System.out.println("");
        int p = Arrays.binarySearch(vet, 1);
        System.out.println("Encontrei o valor na posição " + p);
    }
}
