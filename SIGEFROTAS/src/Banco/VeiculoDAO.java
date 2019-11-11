/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banco;

import Telas.CadastroVeiculo;
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
    
    public void insert(Veiculo veiculo){
        String sql = "insert into veiculo (CD_VEICULO, MARCA_VEICULO, COR_VEICULO, ANO_VEICULO, MODELO_VEICULO, TIPO_VEICULO, HODOM_VEICULO, PLACA_VEICULO, STATUS_VEICULO, MANUTENCAO_VEICULO, OBS_VEICULO, SEGURO_VEICULO)";
        
        try {
			PreparedStatement stmt = conexao.prepareStatement(sql);

			stmt.setString(1, Integer.toString(veiculo.getCD_VEICULO()));
                        stmt.setString(2, veiculo.getMarca_veiculo());
                        stmt.setString(3, veiculo.getCor_veiculo());
                        stmt.setString(4, Integer.toString(veiculo.getAno_veiculo()));
                        stmt.setString(5, veiculo.getModelo_veiculo());
			stmt.setString(6, veiculo.getTipo_veiculo());
                        stmt.setString(7, Integer.toString(veiculo.getHODOM_VEICULO()));
			stmt.setString(8, veiculo.getPlaca_veiculo());
			stmt.setString(9, Integer.toString(veiculo.getStatus_veiculo()));
                        stmt.setString(10, Integer.toString(veiculo.getManutencao_veiculo()));
                        stmt.setString(11, veiculo.getObs_veiculo());
                        stmt.setString(12, Integer.toString(veiculo.getSeguro_veiculo()));
                        
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
    }
    
}