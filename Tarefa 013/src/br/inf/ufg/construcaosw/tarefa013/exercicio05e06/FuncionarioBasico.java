package br.inf.ufg.construcaosw.tarefa013.exercicio05e06;

/**
 * The type Funcionario basico.
 */
public class FuncionarioBasico extends Funcionario {
    private String escolaBasico;

    /**
     * Instantiates a new Funcionario basico.
     *
     * @param nome         the nome
     * @param codigo       the codigo
     * @param comissao     the comissao
     * @param escolaBasico the escola basico
     */
    public FuncionarioBasico(String nome, int codigo, int comissao,String escolaBasico) {
        super(nome, codigo,comissao);
        this.escolaBasico = escolaBasico;
    }

    /**
     * Gets escola basico.
     *
     * @return the escola basico
     */
    public String getEscolaBasico() {
        return escolaBasico;
    }

    @Override
    public float getRenda() {
        return (float) (super.getRenda()*1.1);
    }

    /**
     * Sets escola basico.
     *
     * @param escolaBasico the escola basico
     */
    public void setEscolaBasico(String escolaBasico) {
        this.escolaBasico = escolaBasico;
    }

}
