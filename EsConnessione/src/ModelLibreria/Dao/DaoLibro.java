package ModelLibreria.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import Connector.ConnettoreProva;
import ModelLibreria.Libro;

public class DaoLibro implements Dao<Libro>{

	@Override
	public boolean insert(Libro t) throws SQLException {
		Connection conn= ConnettoreProva.getIstanza().getConnesione();
		String query= "insert into Libro(titolo,descrizione,data_pub,codiceIsbn,prezzo,autore) values (?,?,?,?,?,?)";
		PreparedStatement ps = conn.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
		ps.setString(1, t.getTitolo());
		ps.setString(2, t.getDescrizione());
		ps.setDate(3, t.getData_pub());
		ps.setString(4, t.getCodiceIsbn());
		ps.setFloat(5, t.getPrezzo());
		ps.setString(6,t.getAutore());
		
		ps.executeUpdate();
		ResultSet rs=ps.getGeneratedKeys();
		rs.next();
		Integer idGenerato=rs.getInt(1);
		t.setIdLibro(idGenerato);
		
		if(idGenerato>0)
			return true;
			return false;
		
	}
		
		
		
		
		
		
		
		

	@Override
	public List<Libro> findAll() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T findById(Integer id) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean delete(Integer id) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}
	
}
