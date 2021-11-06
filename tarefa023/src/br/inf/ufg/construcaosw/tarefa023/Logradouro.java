package br.inf.ufg.construcaosw.tarefa023;

public class Logradouro {
    private String nome;
    private String tipo;
    private TipoLogradouro tipoLogradouro;
    private Bairro bairro;

    public Logradouro(){

    }

    public Logradouro(String nome, String tipo, TipoLogradouro tipoLogradouro, Bairro bairro) {
        this.nome = nome;
        this.tipo = tipo;
        this.tipoLogradouro = tipoLogradouro;
        this.bairro = bairro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public TipoLogradouro getTipoLogradouro() {
        return tipoLogradouro;
    }

    public void setTipoLogradouro(TipoLogradouro tipoLogradouro) {
        this.tipoLogradouro = tipoLogradouro;
    }

    public Bairro getBairro() {
        return bairro;
    }

    public void setBairro(Bairro bairro) {
        this.bairro = bairro;
    }
}
