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
public class GerFrotaBoDAO {
    
   private Connection conexao;
    
    public GerFrotaBoDAO () {
        
        this.conexao = new ConnectionFactory().getConnection("root", "root1234");
    
    }
    
    public void insert(GerFrotaBoDAO bo){
        String sql = "insert into ger_frota_bo (CD_BO, CD_VEICULO_BO, CD_MOTORISTA_BO, EST_BO, CIDADE_BO)";
        
        try {
			PreparedStatement stmt = conexao.prepareStatement(sql);

			stmt.setString(1, bo.getCD_BO());
			stmt.setString(2, bo.getCD_VEICULO_BO());
			stmt.setString(3, bo.getCD_MOTORISTA_BO());
			stmt.setString(4, bo.getEST_BO());
                        stmt.setString(5, bo.getCIDADE_BO());
                        
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
    }
    
}

