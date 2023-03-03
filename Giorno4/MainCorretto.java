package Giorno4;

import java.util.Scanner;

public class MainCorretto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner x=new Scanner(System.in);
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
			break;
		}
		case 2:{
			
			break;
			
		}
		case 3:{
			System.out.println("Bene, ora ti chiederò d'inserirmi la tua ");
			System.out.println("password per l'utente da creare");
			String password=x.nextLine();
			
			
			
			Utente utente=new Utente(null);
			
			
			break;
		}
		case 4:{
			System.out.println("Ciao, alla prossima");
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + x);
		}
		
	}

}
