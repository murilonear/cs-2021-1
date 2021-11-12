package tarefa016.br.inf.ufg.construcaosw.tarefa016.Agenda;

/**
 * The type Contato.
 */
public class Contato {
    private String nome;
    private Integer telefone;
    private String email;

    /**
     * Instantiates a new Contato.
     *
     * @param nome     the nome
     * @param telefone the telefone
     * @param email    the email
     */
    public Contato(String nome, Integer telefone, String email) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
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
     * Gets telefone.
     *
     * @return the telefone
     */
    public Integer getTelefone() {
        return telefone;
    }

    /**
     * Sets telefone.
     *
     * @param telefone the telefone
     */
    public void setTelefone(Integer telefone) {
        this.telefone = telefone;
    }

    /**
     * Gets email.
     *
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets email.
     *
     * @param email the email
     */
    public void setEmail(String email) {
        this.email = email;
    }
}
