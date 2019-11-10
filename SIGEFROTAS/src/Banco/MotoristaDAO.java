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
public class MotoristaDAO {
    
private Connection conexao;
    
    public MotoristaDAO () {
        
        this.conexao = new ConnectionFactory().getConnection("root", "root1234");
    
    }
    
    public void insert(MotoristaDAO motorista){
        String sql = "insert into motorista (CD_MOTORISTA, NM_MOTORISTA, DT_NASC_MOTORISTA, CPF_MOTORISTA, RG_MOTORISTA, CNH_MOTORISTA, VAL_CNH_MOTORISTA, OBS_MOTORISTA)";
        
        try {
			PreparedStatement stmt = conexao.prepareStatement(sql);

			stmt.setString(1, motorista.getCD_MOTORISTA());
			stmt.setString(2, motorista.getNM_MOTORISTA());
                        stmt.setDate(3, (Date) motorista.getDT_NASC_MOTORISTA());
			stmt.setString(4, motorista.getCPF_MOTORISTA());
                        stmt.setString(5, motorista.getRG_MOTORISTA());
                        stmt.setString(6, motorista.getCNH_MOTORISTA());
			stmt.setDate(7, (Date) motorista.getVAL_CNH_MOTORISTA());
                        stmt.setString(8, motorista.getOBS_MOTORISTA());
      
                        
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
    }
    
}
