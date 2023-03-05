package EsRistorante;

import java.util.ArrayList;

import EsRistorante.Pietanza;

public class Menu {

	private ArrayList<Pietanza> menuTotale=new ArrayList<Pietanza>();

	public ArrayList<Pietanza> getMenuTotale() {
		return menuTotale;
	}

	public void setMenuTotale(ArrayList<Pietanza> menuTotale) {
		this.menuTotale = menuTotale;
	}
	
	public void aggiungiPietanza(Pietanza pietanza) {
		menuTotale.add(pietanza);
	}
	
	public void vediMenu() {
		for(int i=0;i<menuTotale.size();i++) {
			System.out.println(menuTotale.get(i).getNome()+":");
			System.out.println(menuTotale.get(i).getIngredienti());
			
		}
	}
	
}
