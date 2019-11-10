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
public class GerFrotaAbasteDAO {
    private Connection conexao;
    
    public GerFrotaAbasteDAO () {
        
        this.conexao = new ConnectionFactory().getConnection("root", "root1234");
    
    }
    
    public void insert(GerFrotaAbasteDAO abastecimento){
        String sql = "insert into ger_frota_abaste (CD_ABASTE, CD_VEICULO_ABASTE, VALOR_ABASTE, TIPO_COMBUSTIVEL)";
        
        try {
			PreparedStatement stmt = conexao.prepareStatement(sql);

			stmt.setString(1, abastecimento.getCD_ABASTE());
			stmt.setString(2, abastecimento.getCD_VEICULO_ABASTE());
			stmt.setString(3, abastecimento.getVALOR_ABASTE());
                        stmt.setString(4, abastecimento.getTIPO_COMBUSTIVEL());
                        
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
    }
    
}
