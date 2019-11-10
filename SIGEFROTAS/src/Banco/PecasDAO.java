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
public class PecasDAO {
    
    private Connection conexao;
    
    public PecasDAO () {
        
        this.conexao = new ConnectionFactory().getConnection("root", "root1234");
    
    }
    
    public void insert(PecasDAO pecas){
        String sql = "insert into pecas (CD_PECA, NOME_PECA, QTD_PECA, VALOR_PECA, CD_FORNEC_PECA)";
        
        try {
			PreparedStatement stmt = conexao.prepareStatement(sql);

			stmt.setString(1, pecas.getCD_PECA());
			stmt.setString(2, pecas.getNOME_PECA());
			stmt.setString(3, pecas.getQTD_PECA());
			stmt.setString(4, pecas.getVALOR_PECA());
                        stmt.setString(5, pecas.getCD_FORNEC_PECA());
                        
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
    }
    
}

