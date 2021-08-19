package exercicio06;

import java.util.Scanner;

public class Vizinhos {
    public static void main(String[] args) {
        int numero;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o número");
        numero = scanner.nextInt();
        System.out.println("Seu número antecessor é " + (numero - 1));
        System.out.println("Seu número sucessor é " + (numero + 1));
    }
}
