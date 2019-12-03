/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banco.Login;

import Banco.ConnectionFactory;
import Telas.Modulos.TelaInicial;
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
        String sql = "insert into login (LOGIN_USER, PW_USER, EMAIL_USER, FRASE_USER) values (?,?,?,?)";
        
        try {
			PreparedStatement stmt = conexao.prepareStatement(sql);
			stmt.setString(1, login.getLOGIN_USER());
			stmt.setString(2, login.getPW_USER());
                        stmt.setString(3, login.getEMAIL_USER());
			stmt.setString(4, login.getFRASE_USER());
      
                        
			stmt.execute();
			stmt.close();
                        JOptionPane.showMessageDialog(null, "Cadastro efetuado com Sucesso!");
		} catch (SQLException e) {
                    System.out.println(e);
                    throw new RuntimeException(e);
		}
    }
    
    public boolean validaUser(String login, String senha){
        PreparedStatement stmt = null;
	ResultSet rs = null;
        
        try {
            stmt = this.conexao.prepareStatement("Select * from LOGIN where LOGIN_USER = '" +login+ "'");
            rs = stmt.executeQuery();
            if(rs.first()){
                if(rs.getString("PW_USER").equals(senha)){
                    System.out.println("Login OK");
                    System.out.println("Senha OK");
                    return true;
                    
                }else{
                    System.out.println("Senha Incorreta");
                    return false;
                }
            }else{
                System.out.println("Login Incorreto");
                return false;
            }
            
            
        } catch (SQLException e) {
            System.out.println(e);
            throw new RuntimeException(e);
        }
    }
    
    public String esqueceuSenha(String login){
        PreparedStatement stmt = null;
	ResultSet rs = null;
        String resultado = null;
        
        try {
            stmt = this.conexao.prepareStatement("Select * from LOGIN where LOGIN_USER = '" +login+ "'");
            rs = stmt.executeQuery();
            if(rs.first()){
                resultado = rs.getString("FRASE_USER");
                
            }else{
                System.out.println("Login Incorreto");
                JOptionPane.showMessageDialog(null, "Login não encontrado");
            }
            return resultado;
        } catch (SQLException e) {
            System.out.println(e);
            throw new RuntimeException(e);
        }
        
    }
    
}
