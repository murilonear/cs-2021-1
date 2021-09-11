package tarefa016.br.inf.ufg.br.tarefa016.Divisao;

import java.util.Scanner;

/**
 * The type Divisao.
 */
public class Divisao {

    private static Scanner sc = new Scanner(System.in);

    /**
     * Divide int.
     *
     * @param dividendo the dividendo
     * @param divisor   the divisor
     * @return the int
     * @throws ArithmeticException the arithmetic exception
     */
    public static int divide(int dividendo, int divisor) throws ArithmeticException {
        if (divisor == 0)
            throw new ArithmeticException("O divisor não pode ser zero");
        else
            return dividendo / divisor;
    }

    /**
     * Main.
     *
     * @param args the args
     */
    public static void main(String args[]) {

        System.out.println("Informe o valor do dividendo: ");
        int dividendo = sc.nextInt();
        System.out.println("Informe o valor do divisor: ");
        int divisor = sc.nextInt();
        try {

            System.out.println("O resultado da divisão é: "+(divide(dividendo, divisor)));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

    }

}