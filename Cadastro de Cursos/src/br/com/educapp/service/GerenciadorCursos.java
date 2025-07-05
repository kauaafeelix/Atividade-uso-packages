package br.com.educapp.service;
import br.com.educapp.model.Curso;
import br.com.educapp.view.Secretaria;
import java.util.ArrayList;
import java.util.List;

public class GerenciadorCursos {

    List<Curso> listaCursos;

     public GerenciadorCursos() {
        listaCursos = new ArrayList<>();
}
    public void gerenciadorApp (int opcao, Secretaria secretaria){
        switch (opcao) {
            case 1->{
                String nome = secretaria.cadastrarCurso().getNome();
                int duracaoHoras = secretaria.cadastrarCurso().getDuracaoHoras();
                String nivel = secretaria.cadastrarCurso().getNivel();
                int vagas = secretaria.cadastrarCurso().getVagas();
                Curso curso = new Curso(nome, duracaoHoras, nivel, vagas);
                listaCursos.add(curso);
            }

            case 2 ->{
            if (listaCursos.isEmpty()) {
                secretaria.cursoNaoEncontrado();
            } else {
                for (Curso curso : listaCursos) {
                    secretaria.listarCuros(curso);
                }
                
            }
        }

        case 3 -> {
            String nome = secretaria.removerCurso();
            boolean removido = false; 

            for( int indice = 0; indice < listaCursos.size(); indice ++) {
                if (listaCursos.get(indice).getNome().equalsIgnoreCase(nome)) {
                    listaCursos.remove(indice);
                    removido = true;
                    secretaria.cursoRemovido(nome);
                    break;
                }
            }
            if (!removido) {
                secretaria.cursoNaoEncontrado();
            }
         }

         case 4 -> {
            String nome = secretaria.buscarCurso();
            boolean encontrado = false;

            for (Curso curso : listaCursos) {
                if (curso.getNome().equalsIgnoreCase(nome)) {
                    secretaria.buscarCurso();
                    encontrado = true;
                    break;
                }
                else{
                    secretaria.cursoNaoEncontrado();
                }

            }
            
        }

         case 5 -> {
            String nome = secretaria.buscarCurso();
            boolean encontrado = false;
            for (Curso curso : listaCursos) {
                if (curso.getNome().equalsIgnoreCase(nome)) {
                    secretaria.editarCurso(curso);
                    encontrado = true;
                    break;
                }
            }
        }

        case 6 -> {
            secretaria.quantidadeTotalCursos(listaCursos.size());
        
        }

        case 7 ->{
            secretaria.encerrando();
        }

    }
}
}
