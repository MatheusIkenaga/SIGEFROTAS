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
public class GerFrotaSinistroDAO {
    
    private Connection conexao;
    
    public GerFrotaSinistroDAO () {
        
        this.conexao = new ConnectionFactory().getConnection("root", "root1234");
    
    }
    
    public void insert(GerFrotaSinistroDAO sinistro){
        String sql = "insert into ger_frota_sinistro (CD_SINISTRO, CD_VEICULO_SINISTRO, CD_MOTORISTA_SINISTRO, CD_SEGURO_SINISTRO)";
        
        try {
			PreparedStatement stmt = conexao.prepareStatement(sql);

			stmt.setString(1, sinistro.getCD_SINISTRO());
			stmt.setString(2, sinistro.getCD_VEICULO_SINISTRO());
			stmt.setString(3, sinistro.getCD_MOTORISTA_SINISTRO());
			stmt.setString(4, sinistro.getCD_SEGURO_SINISTRO());
                        
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
    }
    
}

