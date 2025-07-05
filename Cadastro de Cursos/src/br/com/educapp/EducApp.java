package br.com.educapp;
import br.com.educapp.model.Curso;
import br.com.educapp.view.Secretaria;
import br.com.educapp.service.GerenciadorCursos;


public class EducApp {

	public static void main(String[] args) {
		Secretaria secretaria = new Secretaria();
		GerenciadorCursos gerenciador = new GerenciadorCursos();
		int opcao;

		do{
			opcao = secretaria.menu();
			if (opcao >= 1 && opcao <= 6) {
				gerenciador.gerenciadorApp(opcao, secretaria);
			} else if (opcao == 7) {
				secretaria.encerrando();
			} else {
				secretaria.erro();
			}
		} while (opcao != 7);
	}

}
