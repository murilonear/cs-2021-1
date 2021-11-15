package br.inf.ufg.construcaosw.tarefa013.exercicio01;

import br.inf.ufg.construcaosw.tarefa013.exercicio01.Animal;

/**
 * The type Cachorro.
 */
public class Cachorro extends Animal {

    /**
     * Instantiates a new Cachorro.
     *
     * @param nome  the nome
     * @param idade the idade
     * @param som   the som
     */
    public Cachorro(String nome, float idade, String som) {
        super(nome, idade, som);
    }

    @Override
    public void iniciarCorrida() {
        System.out.println("Sou um cachorro e comecei a correr");
    }
}
