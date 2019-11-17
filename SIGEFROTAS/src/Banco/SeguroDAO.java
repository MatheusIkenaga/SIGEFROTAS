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
public class SeguroDAO {
    
    private Connection conexao;
    
    public SeguroDAO () {
        
        this.conexao = new ConnectionFactory().getConnection("root", "root1234");
    
    }
    
    public void insert(Seguro seguro){
        String sql = "insert into seguro (CD_SEGURO, CD_VEIC_SEGURO, VALOR_SEGURO) values (?,?,?)";
        
        try {
			PreparedStatement stmt = conexao.prepareStatement(sql);

			stmt.setString(1, Integer.toString(seguro.getCd_seguro()));
			stmt.setString(2, Integer.toString(seguro.getCd_veiculo_seguro()));
			stmt.setString(3, Float.toString(seguro.getValor_seguro()));
			
                        
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
    }
    
}
