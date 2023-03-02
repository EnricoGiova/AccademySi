package Giorno4;

public class MainEsercizio {

	public static void main(String[] args) {
	
		Utente utente1=new Utente("AAA");
		Utente utente2=new Utente("BBB");
		
		utente2.creazioneUtenteAdmin();
		
		Utente utente3=new Utente("CCC");
		
		
		RegistroUtenze registro=new RegistroUtenze();
		registro.aggiungiUtenteNormale(utente1);
		registro.aggiungiUtenteNormale(utente2);
		registro.aggiungiUtenteNormale(utente3);
		
		System.out.println(utente1.getId());
		System.out.println(utente2.getId());
		System.out.println(utente3.getId());
		System.out.println(utente1.getId());
		System.out.print(utente3.getId());
		
		
		

	}

}
