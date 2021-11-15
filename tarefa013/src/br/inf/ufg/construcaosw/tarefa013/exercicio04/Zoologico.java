package br.inf.ufg.construcaosw.tarefa013.exercicio04;

import br.inf.ufg.construcaosw.tarefa013.exercicio01.Animal;
import br.inf.ufg.construcaosw.tarefa013.exercicio01.Cachorro;
import br.inf.ufg.construcaosw.tarefa013.exercicio01.Cavalo;
import br.inf.ufg.construcaosw.tarefa013.exercicio01.Preguica;

import java.util.ArrayList;

/**
 * The type Zoologico.
 */
public class Zoologico {
    private static ArrayList<Animal> jaulas = new ArrayList<Animal>();

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Bob",10,"Au Au");
        jaulas.add(cachorro);
        Cavalo cavalo = new Cavalo("Flash",6,"Hiin in in");
        jaulas.add(cavalo);
        Preguica preguica = new Preguica("Preguicite",8,"Som Preguica");
        jaulas.add(preguica);
        Cachorro cachorro1 = new Cachorro("Zap",9,"Au Au");
        jaulas.add(cachorro1);
        Cavalo cavalo1 = new Cavalo("Veloz",1,"Hiin in in");
        jaulas.add(cavalo1);
        Preguica preguica1 = new Preguica("Soninho",2,"Som Preguica");
        jaulas.add(preguica1);
        Cachorro cachorro2 = new Cachorro("Casti",7,"Au Au");
        jaulas.add(cachorro2);
        Cavalo cavalo2 = new Cavalo("Alazão",4,"Hiin in in");
        jaulas.add(cavalo2);
        Preguica preguica2 = new Preguica("Flecha",5,"Som Preguica");
        jaulas.add(preguica2);
        Cachorro cachorro3 = new Cachorro("Marlo", 6,"Au Au");
        jaulas.add(cachorro3);
        for (int i = 0; i < jaulas.size();i++){
            System.out.println("Estou na jaula "+(i+1));
            System.out.println("Meu nome é: "+jaulas.get(i).getNome());
            String som = jaulas.get(i).getSom();
            jaulas.get(i).emitirSom(som);
            try{
                jaulas.get(i).iniciarCorrida();
            }catch(Exception e){
                System.out.println("Não consigo correr..");
            }
            System.out.println();
        }
    }






























  /*  public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Bob",10,"Au Au");
        jaulas.add(cachorro);
        Cavalo cavalo = new Cavalo("Flash",6,"Hiin in in");
        jaulas.add(cavalo);
        Preguica preguica = new Preguica("Preguicite",8,"Som Preguica");
        jaulas.add(preguica);
        Cachorro cachorro1 = new Cachorro("Zap",9,"Au Au");
        jaulas.add(cachorro1);
        Cavalo cavalo1 = new Cavalo("Veloz",1,"Hiin in in");
        jaulas.add(cavalo1);
        Preguica preguica1 = new Preguica("Soninho",2,"Som Preguica");
        jaulas.add(preguica1);
        Cachorro cachorro2 = new Cachorro("Casti",7,"Au Au");
        jaulas.add(cachorro2);
        Cavalo cavalo2 = new Cavalo("Alazão",4,"Hiin in in");
        jaulas.add(cavalo2);
        Preguica preguica2 = new Preguica("Flecha",5,"Som Preguica");
        jaulas.add(preguica2);
        Cachorro cachorro3 = new Cachorro("Marlo", 6,"Au Au");
        jaulas.add(cachorro3);
        for (int i = 0; i < jaulas.size();i++){
            System.out.println("Estou na jaula "+(i+1));
            System.out.println("Meu nome é: "+jaulas.get(i).getNome());
            String som = jaulas.get(i).getSom();
            jaulas.get(i).emitirSom(som);
            try{

            }catch(Exception e){
                System.out.println("Não consigo correr..");
            }
            System.out.println();
        }



    }*/

}
