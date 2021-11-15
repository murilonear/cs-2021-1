package br.inf.ufg.construcaosw.tarefa013.exercicio03;

import br.inf.ufg.construcaosw.tarefa013.exercicio01.Animal;
import br.inf.ufg.construcaosw.tarefa013.exercicio01.Cachorro;
import br.inf.ufg.construcaosw.tarefa013.exercicio01.Cavalo;
import br.inf.ufg.construcaosw.tarefa013.exercicio01.Preguica;

/**
 * The type Veterinario.
 */
public class Veterinario {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Bob",10,"Au au");
        Cavalo cavalo = new Cavalo("Flash",6,"Hiin in in");
        Preguica preguica = new Preguica("Preguicite",8,"Som preguica");

        examinar(cachorro, cachorro.getSom());
        examinar(cavalo,cavalo.getSom());
        examinar(preguica, preguica.getSom());
    }

    /**
     * Examinar.
     *
     * @param animal the animal
     * @param som    the som
     */
    public static void examinar(Animal animal, String som){
        System.out.println("O nome do animal sendo examinado é "+animal.getNome());
        System.out.println(animal.getNome()+" tem "+animal.getIdade()+" de idade");
        animal.emitirSom(som);
    }
}
