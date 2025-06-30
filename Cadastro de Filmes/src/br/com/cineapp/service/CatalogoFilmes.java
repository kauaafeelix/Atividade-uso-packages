package br.com.cineapp.service;
import br.com.cineapp.model.Filme;
import br.com.cineapp.view.Operador;

import java.util.List;
import java.util.ArrayList;


public class CatalogoFilmes {

    List<Filme> listaFilmes;

    public CatalogoFilmes() {
        listaFilmes = new ArrayList<>();
    }

    public void gerenciadorCineApp(int opcaoMenu, Operador operador) {
    

        switch (opcaoMenu){
            case 1 ->{
                String nome = operador.nomeFilme();
                String genero = operador.generoFilme();
                int duracao = operador.duracaoFilme();
                int anoLancamento = operador.anoLancamentoFilme();
                
                Filme filme = new Filme(nome, genero, duracao, anoLancamento);
                listaFilmes.add(filme);
            }

            case 2 -> {
                if (listaFilmes.isEmpty()) {
                    operador.listarFilmesVazio();
                } else {
                    for (Filme filme : listaFilmes) {
                        operador.listarFilmes(filme);
                    }
                }
            }

            case 3 ->{
              String nome = operador.removerFilme();
              boolean removido = false;
              
              for( int i = 0; i < listaFilmes.size(); i ++) {
                if (listaFilmes.get(i).getNome().equalsIgnoreCase(nome)) {
                    listaFilmes.remove(i);
                    removido = true;
                    operador.filmeRemovido();
                    break;
                }
            }
        }

        case 4 ->{
            String nome = operador.buscarFilme();
            boolean encontrado = false;
            
            for (Filme filme : listaFilmes) {
                if (filme.getNome().equalsIgnoreCase(nome)) {
                    operador.listarFilmes(filme);
                    encontrado = true;
                    break;
                }
            }
            
            if (!encontrado) {
                operador.filmeNaoEncontrado();
            }
        }
        
        case 5 -> {
            String editar = operador.editarFilme();

            for( Filme filme : listaFilmes){
                if (filme.getNome().equalsIgnoreCase(editar)) {
                    String novoNome = operador.nomeFilme();
                    String novoGenero = operador.generoFilme();
                    int novaDuracao = operador.duracaoFilme();
                    int novoAnoLancamento = operador.anoLancamentoFilme();

                    filme.setNome(novoNome);
                    filme.setGenero(novoGenero);
                    filme.setDuracao(novaDuracao);
                    filme.setAnoLancamento(novoAnoLancamento);
                    
                    operador.listarFilmes(filme);
                    break;
                }
            }
        } 

        case 6 ->{
            int totalFilmes = listaFilmes.size();
                if (totalFilmes == 0) {
                    System.out.println("Nenhum Filme cadastrado.");
                } else {
                    System.out.println("Total de Filmes cadastrados: " + totalFilmes);
                }
            }
        }
        

    }

}
