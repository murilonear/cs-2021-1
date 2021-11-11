package br.inf.ufg.construcaosw.tarefa023;

public enum TipoEndereco {
    COMERCIAL("Comercial"), RESIDENCIAL("Residencial");

    private String tipoEndereco;

    TipoEndereco(String tipoEndereco) {
        this.tipoEndereco = tipoEndereco;
    }

    public String getTipoEndereco() {
        return tipoEndereco;
    }
}
