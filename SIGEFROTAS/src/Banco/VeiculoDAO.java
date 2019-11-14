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
import javax.swing.JOptionPane;

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
        String sql = "insert into veiculo "  
                //+ "(CD_VEICULO, "
                + "(MARCA_VEICULO, "
                + "MODELO_VEICULO,"
                + "COR_VEICULO,"
                + "PLACA_VEICULO, "
                + "HODOM_VEICULO, "
                + "ANO_VEICULO,"
                + "ANO_MOD_VEICULO, "
                + "TIPO_VEICULO,DISPO_VEICULO, "
                + "SEGURO_VEICULO, "
                + "NUM_APOLICE_VEICULO ,"
                + "OBS_VEICULO) "
                + "values (?,?,?,?,?,?,?,?,?,?,?,?)";
        
        try {
			PreparedStatement stmt = conexao.prepareStatement(sql);
                        
                        /*
                        private int CD_VEICULO;
                        private String MARCA_VEICULO;
                        private String MODELO_VEICULO;
                        private String COR_VEICULO;
                        private String PLACA_VEICULO;
                        private int HODOM_VEICULO;
                        private int ANO_VEICULO;
                        private int ANO_MOD_VEICULO;
                        private String TIPO_VEICULO;
                        private String DISPO_VEICULO;
                        private String SEGURO_VEICULO;
                        private int NUM_APOLICE_VEICULO;	
                        private String OBS_VEICULO;
                        
                        */
                        
                        /*
                        
                        SEM AUTO INCREMENT NO BANCO
                        

			stmt.setString(1, Integer.toString(veiculo.getCD_VEICULO()));
                        stmt.setString(2, veiculo.getMarca_veiculo());
                        stmt.setString(3, veiculo.getModelo_veiculo());
                        stmt.setString(4, veiculo.getCor_veiculo());
                        stmt.setString(5, veiculo.getPlaca_veiculo());
                        stmt.setString(6, Integer.toString(veiculo.getHODOM_VEICULO()));
                        stmt.setString(7, Integer.toString(veiculo.getAno_veiculo()));
                        stmt.setInt(8, veiculo.getAno_modelo_veiculo());
			stmt.setString(9, veiculo.getTipo_veiculo());
                        stmt.setString(10, veiculo.getDISPO_VEICULO());
                        stmt.setString(11, veiculo.getSeguro_veiculo());
                        stmt.setString(12, veiculo.getNUM_APOLICE_VEICULO());
                        stmt.setString(13, veiculo.getObs_veiculo());
                        */
                        
                        stmt.setString(1, veiculo.getMarca_veiculo());
                        stmt.setString(2, veiculo.getModelo_veiculo());
                        stmt.setString(3, veiculo.getCor_veiculo());
                        stmt.setString(4, veiculo.getPlaca_veiculo());
                        stmt.setString(5, Integer.toString(veiculo.getHODOM_VEICULO()));
                        stmt.setString(6, Integer.toString(veiculo.getAno_veiculo()));
                        stmt.setString(7, Integer.toString(veiculo.getAno_modelo_veiculo()));
			stmt.setString(8, veiculo.getTipo_veiculo());
                        stmt.setString(9, veiculo.getDISPO_VEICULO());
                        stmt.setString(10, veiculo.getSeguro_veiculo());
                        stmt.setString(11, veiculo.getNUM_APOLICE_VEICULO());
                        stmt.setString(12, veiculo.getObs_veiculo());
                        
                        
			stmt.execute();
			stmt.close();
                        JOptionPane.showMessageDialog(null, "Gravado com sucesso ! ");
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
    }
    
}