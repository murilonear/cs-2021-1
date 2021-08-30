package br.inf.ufg.construcaosw.tarefa013.exercicio05e06;

/**
 * The type Funcionario superior.
 */
public class FuncionarioSuperior extends FuncionarioMedio {
    private String universidade;

    /**
     * Instantiates a new Funcionario superior.
     *
     * @param nome         the nome
     * @param codigo       the codigo
     * @param comissao     the comissao
     * @param escolaBasico the escola basico
     * @param escolaMedio  the escola medio
     * @param universidade the universidade
     */
    public FuncionarioSuperior(String nome, int codigo,int comissao, String escolaBasico, String escolaMedio, String universidade) {
        super(nome, codigo,comissao, escolaBasico, escolaMedio);
        this.universidade = universidade;
    }

    /**
     * Gets universidade.
     *
     * @return the universidade
     */
    public String getUniversidade() {
        return universidade;
    }

    /**
     * Sets universidade.
     *
     * @param universidade the universidade
     */
    public void setUniversidade(String universidade) {
        this.universidade = universidade;
    }
    @Override
    public float getRenda() {
        return (float) (super.getRenda()*2);
    }
}
