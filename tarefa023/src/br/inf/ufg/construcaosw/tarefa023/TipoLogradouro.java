package br.inf.ufg.construcaosw.tarefa023;

public enum TipoLogradouro {
    RUA("Rua"), AVENIDA("Avenida"), ALAMEDA("Alameda"), MARGINAL("Marginal"), VIA("Via")
    , VIELA("Viela"), TRAVESSA("Travessa");

    private String TipoLogradouro;

    TipoLogradouro(String TipoLogradouro) {
        this.TipoLogradouro = TipoLogradouro;
    }

    public String getTipoLogradouro() {
        return TipoLogradouro;
    }
}
