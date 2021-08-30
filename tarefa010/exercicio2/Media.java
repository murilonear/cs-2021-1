package org.construcao.tarefa009.exercicio2;

/**Classe Media, que contém o método main para o cálculo das médias do exercício
 * @author Murilo Eduardo */
public class Media {
    /**Método main que implementa o cálculo das médias do exercício*/
    public static void main(String[] args) {
        int valorA;
        int valorB;
        int soma;
        int media;
        valorA = (8 + 9 + 7)/3;
        valorB = (4 + 5 + 6)/3;
        soma = valorA + valorB;
        media = valorA + valorB/2;
        System.out.println("A média aritmética dos números 8, 9 e 7 é: "+valorA);
        System.out.println("A média dos números 4,5 e 6 é: "+valorB);
        System.out.println("A soma das duas médias é de: "+soma);
        System.out.println("A média das médias é de: "+media);
    }
}
