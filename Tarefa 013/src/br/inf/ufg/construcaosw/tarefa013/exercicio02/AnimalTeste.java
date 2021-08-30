package br.inf.ufg.construcaosw.tarefa013.exercicio02;

import br.inf.ufg.construcaosw.tarefa013.exercicio01.Cachorro;
import br.inf.ufg.construcaosw.tarefa013.exercicio01.Cavalo;
import br.inf.ufg.construcaosw.tarefa013.exercicio01.Preguica;

/**
 * Autor: Murilo Eduardo Alves Vaz
 * Atividade: Tarefa013
 */
public class AnimalTeste {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Bob",10,"Au au");
        Cavalo cavalo = new Cavalo("Flash",6,"Hiin in in");
        Preguica preguica = new Preguica("Preguicite",8,"Som preguica");

        cachorro.emitirSom(cachorro.getSom());
        cavalo.emitirSom(cavalo.getSom());
        preguica.emitirSom(preguica.getSom());
    }
}
