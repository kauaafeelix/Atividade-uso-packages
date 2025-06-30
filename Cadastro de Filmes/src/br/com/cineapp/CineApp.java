package br.com.cineapp;
import br.com.cineapp.model.Filme;
import br.com.cineapp.service.CatalogoFilmes;
import br.com.cineapp.view.Operador;

public class CineApp {

	public static void main(String[] args) {
		Operador operador = new Operador();
		CatalogoFilmes catalogo = new CatalogoFilmes();
		int opcaoMenu;

		do {
			opcaoMenu = operador.menu();
		
			if (opcaoMenu >= 1 && opcaoMenu <= 6) {
				catalogo.gerenciadorCineApp(opcaoMenu, operador);
			} else if (opcaoMenu == 7) {
				operador.encerrando();
			} else {
				operador.erro();
			}
		} while (opcaoMenu != 7);
}

}
