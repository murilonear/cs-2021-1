package br.inf.ufg.construcaosw.tarefa013.exercicio08;

/**
 * The type Comissao.
 */
public class Comissao {
    /**
     * Consultar valor int.
     *
     * @param cargo the cargo
     * @return the int
     */
    public static int consultarValor(int cargo) {
        switch (cargo) {
            case 1:
                return 1500;
            case 2:
                return 600;
            case 3:
                return 250;
            default:
                throw new IllegalArgumentException("Valor inválido");
        }
    }
}
