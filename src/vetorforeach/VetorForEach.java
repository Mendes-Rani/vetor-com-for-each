/**Programa simples para representar um vetor de números decimais e exibir seus valores utilizando o loop "for-each". O programa percorre o vetor e imprime cada valor na tela, separados por um espaço.
 *
 */
package vetorforeach;

public class VetorForEach {
    public static void main(String[] args) {
        double v[] = {3.5, 2.75, 9, -4.5};
        for(double valor: v){
            System.out.print(valor + " ");
        }
    }
}
