package tarefa016.br.inf.ufg.construcaosw.tarefa016.Agenda;

/**
 * The type Agenda teste.
 */
public class AgendaTeste {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        // Criando Agenda
        Agenda agenda = new Agenda();
        // Criando pessoas
        Contato amanda = new Contato("Amanda", 99887454, "amanda@gmail.com");
        Contato murilo = new Contato("Murilo", 98727728, "murilo@gmail.com");
        Contato alfredo = new Contato("Alfredo", 982823783, "Alfredo@gmail.com");
        // Cadastrando contatos na agenda
        agenda.novoContato(amanda);
        agenda.novoContato(murilo);
        agenda.novoContato(alfredo);
        // Listar agenda após colocar contatos
        System.out.println("Agenda apos cadastro de contatos");
        agenda.listarContatos();
        //Pesquisando contato não existente agenda
        try {
            agenda.pesquisarContato("Jorge");
        } catch (ContatoNaoEncontratoException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        // Removendo contatos da agenda
        finally {
            try {
                agenda.removerContato("Murilo");
            } catch (ContatoNaoEncontratoException e) {
                System.out.println(e.getMessage());
                e.printStackTrace();
            }
            try {
                agenda.removerContato("Amanda");
            } catch (ContatoNaoEncontratoException e) {
                System.out.println(e.getMessage());
                e.printStackTrace();
            }
            try {
                agenda.removerContato("Alfredo");
            } catch (ContatoNaoEncontratoException e) {
                System.out.println(e.getMessage());
                e.printStackTrace();
            }
        }
        // Listar agenda após remover contatos
        System.out.println("Agenda apos remover os contatos");
        agenda.listarContatos();

    }
}
