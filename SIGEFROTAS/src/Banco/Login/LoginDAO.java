/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banco.Login;

import Banco.ConnectionFactory;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
/**
 *
 * @author Matheus
 */
public class LoginDAO {

private Connection conexao;
    
    public LoginDAO () {
        
        this.conexao = new ConnectionFactory().getConnection("root", "root1234");
    
    }
    
    public void insert(Login login){
        String sql = "insert into login (ID_LOGIN, LOGIN_USER, PW_USER, EMAIL_USER, DT_NASC_USER)";
        
        try {
			PreparedStatement stmt = conexao.prepareStatement(sql);

			stmt.setString(1, Integer.toString(login.getID_LOGIN()));
			stmt.setString(2, login.getLOGIN_USER());
			stmt.setString(3, login.getPW_USER());
                        stmt.setString(4, login.getEMAIL_USER());
			stmt.setDate(5, (Date) login.getDT_NASC_USER());
      
                        
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
    }
    
    public boolean validaUser(String login, String senha){
        String sql = "Select * from LOGIN where LOGIN_USER = ? and PW_USER= ?";
        try {
		PreparedStatement stmt = conexao.prepareStatement(sql);
        	stmt.setString(1, login);
		stmt.setString(2, senha);
                 
			stmt.execute();
			stmt.close();
			JOptionPane.showMessageDialog(null, "Validação de Acesso ACEITA !");
                        return true;
		} catch (SQLException e) {
                    System.out.println(e);
			throw new RuntimeException(e);
                        
		}
    }
    
}
