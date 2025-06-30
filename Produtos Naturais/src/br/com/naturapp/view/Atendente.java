package br.com.naturapp.view;
import br.com.naturapp.model.Suplemento;

import java.util.Scanner;

public class Atendente {

    Scanner leia = new Scanner (System.in);

    public int menu (){
        System.out.println("\nBem-vindo ao sistema de vendas da NaturApp!");
        System.out.println("\nSelecione uma opção:");
        System.out.println("1 - Cadastrar Suplemento");
        System.out.println("2 - Listar Suplementos");
        System.out.println("3 - Remover Suplemento por Nome");
        System.out.println("4 - Pesquisar Suplemento por Nome");
        System.out.println("5 - Editar Suplemento");
        System.out.println("6 - Contagem de Suplementos Cadastrados");
        System.out.println("7 - Sair");
        System.out.println("\nDigite o Número da Opção Desejada: ");
        int opcaoMenu = leia.nextInt();
        return opcaoMenu;
    }

    public String nomeSuplemento() {
        System.out.println("Digite o nome do suplemento: ");
        leia.nextLine();
        String nome = leia.nextLine();
        return nome;
    }
    public double precoSuplemento() {
        System.out.println("Digite o preço do suplemento: ");
        double preco = leia.nextDouble();
        return preco;
    }
    public int quantidadeSuplemento() {
        System.out.println("Digite a quantidade do suplemento: ");
        int quantidade = leia.nextInt();
        return quantidade;
    }
    public String marcaSuplemento() {
        System.out.println("Digite a marca do suplemento: ");
        leia.nextLine();
        String marca = leia.nextLine();
        return marca;
    }

    public void suplementoNaoCadastrado(){
        System.out.println("Nenhum suplemento cadastrado ou não encontrado. Tente novamente.");
    }

    public void suplementosCadastrados(Suplemento suplemento) {
        System.out.println("\nSuplemento cadastrado com sucesso!");
        System.out.printf("%nNome: %s" , suplemento.getNome());
        System.out.printf("%nPreço: R$ %.2f" ,suplemento.getPreco());
        System.out.printf("%nQuantidade: %d" ,suplemento.getQuantidade());
        System.out.printf("%nMarca: %s" ,suplemento.getMarca());
    }

    public String removerlivro(){
        System.out.println("Digite o nome do suplemento que deseja remover: ");
        leia.nextLine();
        String nome = leia.nextLine();
        return nome;
    }

    public void suplementoRemovido(String nome) {
        System.out.println("Suplemento "+nome+" removido com sucesso!");
    }

    public void suplementoNaoEncontrado(String nome) {
        System.out.println("Suplemento "+nome+" não encontrado.");
    }

    public String pesquisarSuplemento() {
        System.out.println("Digite o nome do suplemento que deseja pesquisar: ");
        leia.nextLine();
        String nome = leia.nextLine();
        return nome;
    }

    public void suplementoPesquisado(Suplemento suplemento) {
        System.out.println("\nSuplemento encontrado!");
        System.out.printf("%nNome: %s" , suplemento.getNome());
        System.out.printf("%nPreço: R$ %.2f" ,suplemento.getPreco());
        System.out.printf("%nQuantidade: %d" ,suplemento.getQuantidade());
        System.out.printf("%nMarca: %s" ,suplemento.getMarca());
    }

    public String editarLivro (){
        System.out.println("Digite o nome do suplemento que deseja editar: ");
        leia.nextLine();
        String nome = leia.nextLine();
        return nome;
    }

    public void suplementoNaoEditado(String nome) {
        System.out.println("Suplemento "+nome+" não encontrado para edição.");
    }

    public String editarSuplemento () {
        System.out.println("Digite o nome do suplemento que deseja editar: ");
        leia.nextLine();
        String nome = leia.nextLine();
        return nome;
    }

    public void suplementoEditado(Suplemento suplemento) {
        System.out.println("\nSuplemento editado com sucesso!");
        System.out.printf("%nNome: %s" , suplemento.getNome());
        System.out.printf("%nPreço: R$ %.2f" ,suplemento.getPreco());
        System.out.printf("%nQuantidade: %d" ,suplemento.getQuantidade());
        System.out.printf("%nMarca: %s" ,suplemento.getMarca());
    }

    public void erro(){
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
