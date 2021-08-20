package org.construcao.tarefa009.exercicio6;

import java.util.Scanner;
/**Classe Vizinhos, que contém o método main apresentar os números antecessor e sucessor do número desejado
 * @author Murilo Eduardo */
public class Vizinhos {
    /**Método main que implementa a apresentação dos números antecessor e sucessor do número desejado*/
    public static void main(String[] args) {
        int numero;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o número");
        numero = scanner.nextInt();
        System.out.println("Seu número antecessor é " + (numero - 1));
        System.out.println("Seu número sucessor é " + (numero + 1));
    }
}
