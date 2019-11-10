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
public class VeiculoDAO {
    
private Connection conexao;
    
    public VeiculoDAO () {
        
        this.conexao = new ConnectionFactory().getConnection("root", "root1234");
    
    }
    
    public void insert(VeiculoDAO veiculo){
        String sql = "insert into veiculo (CD_VEICULO, MARCA_VEICULO, COR_VEICULO, ANO_VEICULO, MODELO_VEICULO, TIPO_VEICULO, HODOM_VEICULO, PLACA_VEICULO, STATUS_VEICULO, MANUTENCAO_VEICULO, OBS_VEICULO, SEGURO_VEICULO)";
        
        try {
			PreparedStatement stmt = conexao.prepareStatement(sql);

			stmt.setString(1, veiculo.getCD_VEICULO());
                        stmt.setString(2, veiculo.getMARCA_VEICULO());
                        stmt.setString(3, veiculo.getCOR_VEICULO());
                        stmt.setString(4, veiculo.getANO_VEICULO());
                        stmt.setString(5, veiculo.getMODELO_VEICULO());
			stmt.setString(6, veiculo.getTIPO_VEICULO());
                        stmt.setString(7, veiculo.getHODOM_VEICULO());
			stmt.setString(8, veiculo.getPLACA_VEICULO());
			stmt.setString(9, veiculo.getSTATUS_VEICULO());
                        stmt.setString(10, veiculo.getMANUTENCAO_VEICULO());
                        stmt.setString(11, veiculo.getOBS_VEICULO());
                        stmt.setString(12, veiculo.getSEGURO_VEICULO());
                        
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
    }
    
}