package br.inf.ufg.construcaosw.tarefa013.exercicio01;

/**
 * The type Animal.
 */
public class Animal {
    private String nome;
    private float idade;

    /**
     * Gets som.
     *
     * @return the som
     */
    public String getSom() {
        return som;
    }

    /**
     * Sets som.
     *
     * @param som the som
     */
    public void setSom(String som) {
        this.som = som;
    }

    private String som;

    /**
     * Instantiates a new Animal.
     *
     * @param nome  the nome
     * @param idade the idade
     * @param som   the som
     */
    public Animal(String nome, float idade, String som) {
        this.nome = nome;
        this.idade = idade;
        this.som = som;
    }

    /**
     * Gets idade.
     *
     * @return the idade
     */
    public float getIdade() {
        return idade;
    }

    /**
     * Sets idade.
     *
     * @param idade the idade
     */
    public void setIdade(float idade) {
        this.idade = idade;
    }

    /**
     * Gets nome.
     *
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * Sets nome.
     *
     * @param nome the nome
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Emitir som.
     *
     * @param som the som
     */
    public void emitirSom(String som) {
        System.out.println("Estou emitindo o som: " + som);
    }

    /**
     * Iniciar corrida.
     */
    public void iniciarCorrida() {
    }

    /**
     * Iniciar subida.
     */
    public void iniciarSubida(){
    }

}

