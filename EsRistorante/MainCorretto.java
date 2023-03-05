package EsRistorante;

import java.util.Scanner;

//import javax.swing.JPanel;

public class MainCorretto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//JPanel panel1=new panel();  front da applicare in futuro
		Scanner x=new Scanner(System.in);
		Controllore controllo=new Controllore();
		int ciclo1=0;
		int ciclo2=0;
		//creare utente Admin di partenza per gestire il sito e rendere anche altri utenti admin
		Utente admin1=new Utente("CapoSupremo","password");
		admin1.creazioneUtenteAdmin();
		//System.out.println(admin1.getId());
		
		
		RegistroUtenze utenzeRegistrate=new RegistroUtenze();
		utenzeRegistrate.aggiungiUtentiAdmin(admin1);
		//System.out.println(utenzeRegistrate.getUtentiAdmin());
		Menu menuTotale=new Menu();
		Pietanza piatto1= new Pietanza ("Pasta al sugo",4.00);
		Pietanza piatto2= new Pietanza ("Lasagna",6.15);
		Pietanza piatto3= new Pietanza ("Pollo",7.35);
		Pietanza piatto4= new Pietanza ("Pesce",9.95);
		Pietanza piatto5= new Pietanza ("Vino",100.10);
		
		piatto1.setIngredienti("pasta");
		piatto1.setIngredienti("sugo");
		System.out.println(piatto1.toString());
		
		piatto2.setIngrediente("pasta sfoglia");
		piatto2.setIngrediente("ragu");
		menuTotale.aggiungiPietanza(piatto1);
		menuTotale.aggiungiPietanza(piatto2);
		
		while(ciclo1<1){
			
			System.out.println("Buongiorno, benvenuto al ristorante");
			System.out.println("Si prega di fare una scelta");
			System.out.println("Premi 1 se vuoi loggarti da utente");
			System.out.println("Premi 2 se sei un Admin");
			System.out.println("Premi 3 se vuoi registrarti come utente");
			System.out.println("Premi 4 se vuoi uscire dal ristorante");
		int a=x.nextInt();
		
		switch (a) {
		case 1: {
			System.out.println("Bene utente, inserisci id e password");
			System.out.println("Prima inserismi il tuo ID");
			int idIn=x.nextInt();
			System.out.println("Ora la tua Password");
			String passwordIn=x.next();
			
			controllo.loggaUtenteNormale(utenzeRegistrate.getUtentiNormali(), passwordIn, idIn);
			if(controllo.isSeiLoggato()==true) {
				System.out.println("Benvenuto");
				System.out.println("Vuoi ordinare? Premi 1");
				 System.out.println("Sei entrato per sbaglio? Effettua il log out");
				 double conto=0;//inizializzo il conto
				 int sceltaUtente=x.nextInt();
				 switch (sceltaUtente) {
				case 1: {
					
				 while (ciclo2<1) { //inizio ciclo2
					
				System.out.println("Bene Utente, scegli cosa fare");
				System.out.println("Premi 1 se sai già cosa scegliere");
				System.out.println("Premi 2 se vuoi leggere ");
				System.out.println("il menu e visualizzare la lista ingredienti");
				System.out.println("premi 3 se vuoi pagare il conto");
				System.out.println("premi 4 se vuoi uscire");
				
				int sceltaUtente2=x.nextInt();
				
				switch (sceltaUtente2) {
				case 1: {
					System.out.println("Bene, inserisci cosa vuoi ordinare");
					String c=x.nextLine();
					for( Pietanza d:menuTotale.getMenuTotale()) {
						if(c.equals(d.getNome())) {
							System.out.println("hai ordinato");
							System.out.println(d.getNome());
							System.out.println("il suo prezzo è:");
							System.out.println(d.getPrezzo());
							conto+=d.getPrezzo();
							System.exit(0);
							//System.out.println("Vuoi Ordinare altro?");
							//System.out.println("Yes/No");
							//String scelta=x.nextLine();
							
							//if(scelta.equals("Yes")||scelta.equals("yes")){
										//b=1;								
							//} else{
								
								
								//cicloMenu=false;
								
							//}
						}
					} //chiusura sfor
					break;
				} //chiusura case 1
				case 2: {
					for(Pietanza d:menuTotale.getMenuTotale()) {
						System.out.println(d.toString());
						
					}
				}
				case 3:{
					System.out.println("Bene, procediamo a pagare il conto");
					System.out.println("accettiamo solamente pagamenti con saldo depositato");
					System.out.println("con carta in anticipo");
					System.out.println("Il tuo saldo attuale è:");
					controllo.getUtenteCorrente().getSoldiPosseduti();
					System.out.println("Mentre il tuo conto attuale è"+ conto);
					if(controllo.getUtenteCorrente().getSoldiPosseduti()>conto) {
					controllo.getUtenteCorrente().setSoldiPosseduti(controllo.getUtenteCorrente().getSoldiPosseduti()-conto);
					System.out.println("Bene, sei rimasto con "+controllo.getUtenteCorrente().getSoldiPosseduti()+" soldi");
					System.out.println("Grazie per aver acquistato nel nostro ristorante");
					System.out.println("Alla prossima");
					ciclo2=1;
					System.exit(0);
					
					}else {
						System.out.println("Non hai abbastanza soldi");
						ciclo2=1;
						System.exit(0);
					}
						
				}
				case 4:{
					controllo.logOut(); //effettuo il log out
					ciclo2=1;
					System.exit(0);
					
				}
				default:
					throw new IllegalArgumentException("Unexpected value: " + sceltaUtente2);
				}
				
				 }//fine ciclo scelta 2
				break;
				}
				case 2:{
					//controllo.setLogOut;
					System.exit(0);
				}
				 } //chiusura switch sceltaUtente1
				
			} else {
				System.exit(0);
			}
			break;
		}
		case 2:{
			System.out.println("Molto Bene signor Admin");
			System.out.println("Dammi il tuo ID e la tua Password");
			System.out.println("Prima inserismi il tuo ID");
			int idIn=x.nextInt();
			System.out.println("Ora la tua Password");
			String passwordIn=x.next();
			controllo.loggaUtenteNormale(utenzeRegistrate.getUtentiAdmin(), passwordIn, idIn);
			if(controllo.isSeiLoggato()==true) {
				
				System.out.println("Dunque signor Admin, cosa desidera fare?");
				System.out.println("Premi 1 se vuoi inserire un nuovo piatto nel menu");
				System.out.println("Premi 2 se vuoi rendere un Utente un Admin ");
				System.out.println("(Massimo un altro oltre te per un totale massimo di 2 Admin)");
				System.out.println("Premi 3 se vuoi effettuare il Log Out");
				int sceltaAdmin=x.nextInt();
				switch (sceltaAdmin) {
				case 1: {
					System.out.println("Admin, dimmi come si chiama il tuo nuovo piatto");
					String nomeNuovoPiatto=x.next();
					System.out.println("Dammi anche il suo costo");
					Double costoPiatto=x.nextDouble();
					System.out.println("Quanti ingredienti ha la tua nuova pietanza?");
					int numeroIngredinti=x.nextInt();
					Pietanza piattox=new Pietanza(nomeNuovoPiatto,costoPiatto);
					for(int k=1; k<=numeroIngredinti; k++) {
						System.out.println("Scrivimi il tuo ingrediente n "+k );
						String nuovoIngrediente=x.next();
						piattox.setIngredienti(nuovoIngrediente); //si poteva scrivvere in unico
						//codice, senza ulteriore variabile, ma così piu comprensibile per me
					}
					menuTotale.aggiungiPietanza(piattox);
						
					
					break;
				}
				case 2:{
					System.out.println("Bene, adesso puoi rendere un altro utente tuo Admin");
					System.out.println("Attenzione, come ti ho già detto, non possono");
					System.out.println("Esserci più di 2 Admin nel sistema compreso te");
					System.out.println("Attualmente il processo è irreversibile");
					System.out.println("Pertanto scegli bene");
					System.out.println("Bene, dammi il nome Utente dell'account");
					System.out.println("Da te scelto per divenire Admin");
					String utenteDaBuffare=x.next();
					controllo.cercaUtente(utenteDaBuffare);
					if(controllo.getUtenteTrovato()!=null) {
						controllo.getUtenteTrovato().creazioneUtenteAdmin(); //reso Admin
						
					}else System.out.println("Nome non trovato");
					
					break;
				}
				case  3:{
					System.out.println("ora ti effettuo il log Out");
					controllo.logOut();
					System.exit(0);
					break;
				}
				
				default:
					throw new IllegalArgumentException("Unexpected value: " + sceltaAdmin);
				}
			} else {
				System.out.println("Id o Password non corrette, riprova");
				System.exit(0);
			}// fine if controllo log-in Admin
			break;
			
		}
		case 3:{
			System.out.println("Bene, ora ti chiederò d'inserirmi  ");
			System.out.println("Il tuo nome utente e password per crearlo");
			System.out.println("Bene, ora inserisci ill nome utente");
			String nomeUtenteIn=x.next();
			
			System.out.println("password per l'utente da creare");
			String passwordIn=x.next();
			//non ho capito perchè lo scanner non parte se lo imposto come nextLine
			
			System.out.println("il tuo nome utente è "+nomeUtenteIn);
			System.out.println("la tua password è "+passwordIn);
			
			Utente utente=new Utente(nomeUtenteIn,passwordIn);
			System.out.println("Molto bene, ti ho creato un tuo Id ");
			System.out.println("con cui poter loggare insieme alla password, salvalo");
			System.out.println(utente.getId());
			
			System.out.println("Bene, hai registrato il tuo account");
			utenzeRegistrate.aggiungiUtenteNormale(utente);
			System.out.println(utente.getPassword());
			
			
			
			
			break;
		}
		case 4:{
			System.out.println("Ciao, alla prossima");
			System.exit(0);
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + x);
		}
		}
	}

}
