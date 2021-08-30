package br.inf.ufg.construcaosw.tarefa013.exercicio05e06;

import br.inf.ufg.construcaosw.tarefa013.exercicio08.Comissao;

/**
 * The type Funcionario.
 */
public class Funcionario {
    private String nome;
    private int codigo;
    private float renda = 1000;
    private int comissao;

    /**
     * Gets comissao.
     *
     * @return the comissao
     */
    public int getComissao() {
        return comissao;
    }

    /**
     * Sets comissao.
     *
     * @param comissao the comissao
     */
    public void setComissao(int comissao) {
        this.comissao = comissao;
    }

    /**
     * Valor comissao int.
     *
     * @param comissao the comissao
     * @return the int
     */
    public int valorComissao(int comissao) {
        return Comissao.consultarValor(comissao);
    }

    /**
     * Instantiates a new Funcionario.
     *
     * @param nome     the nome
     * @param codigo   the codigo
     * @param comissao the comissao
     */
    public Funcionario(String nome, int codigo, int comissao) {
        this.nome = nome;
        this.codigo = codigo;
        this.comissao = comissao;
    }

    /**
     * Gets renda.
     *
     * @return the renda
     */
    public float getRenda() {
        return renda;
    }

    /**
     * Sets renda.
     *
     * @param renda the renda
     */
    public void setRenda(float renda) {
        this.renda = renda;
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
     * Gets codigo.
     *
     * @return the codigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * Sets codigo.
     *
     * @param codigo the codigo
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Nome Funcionário: " + this.getNome() + ", Comissão: R$" +
                this.valorComissao(this.getComissao()) + ", Salário total: R$" +(
                this.getRenda() + this.valorComissao(this.getComissao()));
    }
}
