package EsRistorante;

import java.util.ArrayList;

public class RegistroUtenze {
	
	private ArrayList<Utente> utentiNormali=new ArrayList<Utente>();
	private ArrayList<Utente> utentiAdmin=new ArrayList<Utente>();
	
	public void aggiungiUtenteNormale(Utente utente) {
		if(utente.isAdmin()==false) {
		utentiNormali.add(utente);
		System.out.println("Hai registrato un utente normale");
		}else {
			System.out.println("Attenzione, questo è un utente Admin");
		}
		}
		
		@Override
		public String toString() {
			return "RegistroUtenze [utentiNormali=" + utentiNormali + ", utentiAdmin=" + utentiAdmin + "]";
		}

		public void aggiungiUtentiAdmin(Utente utente) {
			if(utente.isAdmin()==true) {
			utentiAdmin.add(utente);
			System.out.println("Hai inserito un utente admin");
			
			}
			else {
				System.out.println("Mi dispiace, non è un Admin");
			}
			
	}

		public ArrayList<Utente> getUtentiNormali() {
			return utentiNormali;
		}

		public ArrayList<Utente> getUtentiAdmin() {
			return utentiAdmin;
		}
	
}
