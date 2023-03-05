package EsRistorante;

import java.util.ArrayList;
import java.util.Random;

import EsRistorante.Pietanza;

public class Utente {
	
	private String nomeUtente;
	private String password;
	private boolean admin;
	private static int contatoreAdmin=0;
	private double soldiPosseduti;
	//private static int id;
	private static int idCont=1;
	private int id;
		
	
	//l'utente si deve prima inserire, non esiste la creazione
	//di admin di partenza ma un utente potrà diventare un admin
	//questa funzione sarà implementata solamente all'admin
	
	Utente(String nomeUtente, String password){
		id=idCont;
		//nomeUtente=id;
		this.nomeUtente=this.nomeUtente;
		this.password=password;
		admin=false;
		
		
		idCont++;
		Random r = new Random();
		soldiPosseduti=r.nextDouble();
		
	}
	public Utente() {
		super();
	}
	//Utente(){
		 //admin=false;
		  //Random r = new Random();
		 //soldiPosseduti=r.nextDouble();
	//}
	public String getNomeUtente() {
		return nomeUtente;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean isAdmin() {
		return admin;
	}
	public void setAdmin(boolean admin) {
		this.admin = admin;
	}
	public double getSoldiPosseduti() {
		return soldiPosseduti;
	}
	public void setSoldiPosseduti(double soldiPosseduti) {
		this.soldiPosseduti = soldiPosseduti;
	}
	public static int getContatoreAdmin() {
		return contatoreAdmin;
	}
	public void creazioneUtenteAdmin() {
		if(contatoreAdmin<=2) {
			
		contatoreAdmin++;
		admin=true;
		soldiPosseduti=0.0;
		} else {
			System.out.println("Si è raggiunto il numero massimo degli Admin");
		}
	}
	public int getId() {
		return id;
	}
	
}
