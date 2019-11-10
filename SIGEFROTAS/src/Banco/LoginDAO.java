/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banco;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Matheus
 */
public class LoginDAO {

private Connection conexao;
    
    public LoginDAO () {
        
        this.conexao = new ConnectionFactory().getConnection("root", "root1234");
    
    }
    
    public void insert(LoginDAO login){
        String sql = "insert into login (ID_LOGIN, USER_LOGIN, PASSWORD_LOGIN, EMAIL_LOGIN, DATA_NASC)";
        
        try {
			PreparedStatement stmt = conexao.prepareStatement(sql);

			stmt.setString(1, login.getID_LOGIN());
			stmt.setString(2, login.getUSER_LOGIN());
			stmt.setString(3, login.getPASSWORD_LOGIN());
                        stmt.setString(4, login.getEMAIL_LOGIN());
			stmt.setDate(5, (Date) login.getDATA_NASC());
      
                        
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
    }
    
}
