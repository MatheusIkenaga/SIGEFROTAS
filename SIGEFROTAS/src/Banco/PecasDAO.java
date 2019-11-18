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
    
    public void insert(Pecas pecas){
        String sql = "insert into pecas (CD_PECA, "
                + "NOME_PECA, "
                + "QTD_PECA, "
                + "VALOR_PECA, "
                + "CD_FORNEC_PECA) "
                + "values (?,?,?,?,?)";
        
        try {
			PreparedStatement stmt = conexao.prepareStatement(sql);

			stmt.setString(1, Integer.toString(pecas.getCd_peca()));
			stmt.setString(2, pecas.getNome_peca());
			stmt.setString(3, Integer.toString(pecas.getQtd_peca()));
			stmt.setString(4, Float.toString(pecas.getValor_peca()));
                        stmt.setString(5, Integer.toString(pecas.getCd_fornec_peca()));
                        
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
    }
    
}

