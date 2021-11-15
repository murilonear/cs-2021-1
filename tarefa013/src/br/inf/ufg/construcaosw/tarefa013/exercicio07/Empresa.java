package br.inf.ufg.construcaosw.tarefa013.exercicio07;

import br.inf.ufg.construcaosw.tarefa013.exercicio05e06.Funcionario;
import br.inf.ufg.construcaosw.tarefa013.exercicio05e06.FuncionarioBasico;
import br.inf.ufg.construcaosw.tarefa013.exercicio05e06.FuncionarioMedio;
import br.inf.ufg.construcaosw.tarefa013.exercicio05e06.FuncionarioSuperior;

/**
 * The type Empresa.
 */
public class Empresa {
    /**
     * The Funcionarios.
     */
    static Funcionario[] funcionarios = new Funcionario[10];

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        float salarioTotal = 0;
        float salarioBasico = 0;
        float salarioMedio = 0;
        float salarioSuperior = 0;
        int cargo = 0;
        int contador = 0;
        for (int i = 0; i < 10; i++) {
            if (contador >= 0 && contador < 7)
                cargo = 3;
            else if (contador >= 7 && contador < 9)
                cargo = 2;
            else cargo = 1;
            if (i < 4) {
                FuncionarioBasico basico = new FuncionarioBasico(("Basicao" + i), i, cargo, "Basicao");
                funcionarios[i] = basico;
            } else if (i >= 4 && i < 8) {
                FuncionarioMedio medio = new FuncionarioMedio(("Mediozao" + i), i, cargo, "Basicao", "Mediozao");
                funcionarios[i] = medio;
            } else {
                FuncionarioSuperior superior = new FuncionarioSuperior(("Superiorzao" + i), i, cargo, "Basicao",
                        "Mediozao", "Superiorzao");
                funcionarios[i] = superior;
            }
            contador++;
        }
        for (int i = 0; i < funcionarios.length; i++) {
            try {
                if (i < 4) {
                    salarioBasico += funcionarios[i].getRenda() + funcionarios[i].
                            valorComissao(funcionarios[i].getComissao());
                } else if (i >= 4 && i < 8)
                    salarioMedio += funcionarios[i].getRenda() + funcionarios[i].
                            valorComissao(funcionarios[i].getComissao());
                else
                    salarioSuperior += funcionarios[i].getRenda() + funcionarios[i].
                            valorComissao(funcionarios[i].getComissao());
                salarioTotal += funcionarios[i].getRenda() + funcionarios[i].
                        valorComissao(funcionarios[i].getComissao());
            } catch (Exception e) {
                System.out.println("Deu ruim");

            }
            System.out.println(funcionarios[i].toString());
        }
        System.out.println("Salario total basico: R$" + salarioBasico);
        System.out.println("Salario total medio: R$" + salarioMedio);
        System.out.println("Salario total superior: R$" + salarioSuperior);
        System.out.println("Salario total empresa: R$" + salarioTotal);

    }
}
