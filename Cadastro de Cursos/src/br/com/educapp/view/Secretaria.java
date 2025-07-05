package br.com.educapp.view;
import br.com.educapp.model.Curso;

import java.util.Scanner;

public class Secretaria {

    Scanner leia = new Scanner(System.in);

    public int menu(){
        System.out.println("\nBem-vindo à Secretaria da EducApp!");
        System.out.println("\n1 - Cadastrar Curso");
        System.out.println("2 - Listar Cursos");
        System.out.println("3 - Remover Cursos");
        System.out.println("4 - Buscar Curso pelo nome");
        System.out.println("5 - Editar dados de um curso");
        System.out.println("6 - Mostrar quantidade total de cursos ja cadastrados");
        System.out.println("7 - Sair");
        System.out.print("Escolha uma opção: ");
        int opcao = leia.nextInt();
        leia.nextLine(); 
        return opcao;
    }

    public Curso cadastrarCurso() {
        System.out.println("\nCadastro de Curso");
        System.out.print("Nome do curso: ");
        String nome = leia.nextLine();
        System.out.print("Duração em horas: ");
        int duracaoHoras = leia.nextInt();
        leia.nextLine(); 
        System.out.print("Nível do curso (Básico, Intermediário, Avançado): ");
        String nivel = leia.nextLine();
        System.out.print("Número de vagas: ");
        int vagas = leia.nextInt();
        leia.nextLine(); 

        return new Curso(nome, duracaoHoras, nivel, vagas);
    }

    public void listarCuros (Curso curso){
        System.out.println("\nLista de Cursos Cadastrados:");
        System.out.println("Nome do Curso: "+ curso.getNome());
        System.out.println("Duracao em horas: "+ curso.getDuracaoHoras());
        System.out.println("Nivel do Curso: "+ curso.getNivel());
        System.out.println("Vagas Disponiveis: "+ curso.getVagas());
    }

    public String removerCurso (){
        System.out.println("\nDigite o nome do curso que deseja remover: ");
        String nomeCurso = leia.nextLine();
        leia.nextLine();
        return nomeCurso;
    }

    public void cursoRemovido(String nome) {
        System.out.println("\nCurso "+nome+" removido com sucesso!");
    }

    public String buscarCurso() {
        System.out.println("\nDigite o nome do curso que deseja buscar: ");
        String nomeCurso = leia.nextLine();
        return nomeCurso;
    }



    public void cursoNaoEncontrado() {
        System.out.println("\nCurso não encontrado.");
    }

    public Curso editarCurso(Curso curso) {
        System.out.println("\nEdição de Curso");
        System.out.print("Novo nome do curso : ");
        String novoNome = leia.nextLine();
        System.out.print("Nova duração em horas: ");
        int novaDuracao = leia.nextInt();
        leia.nextLine(); 
        System.out.print("Novo nível do curso: ");
        String novoNivel = leia.nextLine();
        System.out.print("Novo número de vagas: ");
        int novasVagas = leia.nextInt();
        leia.nextLine(); 

        curso.setNome(novoNome);
        curso.setDuracaoHoras(novaDuracao);
        curso.setNivel(novoNivel);
        curso.setVagas(novasVagas);

        return curso;
    }

    public void cursoEditado(Curso curso) {
        System.out.println("\nSuplemento editado com sucesso!");
        System.out.println("Nome: " + curso.getNome());
        System.out.println("Preço: R$" +curso.getDuracaoHoras());
        System.out.println("Nivel: " +curso.getNivel());
        System.out.println("Marca: " +curso.getVagas());
    }

    public void cursoNaoEditado(String nome) {
        System.out.println("Curso "+nome+" não encontrado para edição.");
    }

    public void quantidadeTotalCursos(int totalCursos) {
        System.out.println("\nQuantidade total de cursos cadastrados: " + totalCursos);
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
