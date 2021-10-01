package br.inf.ufg.construcaodesoftware.tarefa019;

public class Usuario {
    private String Nome;
    private String CPF;
    private String Senha;

    private String imprimeCPF(String CPF) {
        return(CPF.substring(0, 3) + "." + CPF.substring(3, 6) + "." +
                CPF.substring(6, 9) + "-" + CPF.substring(9, 11));
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        if(Validacao.validaNome(nome))
        Nome = nome;
    }

    public String getCPF() {
        return imprimeCPF(CPF);
    }

    public void setCPF(String CPF) {
        if(Validacao.validaCpf(CPF))
        this.CPF = CPF;
    }

    public String getSenha() {
        return Senha;
    }

    public void setSenha(String senha) {
        if(Validacao.validaSenha(senha))
            Senha = senha;
    }

    public static void main(String[] args) {
        Usuario teste = new Usuario();
        teste.setNome("Joao Maria Jose");
        System.out.println(teste.getNome());
        teste.setCPF("02824423080");
        System.out.println(teste.getCPF());
        teste.setSenha("aaZZa44@");
        System.out.println(teste.getSenha());

    }
}
