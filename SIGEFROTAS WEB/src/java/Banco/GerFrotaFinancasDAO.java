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
public class GerFrotaFinancasDAO {
    
    private Connection conexao;
    
    public GerFrotaFinancasDAO () {
        
        this.conexao = new ConnectionFactory().getConnection("root", "root1234");
    
    }
    
        public void insert(GerFrotaFinancasDAO financas){
        String sql = "insert into ger_frota_financas (CD_FINANCA, VALOR_MULTA, VALOR_MANUTE, VALOR_VIAGEM, CD_SEGURO_FINANCA, CD_PECA_FINANCA, CD_VIAGEM_FINANCA, CD_MANUTE_FINANCA, CD_MULTA_FINANCA)";
        
        try {
			PreparedStatement stmt = conexao.prepareStatement(sql);

			stmt.setString(1, financas.getCD_FINANCA());
			stmt.setString(2, financas.getVALOR_MULTA());
			stmt.setString(3, financas.getVALOR_MANUTE());
			stmt.setString(4, financas.getVALOR_VIAGEM());
                        stmt.setString(5, financas.getCD_SEGURO_FINANCA());
                        stmt.setString(6, financas.getCD_PECA_FINANCA());
                        stmt.setString(7, financas.getCD_VIAGEM_FINANCA());
                        stmt.setString(8, financas.getCD_MANUTE_FINANCA());
                        stmt.setString(9, financas.getCD_MULTA_FINANCA());
                        
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
    }
}

