/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banco;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Matheus
 */
public class GerFrotaMultasDAO {
    
private Connection conexao;
    
    public GerFrotaMultasDAO () {
        
        this.conexao = new ConnectionFactory().getConnection("root", "root1234");
    
    }
    
    public void insert(GerFrotaMultasDAO multas){
        String sql = "insert into ger_frota_multas (CD_MULTA, CD_VEICULO_MULTA, CD_MOTORISTA_MULTA, DT_MULTA, LOCAL_MULTA, VALOR_MULTA)";
        
        try {
			PreparedStatement stmt = conexao.prepareStatement(sql);

			stmt.setString(1, multas.getCD_MULTA());
			stmt.setString(2, multas.getCD_VEICULO_MULTA());
			stmt.setString(3, multas.getCD_MOTORISTA_MULTA());
			stmt.setDate(4, (Date) multas.getDT_MULTA());
                        stmt.setString(5, multas.getLOCAL_MULTA());
                        stmt.setString(6, multas.getVALOR_MULTA());
                        
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
    }
    
}