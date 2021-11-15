package br.inf.ufg.construcaosw.tarefa013.exercicio01;

import br.inf.ufg.construcaosw.tarefa013.exercicio01.Animal;

/**
 * The type Cavalo.
 */
public class Cavalo extends Animal {

    /**
     * Instantiates a new Cavalo.
     *
     * @param nome  the nome
     * @param idade the idade
     * @param som   the som
     */
    public Cavalo(String nome, float idade, String som) {
        super(nome, idade, som);
    }

    @Override
    public void iniciarCorrida() {
        System.out.println("Sou um cavalo e comecei a correr");
    }
}
