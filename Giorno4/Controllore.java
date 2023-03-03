package Giorno4;

import java.util.ArrayList;

import Giorno4parte2.Genere;

public class Controllore {

	private boolean SeiLoggato=false;
	
	public boolean isSeiLoggato() {
		return SeiLoggato;
	}
	
	public void loggaAdmin(ArrayList<Utente> Utente, String password, int id) {
		for(Utente utente:Utente) {
		if (utente.getId()==id && utente.getPassword()==password) {
			SeiLoggato=true;
		}
		}
	}

	public void loggaUtenteNormale(ArrayList<Utente> Utente, String password, int id ) {
		
		for(Utente utente:Utente) {
		if (utente.getId()==id && utente.getPassword()==password) {
			SeiLoggato=true;
		}
		}
		
	}
}
