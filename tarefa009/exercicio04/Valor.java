package org.construcao.tarefa009.exercicio4;

import java.util.Scanner;

public class Valor {
    public static void main(String[] args) {
        int codigo01;
        int codigo02;
        int quantidade01;
        int quantidade02;
        float valor01;
        float valor02;
        float ipi;
        float resultado;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe a porcentagem do IPI a ser acrescido no valor das peças");
        ipi = scanner.nextFloat();
        System.out.println("Informe o código da peça 01");
        codigo01 = scanner.nextInt();
        System.out.println("Informe o valor da peça 01");
        valor01 = scanner.nextFloat();
        System.out.println("Informa a quantidade da peça 01");
        quantidade01 = scanner.nextInt();
        System.out.println("Informe o código da peça 02");
        codigo02 = scanner.nextInt();
        System.out.println("Informe o valor da peça 02");
        valor02 = scanner.nextFloat();
        System.out.println("Informe a quantidade da peça 02");
        quantidade02 = scanner.nextInt();
        resultado = ((valor01 * quantidade01) + (valor02 * quantidade02)) * (ipi / 100 + 1);
        System.out.println(quantidade01+" Peças do código "+codigo01);
        System.out.println(quantidade02+" Peças do código "+codigo02);
        System.out.println("O valor total a ser pago é de: R$" + resultado);
    }
}
