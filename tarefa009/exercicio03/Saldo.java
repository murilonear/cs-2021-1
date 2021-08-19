package exercicio03;

import java.util.Scanner;

public class Saldo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o valor do saldo:");
        float valor = scanner.nextFloat();
        System.out.println("O novo saldo com o reajuste de 15% é: R$"+(valor*1.15));
    }
}
