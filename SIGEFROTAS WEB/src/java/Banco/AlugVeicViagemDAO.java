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
public class AlugVeicViagemDAO {
    
private Connection conexao;
    
    public AlugVeicViagemDAO () {
        
        this.conexao = new ConnectionFactory().getConnection("root", "root1234");
    
    }
    
    public void insert(AlugVeicMultasDAO viagem){
        String sql = "insert into alug_veic_viagem (CD_VIAGEM, KM_VIAGEM, MOTIVO_VIAGEM, VALOR_VIAGEM, OBS_VIAGEM, CD_MOTORISTA_VIAGEM, CD_VEICULO_VIAGEM)";
        
        try {
			PreparedStatement stmt = conexao.prepareStatement(sql);

			stmt.setString(1, viagem.getCD_VIAGEM());
			stmt.setString(2, viagem.getKM_VIAGEM());
			stmt.setString(3, viagem.getMOTIVO_VIAGEM());
			stmt.setString(4, viagem.getVALOR_VIAGEM());
                        stmt.setString(5, viagem.getOBS_VIAGEM());
                        stmt.setString(6, viagem.getCD_MOTORISTA_VIAGEM());
                        stmt.setString(7, viagem.getCD_VEICULO_VIAGEM());
                        
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
    }
    
}
