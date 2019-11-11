package Banco;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



import javax.swing.JOptionPane;

public class ConnectionFactory {

	public Connection getConnection(String usuario, String senha) {
            
            //classe Connection é do pacote java SQL
            try {
			DriverManager.registerDriver(new com.mysql. cj.jdbc.Driver());
			return DriverManager.getConnection("jdbc:mysql://localhost:3306/GER_FROTAS", usuario, senha);
                        // usuario e senha que foi cadastrado no banco
                        //jdbc:mysql://localhost:3306/?user=root
                        
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Erro ao conectar:  \n" + e);
			throw new RuntimeException(e);
		}
            

            

	}

            

    
}
