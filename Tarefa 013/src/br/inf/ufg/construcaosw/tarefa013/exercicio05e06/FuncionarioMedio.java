package br.inf.ufg.construcaosw.tarefa013.exercicio05e06;

/**
 * The type Funcionario medio.
 */
public class FuncionarioMedio extends FuncionarioBasico {
    private String escolaMedio;

    /**
     * Instantiates a new Funcionario medio.
     *
     * @param nome         the nome
     * @param codigo       the codigo
     * @param comissao     the comissao
     * @param escolaBasico the escola basico
     * @param escolaMedio  the escola medio
     */
    public FuncionarioMedio(String nome, int codigo,int comissao, String escolaBasico, String escolaMedio) {
        super(nome, codigo,comissao, escolaBasico);
        this.escolaMedio = escolaMedio;
    }

    /**
     * Gets escola medio.
     *
     * @return the escola medio
     */
    public String getEscolaMedio() {
        return escolaMedio;
    }

    /**
     * Sets escola medio.
     *
     * @param escolaMedio the escola medio
     */
    public void setEscolaMedio(String escolaMedio) {
        this.escolaMedio = escolaMedio;
    }

    @Override
    public float getRenda() {
        return (float) (super.getRenda()*1.5);
    }
}
