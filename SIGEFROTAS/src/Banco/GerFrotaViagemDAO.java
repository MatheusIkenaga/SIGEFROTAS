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
public class GerFrotaViagemDAO {
    
private Connection conexao;
    
    public GerFrotaViagemDAO () {
        
        this.conexao = new ConnectionFactory().getConnection("root", "root1234");
    
    }
    
    public void insert(GerFrotaViagemDAO viagem){
        String sql = "insert into ger_frota_viagem (CD_VIAGEM, ORIGEM_VIAGEM, EST_ORIGEM_VIAGEM, DEST_VIAGEM, EST_DEST_VIAGEM, KM_VIAGEM, TIPO_VIAGEM, MOTIVO_VIAGEM, VALOR_VIAGEM, OBS_VIAGEM, CD_MOTORISTA_VIAGEM, CD_VEICULO_VIAGEM)";
        
        try {
			PreparedStatement stmt = conexao.prepareStatement(sql);
/*
			stmt.setString(1, viagem.getCD_VIAGEM());
                        stmt.setString(2, viagem.getORIGEM_VIAGEM());
                        stmt.setString(3, viagem.getEST_ORIGEM_VIAGEM());
                        stmt.setString(4, viagem.getDEST_VIAGEM());
                        stmt.setString(5, viagem.getEST_DEST_VIAGEM());
			stmt.setString(6, viagem.getKM_VIAGEM());
                        stmt.setString(7, viagem.getTIPO_VIAGEM());
			stmt.setString(8, viagem.getMOTIVO_VIAGEM());
			stmt.setString(9, viagem.getVALOR_VIAGEM());
                        stmt.setString(10, viagem.getOBS_VIAGEM());
                        stmt.setString(11, viagem.getCD_MOTORISTA_VIAGEM());
                        stmt.setString(12, viagem.getCD_VEICULO_VIAGEM());
                        */
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
    }
    
}
