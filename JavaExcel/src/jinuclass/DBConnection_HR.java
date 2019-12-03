package jinuclass;


import java.sql.Connection;
import java.sql.DriverManager; 
 

                                         
public class DBConnection_HR {        
	                            
	public Connection getConnection(){          
		Connection connection=null;                      
		System.out.println("Connection called");                  
		try {                                                                   
			Class.forName("com.mysql.jdbc.Driver");              
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hr","root", "root");
    	 	
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return connection;
	}

	
}
