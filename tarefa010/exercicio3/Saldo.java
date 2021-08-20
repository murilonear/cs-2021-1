package org.construcao.tarefa009.exercicio3;

import java.util.Scanner;
/**Classe Saldo, que contém o método main para o do reajuste de 15% em cima do saldo
 * @author Murilo Eduardo */
public class Saldo {
    /**Método main que implementa o reajuste de 15% em cima do saldo*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o valor do saldo:");
        float valor = scanner.nextFloat();
        System.out.println("O novo saldo com o reajuste de 15% é: R$"+(valor*1.15));
    }
}
