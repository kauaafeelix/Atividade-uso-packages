package br.com.naturapp;

import br.com.naturapp.model.Suplemento;
import br.com.naturapp.view.Atendente;
import br.com.naturapp.service.Estoque;

public class NaturApp {

	public static void main(String[] args) {
		Atendente atendente = new Atendente();
		Estoque estoque = new Estoque();
		int opcaoMenu = 0;

		do{
			opcaoMenu = atendente.menu();

			if(opcaoMenu >=1 && opcaoMenu <= 6) {
				estoque.gerenciadorApp(opcaoMenu, atendente);
			} else if (opcaoMenu == 7) {
            atendente.encerrando();
        } else {
			atendente.erro();
		}
    } while (opcaoMenu != 7);
}

}
