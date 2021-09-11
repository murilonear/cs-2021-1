package tarefa016.br.inf.ufg.br.tarefa016.Agenda;

import java.util.ArrayList;
import java.util.List;

/**
 * The type Agenda.
 */
public class Agenda {
    private List<Contato> contatos = new ArrayList<Contato>();

    /**
     * Novo contato boolean.
     *
     * @param contato the contato
     * @return the boolean
     */
    public boolean novoContato(Contato contato) {
        if (contato.getNome() == null)
            return false;
        else if (contato.getTelefone() == null)
            return false;
        else if (contato.getEmail() == null)
            return false;
        else {
            contatos.add(contato);
            return true;
        }
    }

    /**
     * Remover contato boolean.
     *
     * @param nome the nome
     * @return the boolean
     * @throws ContatoNaoEncontratoException the contato nao encontrato exception
     */
    public boolean removerContato(String nome) throws ContatoNaoEncontratoException {
        int id = pesquisarContato(nome);
        if (id >= 0) {
            contatos.remove(contatos.get(id));
            return true;
        }
        return false;
    }

    /**
     * Listar contatos.
     */
    public void listarContatos() {
        int listar = 0;
        System.out.println();
        System.out.println("Início da Agenda");
        System.out.println("---------------------------------------------");
        for (Contato lista : contatos) {
            System.out.println("Contato nº " + (listar + 1));
            System.out.println("Nome: " + contatos.get(listar).getNome());
            System.out.println("Telefone: " + contatos.get(listar).getTelefone());
            System.out.println("E-mail: " + contatos.get(listar).getEmail());
            System.out.println();
            listar++;
        }
        System.out.println("---------------------------------------------");
        System.out.println("Fim da agenda");
        System.out.println();
    }

    /**
     * Pesquisar contato int.
     *
     * @param nome the nome
     * @return the int
     * @throws ContatoNaoEncontratoException the contato nao encontrato exception
     */
    public int pesquisarContato(String nome) throws ContatoNaoEncontratoException {
        int controle = 0;
        for (Contato atual : contatos) {
            if (contatos.get(controle).getNome() == nome) {
                return controle;
            }
            controle++;
        }
        throw new ContatoNaoEncontratoException("Contato não encontrado!");
    }
}
