package Connector;

import java.sql.Connection;
import java.sql.SQLException;

import com.mysql.cj.jdbc.MysqlDataSource;

public class ConnettoreProva {

	private static ConnettoreProva connettore;
	private Connection connessione;
	
private ConnettoreProva() {
		
	}
	
	public static ConnettoreProva getIstanza() {
		if(connettore==null) 
			connettore=new ConnettoreProva();
		
			return connettore;
		
		
	}
	public Connection getConnesione() throws SQLException{
		if(connessione==null) {
			MysqlDataSource dataSource = new MysqlDataSource();
			
			dataSource.setServerName("localhost");
			dataSource.setPortNumber(3306);
			dataSource.setUser("root");
			dataSource.setPassword("toortoor");
			dataSource.setDatabaseName("libreria");
			dataSource.setUseSSL(false);
			dataSource.setAllowPublicKeyRetrieval(true);
			
			connessione = dataSource.getConnection();
		}
	}
	
}
