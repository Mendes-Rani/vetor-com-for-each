/**Programa simples para representar um vetor de números inteiros e preencher todos os elementos do vetor com o valor zero utilizando o método "Arrays.fill()". O programa percorre o vetor preenchido e imprime cada valor na tela, separados por um espaço.
 *
 */
package vetorforeach;

import java.util.Arrays;

public class PrenchendoVetor {
    public static void main(String[] args) {
        int v[] = new int[20];
        Arrays.fill(v, 0);
        for(int valor: v){
            System.out.print(valor + " ");
        }

    }
}
