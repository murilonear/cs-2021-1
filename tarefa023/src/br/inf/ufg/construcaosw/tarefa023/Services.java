package br.inf.ufg.construcaosw.tarefa023;

import java.util.ArrayList;
import java.util.List;

public class Services implements EnderecoService {

    List<CadastroEndereco> cadastroEnderecos;

    public Services(List<CadastroEndereco> cadastroEnderecos) {
        this.cadastroEnderecos = cadastroEnderecos;
    }


    public List<Logradouro> consultaPorTipo(TipoLogradouro tipoLogradouro) {
        Logradouro logradouro;
        List<Logradouro> listaTipoLogradouros = new ArrayList<Logradouro>();
        for (int i = 0; i < cadastroEnderecos.size(); i++) {
            logradouro = cadastroEnderecos.get(i).getEndereco().getLogradouro();
            if (logradouro.getTipoLogradouro() == tipoLogradouro) {
                listaTipoLogradouros.add(logradouro);
            }
        }
        return listaTipoLogradouros;
    }

    public List<Endereco> consultaPorTipo(TipoEndereco tipoEndereco) {
        Endereco endereco;
        List<Endereco> listaEnderecos = new ArrayList<Endereco>();
        for (int i = 0; i < cadastroEnderecos.size(); i++) {
            endereco = cadastroEnderecos.get(i).getEndereco();
            if (endereco.getTipoEndereco() == tipoEndereco) {
                listaEnderecos.add(endereco);
            }
        }
        return listaEnderecos;
    }

    public List<Endereco> consultaPorCep(int cep) {
        Endereco endereco;
        List<Endereco> listaCEP = new ArrayList<Endereco>();
        for (int i = 0; i < cadastroEnderecos.size(); i++) {
            endereco = cadastroEnderecos.get(i).getEndereco();
            if (endereco.getCEP() == cep) {
                listaCEP.add(endereco);
            }
        }
        return listaCEP;
    }

    public List<Endereco> consultaPorLogradouro(Logradouro logradouro) {
        Endereco endereco;
        List<Endereco> listaLogradouro = new ArrayList<Endereco>();
        for (int i = 0; i < cadastroEnderecos.size(); i++) {
            endereco = cadastroEnderecos.get(i).getEndereco();
            if (endereco.getLogradouro() == logradouro) {
                listaLogradouro.add(endereco);
            }
        }
        return listaLogradouro;
    }

    public List<Endereco> consultaPorBairro(Bairro bairro) {
        Endereco endereco;
        List<Endereco> listaLogradouro = new ArrayList<Endereco>();
        for (int i = 0; i < cadastroEnderecos.size(); i++) {
            endereco = cadastroEnderecos.get(i).getEndereco();
            if (endereco.getLogradouro().getBairro() == bairro) {
                listaLogradouro.add(endereco);
            }
        }
        return listaLogradouro;
    }

    public List<Endereco> consultaPorCidade(Cidade cidade) {
        Endereco endereco;
        Cidade city;
        List<Endereco> listaCidade = new ArrayList<Endereco>();
        for (int i = 0; i < cadastroEnderecos.size(); i++) {
            endereco = cadastroEnderecos.get(i).getEndereco();
            city = endereco.getLogradouro().getBairro().getCidade();
            if (city == cidade) {
                listaCidade.add(endereco);
            }
        }
        return listaCidade;
    }

    public List<Cidade> listaCidadesPorEstado(Estado estado) {
        Endereco endereco;
        Cidade city;
        List<Cidade> listaCidades = new ArrayList<Cidade>();
        for (int i = 0; i < cadastroEnderecos.size(); i++) {
            endereco = cadastroEnderecos.get(i).getEndereco();
            city = endereco.getLogradouro().getBairro().getCidade();
            if (city.getEstado() == estado) {
                listaCidades.add(city);
            }
        }
        return listaCidades;
    }

    public List<Estado> consultaPorPais(Pais pais) {
        Endereco endereco;
        Cidade city;
        Estado estado;
        List<Estado> listaPaises = new ArrayList<Estado>();
        for (int i = 0; i < cadastroEnderecos.size(); i++) {
            endereco = cadastroEnderecos.get(i).getEndereco();
            city = endereco.getLogradouro().getBairro().getCidade();
            estado = city.getEstado();
            if (estado.getPais() == pais) {
                listaPaises.add(estado);
            }
        }
        return listaPaises;
    }
}
