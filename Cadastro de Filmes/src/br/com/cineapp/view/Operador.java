package br.com.cineapp.view;
import br.com.cineapp.model.Filme;

import java.util.Scanner;

public class Operador {
    
    Scanner leia = new Scanner(System.in);
    
        public int menu(){
            System.out.println("Bem-vindo ao CineApp!");
            System.out.println("Selecione uma opção:");
            System.out.println("1 - Cadastrar Filme");
            System.out.println("2 - Listar Filmes");
            System.out.println("3 - Remover Filme pelo Titulo");
            System.out.println("4 - Buscar Filme pelo Titulo");
            System.out.println( "5 - Editar os dados de um Filme");
            System.out.println("6 - Mostrar quantidade de filmes cadastrados");
            int opcaoMenu = leia.nextInt();

            return opcaoMenu;
        }

        public String nomeFilme (){
            System.out.println("Digite o nome do filme:");
            leia.nextLine(); 
            String nome = leia.nextLine();
            return nome;
        }

        public String generoFilme (){
            System.out.println("Digite o gênero do filme:");
            String genero = leia.nextLine();
            return genero;
        }

        public int duracaoFilme (){
            System.out.println("Digite a duração do filme (em minutos):");
            int duracao = leia.nextInt();
            return duracao;
        }

        public int anoLancamentoFilme (){
            System.out.println("Digite o ano de lançamento do filme:");
            int anoLancamento = leia.nextInt();
            return anoLancamento;
        }

        public void listarFilmes (Filme filme){
            System.out.println("\nLista de filmes cadastrados:");
            System.out.println("\n---------------------------------");
            System.out.println("\nNome: " + filme.getNome());
            System.out.println("Gênero: " + filme.getGenero());
            System.out.println("Duração: " + filme.getDuracao() + " minutos");
            System.out.println("Ano de Lançamento: " + filme.getAnoLancamento());

        }
        public void listarFilmesVazio() {
            System.out.println("\nNenhum filme cadastrado.");
        }

        public String removerFilme() {
            System.out.println("Digite o título do filme que deseja remover:");
            leia.nextLine(); 
            String nome = leia.nextLine();
            return nome;
        }

        public void filmeRemovido (){
            System.out.println("Filme removido com sucesso!");
        }

        public String buscarFilme() {
            System.out.println("Digite o título do filme que deseja buscar:");
            leia.nextLine(); 
            String nome = leia.nextLine();
            return nome;
        }

        public void filmeNaoEncontrado() {
            System.out.println("Filme não encontrado.");
        }

        public String editarFilme() {
            System.out.println("Digite o título do filme que deseja editar:");
            leia.nextLine(); 
            String nome = leia.nextLine();
            return nome;
        }

        public void editarDadosFilme(Filme filme) {
            System.out.println("Digite o novo nome do filme:");
            filme.setNome(leia.nextLine());
            System.out.println("Digite o novo gênero do filme:");
            filme.setGenero(leia.nextLine());
            System.out.println("Digite a nova duração do filme (em minutos):");
            filme.setDuracao(leia.nextInt());
            System.out.println("Digite o novo ano de lançamento do filme:");
            filme.setAnoLancamento(leia.nextInt());
        }

        public void quantidadeFilmes() {
            System.out.println("Quantidade de filmes cadastrados: ");
        }

        public void erro () {
            System.out.println("Erro: Opção inválida! Por favor, escolha uma opção entre 1 e 7.");
        }

        public void encerrando() {
            try {
                System.out.print("\nS");
                Thread.sleep(500); 
                System.out.print("i");
                Thread.sleep(500);
                System.out.print("s");
                Thread.sleep(500);
                System.out.print("t");
                Thread.sleep(500);
                System.out.print("e");
                Thread.sleep(500);
                System.out.print("m");
                Thread.sleep(500);
                System.out.print("a");
                Thread.sleep(500);
                System.out.printf("\n");
                Thread.sleep(500);
                System.out.print("E");
                Thread.sleep(500);
                System.out.print("n");
                Thread.sleep(500);
                System.out.print("c");
                Thread.sleep(500);
                System.out.print("e");
                Thread.sleep(500);
                System.out.print("r");
                Thread.sleep(500);
                System.out.print("r");
                Thread.sleep(500);
                System.out.print("a");
                Thread.sleep(500);
                System.out.print("d");
                Thread.sleep(500);
                System.out.print("o");
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace(); 
            }
}
}

