package org.construcao.tarefa009.exercicio1;

import java.util.Scanner;
/**Classe Idade, que contém o método main para o cálculo da idade em dias
 * @author Murilo Eduardo */
public class Idade {
    /**Método main que implementa o cálculo da idade*/
    public static void main(String[] args) {
        int anos;
        int meses;
        int dias;
        int resultado;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Favor informar a quantidade de anos");
        anos = scanner.nextInt();
        System.out.println("Favor informar a quantidade de meses");
        meses = scanner.nextInt();
        System.out.println("Favor informar a quantidade de dias");
        dias = scanner.nextInt();
        resultado = (anos * 365) + (meses * 30) + dias;
        System.out.println("Sua idade é de " + resultado + " dias");
    }
}
