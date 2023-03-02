package Giorno4;

import java.util.ArrayList;
import java.util.Random;

import giorno3.Pietanza;

public class Utente {
	
	private static int nomeUtente;
	private String password;
	private boolean admin;
	private static int contatoreAdmin;
	private double soldiPosseduti;
	//private static int id;
	private static int idCont=1;
	private int id;
		
	
	
	
	Utente(String password){
		nomeUtente=id;
		this.password=password;
		admin=false;
		id=idCont;
		idCont++;
		Random r = new Random();
		soldiPosseduti=r.nextDouble();
		
	}
	//Utente(){
		 //admin=false;
		  //Random r = new Random();
		 //soldiPosseduti=r.nextDouble();
	//}
	public int getNomeUtente() {
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
