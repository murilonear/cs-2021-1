package org.construcao.tarefa009.exercicio5;

import java.util.Scanner;
/**Classe Salario, que contém o método main para o cálculo de quantos salários mínimos o usuário recebe
 * @author Murilo Eduardo */
public class Salario {
    /**Método main que implementa o cálculo de quantos salários mínimos o usuário recebe*/
    public static void main(String[] args) {
        float salarioMinimo;
        float remuneracao;
        int quantidade;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o salário mínimo");
        salarioMinimo = scanner.nextFloat();
        System.out.println("Informe a remuneração do usuário");
        remuneracao = scanner.nextFloat();
        quantidade = (int) (remuneracao / salarioMinimo);
        System.out.println("O usuário recebe de remuneração " + quantidade + " salários mínimos");
    }
}
