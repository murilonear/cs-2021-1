package br.inf.ufg.construcaosw.tarefa013.exercicio01;

import br.inf.ufg.construcaosw.tarefa013.exercicio01.Animal;

/**
 * The type Preguica.
 */
public class Preguica extends Animal {

    /**
     * Instantiates a new Preguica.
     *
     * @param nome  the nome
     * @param idade the idade
     * @param som   the som
     */
    public Preguica(String nome, float idade, String som) {
        super(nome, idade, som);
    }

    @Override
    public void iniciarSubida() {
        System.out.println("Sou uma preguica e comecei subir na árvore");
    }
}
