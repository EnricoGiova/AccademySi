package ModelLibreria;

import java.util.Date;

public class Libro {
	private String titolo;
	private String descrizione;
	private String codiceIsbn;
	private float prezzo;
	private String autore;
	private int idLibro;
	private java.sql.Date data_pub;
	
	public Libro() {
		
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public String getCodiceIsbn() {
		return codiceIsbn;
	}

	public void setCodiceIsbn(String codiceIsbn) {
		this.codiceIsbn = codiceIsbn;
	}

	public float getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(float prezzo) {
		this.prezzo = prezzo;
	}

	public String getAutore() {
		return autore;
	}

	public void setAutore(String autore) {
		this.autore = autore;
	}

	public int getIdLibro() {
		return idLibro;
	}

	public void setIdLibro(int idLibro) {
		this.idLibro = idLibro;
	}

	public java.sql.Date getData_pub() {
		return data_pub;
	}

	public void setData_pub(java.sql.Date data_pub) {
		this.data_pub = data_pub;
	}

	
	
	
	
	
	
}
