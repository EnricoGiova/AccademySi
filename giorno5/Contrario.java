package giorno5;

public class Contrario {
	//inizializzare 2 stringhe 
	private String stringa;
	private String invertita="";
	
		public Contrario(String stringa) {
		super();
		this.stringa = stringa;
	}

		public String getStringa() {
		return stringa;
	}

	public void setStringa(String stringa) {
		this.stringa = stringa;
	}
	//metodo che converte la stringa al suo contrario prendendo
	// la stringa passata e mettendola in una nuova stringa che si va a stampare
	//la stringa invertita essendo privata e senza get e setter non sarà visualizzata
	//dall'utente ma solamente restituita
	//Nel ciclo è importante
	// procedere con il contatore al contrario
		public String inverti() {
			
			for(int i=stringa.length()-1;i>=0;i--) {
				invertita=invertita+stringa.charAt(i);
			}
			return invertita;
						
		}
}
