package br.com.gilmar;

import org.junit.Assert;
import org.junit.Test;

public class AvaliacaoTest {

    //Testar valor inválido: Carga horária = 0
    @Test(expected = ValoresInvalidosException.class)
    public void testCenario1() throws ValoresInvalidosException {
        Avaliacao avaliacao = new Avaliacao();
        String resultado = avaliacao.avalia(7,8,4,0);
        Assert.assertTrue(resultado == "Valores Inválidos.");
    }

    //Testar valor inválido: Carga horária negativa
    @Test(expected = ValoresInvalidosException.class)
    public void testCenario2() throws ValoresInvalidosException {
        Avaliacao avaliacao = new Avaliacao();
        String resultado = avaliacao.avalia(7,8,4,-1);
        Assert.assertTrue(resultado == "Valores Inválidos.");
    }

    //Testar valor inválido: Teste faltas maior que carga horária
    @Test(expected = ValoresInvalidosException.class)
    public void testCenario3() throws ValoresInvalidosException {
        Avaliacao avaliacao = new Avaliacao();
        String resultado = avaliacao.avalia(7,8,5,4);
        Assert.assertTrue(resultado == "Valores Inválidos.");
    }

    //Testar valor inválido: Nota 1 negativa
    @Test(expected = ValoresInvalidosException.class)
    public void testCenario4() throws ValoresInvalidosException {
        Avaliacao avaliacao = new Avaliacao();
        String resultado = avaliacao.avalia(-1,8,10,64);
        Assert.assertTrue(resultado == "Valores Inválidos.");
    }

    //Testar valor inválido: Nota 2 negativa
    @Test(expected = ValoresInvalidosException.class)
    public void testCenario5() throws ValoresInvalidosException {
        Avaliacao avaliacao = new Avaliacao();
        String resultado = avaliacao.avalia(-1,8,10,64);
        Assert.assertTrue(resultado == "Valores Inválidos.");
    }

    //Testar valor inválido: Nota 1 maior que 10
    @Test(expected = ValoresInvalidosException.class)
    public void testCenario6() throws ValoresInvalidosException {
        Avaliacao avaliacao = new Avaliacao();
        String resultado = avaliacao.avalia(11,8,10,64);
        Assert.assertTrue(resultado == "Valores Inválidos.");
    }

    //Testar valor inválido: Nota 2 maior que 10
    @Test(expected = ValoresInvalidosException.class)
    public void testCenario7() throws ValoresInvalidosException {
        Avaliacao avaliacao = new Avaliacao();
        String resultado = avaliacao.avalia(9,11,10,64);
        Assert.assertTrue(resultado == "Valores Inválidos.");
    }

    //Testar valor válido: Quantidade de faltas superior a 25% da carga horária, o aluno está reprovado por faltas;
    @Test
    public void testCenario8() throws ValoresInvalidosException {
        Avaliacao avaliacao = new Avaliacao();
        String resultado = avaliacao.avalia(9,7,26,64);
        Assert.assertTrue(resultado == "Reprovado por Falta.");
    }

    //Testar valor válido: Média final menor que 3, o aluno está reprovado por média;
    @Test
    public void testCenario9() throws ValoresInvalidosException {
        Avaliacao avaliacao = new Avaliacao();
        String resultado = avaliacao.avalia(2.9,2.9,8,64);
        Assert.assertTrue(resultado == "Reprovado por Média.");
    }

    //Testar valor válido: Média entre 3 e 6, o aluno terá direito a uma prova extra;
    @Test
    public void testCenario10() throws ValoresInvalidosException {
        Avaliacao avaliacao = new Avaliacao();
        String resultado = avaliacao.avalia(3,3,4,32);
        Assert.assertTrue(resultado == "Prova Extra.");
    }

    //Testar valor válido: Média maior ou igual a 6, o aluno está aprovado.
    @Test
    public void testCenario11() throws ValoresInvalidosException {
        Avaliacao avaliacao = new Avaliacao();
        String resultado = avaliacao.avalia(6,6,6,32);
        Assert.assertTrue(resultado == "Aprovado.");
    }
}
