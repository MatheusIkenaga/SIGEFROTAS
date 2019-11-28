/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banco;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Matheus
 */
public class AlugVeicManuteDAO {
    
private Connection conexao;
    
    public AlugVeicManuteDAO () {
        
        this.conexao = new ConnectionFactory().getConnection("root", "root1234");
    
    }
    
    public void insert(AlugVeicManuteDAO manute){
        String sql = "insert into alug_veic_manute (CD_MANUTE, CD_VEICULO_MANUTE, TP_MANUTE, VALOR_MANUTE)";
        
        try {
			PreparedStatement stmt = conexao.prepareStatement(sql);

			stmt.setString(1, manute.getCD_MANUTE());
			stmt.setString(2, manute.getCD_VEICULO_MANUTE());
			stmt.setString(3, manute.getTP_MANUTE());
			stmt.setString(4, manute.getVALOR_MANUTE());
                        
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
    }
    
}
