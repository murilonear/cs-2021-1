package exercicio05;

import java.util.Scanner;

public class Salario {
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
