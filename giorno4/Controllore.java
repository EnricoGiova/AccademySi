package giorno4;

import java.util.ArrayList;

//import Giorno4parte2.Genere;

public class Controllore {
	private RegistroUtenze utenzeRegistrate=new RegistroUtenze();
	private boolean SeiLoggato=false;
	private Utente utenteCorrente=new Utente();
	private Utente utenteTrovato=new Utente();
	
	public void logOut() {
		SeiLoggato = false;
	}

	public Utente getUtenteCorrente() {
		return utenteCorrente;
	}

	public boolean isSeiLoggato() {
		return SeiLoggato;
	}
	
	public void loggaAdmin(ArrayList<Utente> Utente, String password, int id) {
		for(Utente utente:utenzeRegistrate.getUtentiNormali()) {
		if (utente.getId()==id && utente.getPassword()==password) {
			utenteCorrente=utente;
			SeiLoggato=true;
			System.out.println("Benvenuto Admin, Ora puoi procedere");
		}
		else {
			System.out.println("Mi dispiace, Id o Password inserite");
			System.out.println("non corrette");
		}
		}
	}

	public void loggaUtenteNormale(ArrayList<Utente> Utente, String password, int id ) {
		
		for(Utente utente:utenzeRegistrate.getUtentiAdmin()) {
		if (utente.getId()==id && utente.getPassword()==password) {
			utenteCorrente=utente;
			SeiLoggato=true;
			System.out.println("Benvenuto Utente, Ora puoi procedere");
			utente.getNomeUtente();
		}
		else {
			System.out.println("Mi dispiace, Id o Password inserite");
			System.out.println("non corrette");
		}
		}
		
	}
	public Utente cercaUtente(String nomeUtente) {
		for(Utente utente:utenzeRegistrate.getUtentiNormali()) {
			if (utente.getNomeUtente()==nomeUtente) {
				utenteTrovato=utente; //problema che ci potrebbero essere più nomi utenti con lo stesso
				//nome, sarebbe meglio ricerca per Id, ma in quel caso l'admin dovrebbe
				//conoscere il nome id dell'utente che vuole rendere Admin
				//in alternativa si potrebbe rendere univoco il nome utente
		}else {
			System.out.println("Nome utente non trovato, mi dispiace");}
			utenteTrovato=null;
		}
		
		return utenteTrovato;
	
}
	public Utente getUtenteTrovato() {
		return utenteTrovato;
	}
}
