/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banco;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class ConnectionFactory {

	public Connection getConnection(String usuario, String senha) {
            return null;  //SÓ PRA NAO DAR PAU
            //classe Connection é do pacote java SQL
            
            /*

		try {

			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			return DriverManager.getConnection("jdbc:mysql://localhost:3306/registro", usuario, senha);
                        // usuario e senha que foi cadastrado no banco
                        //jdbc:mysql://localhost:3306/?user=root
                        
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Erro ao conectar:  \n" + e);
			throw new RuntimeException(e);
		}

            */

	}

            

    
}
