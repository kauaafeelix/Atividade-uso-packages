package br.com.naturapp.service;
import br.com.naturapp.model.Suplemento;
import br.com.naturapp.view.Atendente;

import java.util.List;
import java.util.ArrayList;


public class Estoque {

    List<Suplemento> listaSuplementos;

    public Estoque() {
        listaSuplementos = new ArrayList<>();
    }

    public void gerenciadorApp (int opcao, Atendente atendente){
        switch (opcao){
            case 1 ->{
                String nome = atendente.nomeSuplemento();
                double preco = atendente.precoSuplemento();
                int quantidade = atendente.quantidadeSuplemento();
                String marca = atendente.marcaSuplemento();

                Suplemento suplemento = new Suplemento(nome, preco, quantidade, marca);
                listaSuplementos.add(suplemento);
            }
            
            case 2 ->{
                if (listaSuplementos.isEmpty()) {
                    atendente.suplementoNaoCadastrado();
                } else {
                    for (Suplemento suplemento : listaSuplementos) {
                        atendente.suplementosCadastrados(suplemento);
                    }
                }
            }

            case 3 -> {
               String nome = atendente.removerlivro();
               boolean removido = false; 

               for( int indice = 0; indice < listaSuplementos.size(); indice ++) {
                   if (listaSuplementos.get(indice).getNome().equalsIgnoreCase(nome)) {
                       listaSuplementos.remove(indice);
                       removido = true;
                       System.out.println("Suplemento removido com sucesso!");
                       break;
                   }
               }
               if (!removido) {
                   atendente.suplementoNaoEncontrado(nome);
               }
            }

            case 4 -> {
                String nome = atendente.pesquisarSuplemento();
                boolean encontrado = false;

                for (Suplemento suplemento : listaSuplementos) {
                    if (suplemento.getNome().equalsIgnoreCase(nome)) {
                        atendente.suplementoPesquisado(suplemento);
                        encontrado = true;
                        break;
                    }
                    else{
                        atendente.suplementoNaoEncontrado(nome);
                    }

                }
                
            }

            case 5 -> {
                String nome = atendente.editarSuplemento();
                for (Suplemento suplemento: listaSuplementos){
                    if (suplemento.getNome().equalsIgnoreCase(nome)){
                        String novoNome = atendente.nomeSuplemento();
                        double novoPreco = atendente.precoSuplemento();
                        int novaQuantidade = atendente.quantidadeSuplemento();
                        String novaMarca = atendente.marcaSuplemento();

                        suplemento.setNome(novoNome);
                        suplemento.setPreco(novoPreco);
                        suplemento.setQuantidade(novaQuantidade);
                        suplemento.setMarca(novaMarca);

                        atendente.suplementosCadastrados(suplemento);
                        return;
                    }
                }
            }

            case 6 -> {
                int totalLivros = listaSuplementos.size();
                if (totalLivros == 0) {
                    System.out.println("Nenhum suplemento cadastrado.");
                } else {
                    System.out.println("Total de suplementos cadastrados: " + totalLivros);
                }
            }
        }
    }
}
