package giorno5;

public class Somma {
	private int a;
	private int b;
	
	//possibilità di costruire la classe senza parametri iniziali
	public Somma() {
		super();
	}
	//possibilità di costruire la classe con parametri iniziali
	public Somma(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}
	
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	
	public int sommaNumeri() {
		//System.out.println("la somma è:");
		//System.out.println(a+b);
		return (a+b);
	}
	public int sommaNumeri(int a, int b) {
		this.setA(a);
		this.setB(b);
		System.out.println("la somma è:");
		System.out.println(a+b);
		return(a+b);
	}

}
