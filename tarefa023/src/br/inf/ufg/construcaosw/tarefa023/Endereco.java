package br.inf.ufg.construcaosw.tarefa023;

public class Endereco {
    private int numero;
    private String complementoNumero;
    private String complementoEndereço;
    private Integer CEP;
    private TipoEndereco tipoEndereco;
    private Logradouro logradouro;
    private TipoLogradouro tipoLogradouro;

    public Endereco(int numero, String complementoNumero, String complementoEndereço, Integer CEP, TipoEndereco tipoEndereco, Logradouro logradouro, TipoLogradouro tipoLogradouro) {
        this.numero = numero;
        this.complementoNumero = complementoNumero;
        this.complementoEndereço = complementoEndereço;
        this.CEP = CEP;
        this.tipoEndereco = tipoEndereco;
        this.logradouro = logradouro;
        this.tipoLogradouro = tipoLogradouro;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getComplementoNumero() {
        return complementoNumero;
    }

    public void setComplementoNumero(String complementoNumero) {
        this.complementoNumero = complementoNumero;
    }

    public String getComplementoEndereço() {
        return complementoEndereço;
    }

    public void setComplementoEndereço(String complementoEndereço) {
        this.complementoEndereço = complementoEndereço;
    }

    public Integer getCEP() {
        return CEP;
    }

    public void setCEP(Integer CEP) {
        this.CEP = CEP;
    }

    public TipoEndereco getTipoEndereco() {
        return tipoEndereco;
    }

    public void setTipoEndereco(TipoEndereco tipoEndereco) {
        this.tipoEndereco = tipoEndereco;
    }

    public Logradouro getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(Logradouro logradouro) {
        this.logradouro = logradouro;
    }

    public TipoLogradouro getTipoLogradouro() {
        return tipoLogradouro;
    }

    public void setTipoLogradouro(TipoLogradouro tipoLogradouro) {
        this.tipoLogradouro = tipoLogradouro;
    }
}
