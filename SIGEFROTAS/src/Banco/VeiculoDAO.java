/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banco;

import Telas.CadastroVeiculo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComboBox;
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
    
    public void preencheCB(JComboBox cb){
        try{
            String sql= "select * from VEICULO order by MODELO_VEICULO";
            PreparedStatement stmt = conexao.prepareStatement(sql);
            ResultSet rs=stmt.executeQuery();
            
            while(rs.next()){
                String resultado = (rs.getString("MODELO_VEICULO")+ " | " + rs.getString("PLACA_VEICULO"));
                cb.addItem(resultado);
            }
                
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    
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
                    System.out.println(e);
                    throw new RuntimeException(e);
		}
    }
    
    public List<Veiculo> selectConsulta(){
        PreparedStatement stmt = null;
		ResultSet rs = null;

		try {
			List<Veiculo> veiculos = new ArrayList<Veiculo>();
                        
                        
                        //stmt = this.connection.prepareStatement("select * from contato where nome=?");
                        stmt = this.conexao.prepareStatement("select * from veiculo order by CD_VEICULO");
			rs = stmt.executeQuery();
                                
                                while (rs.next()) {
                                // RS.NEXT () é para enquanto houver registros na tabela. faá
                                
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
                        private String NUM_APOLICE_VEICULO;	
                        private String OBS_VEICULO;
                        
                        */
                                
					Veiculo veiculo = new Veiculo();
                                        veiculo.setCD_VEICULO(rs.getInt("CD_VEICULO"));
					veiculo.setMarca_veiculo(rs.getString("MARCA_VEICULO"));
                                        veiculo.setModelo_veiculo(rs.getString("MODELO_VEICULO"));
                                        veiculo.setCor_veiculo(rs.getString("COR_VEICULO"));
                                        veiculo.setPlaca_veiculo(rs.getString("PLACA_VEICULO"));
                                        veiculo.setHODOM_VEICULO(rs.getInt("HODOM_VEICULO"));
                                        veiculo.setAno_veiculo(rs.getInt("ANO_VEICULO"));
                                        veiculo.setAno_modelo_veiculo(rs.getInt("ANO_MOD_VEICULO"));
                                        veiculo.setTipo_veiculo(rs.getString("TIPO_VEICULO"));
                                        veiculo.setDISPO_VEICULO(rs.getString("DISPO_VEICULO"));
                                        veiculo.setSeguro_veiculo(rs.getString("SEGURO_VEICULO"));
                                        veiculo.setNUM_APOLICE_VEICULO(rs.getString("NUM_APOLICE_VEICULO"));
                                        veiculo.setObs_veiculo(rs.getString("OBS_VEICULO"));

					veiculos.add(veiculo);
				}
				rs.close();
				stmt.close();
                                
                            return veiculos;
                        
                }
                catch(SQLException e) {
                    //System.out.println(e);
                    System.out.println(e);
			throw new RuntimeException();
		}
        
    }
    
    public void update(Veiculo veiculo){
        String sql = "update VEICULO set "
                + "MARCA_VEICULO=?, "
                + "MODELO_VEICULO=?, "
                + "COR_VEICULO=? , "
                + "PLACA_VEICULO=?,"
                + "HODOM_VEICULO=?,"
                + "ANO_VEICULO=?,"
                + "ANO_MOD_VEICULO=?,"
                + "TIPO_VEICULO=?,"
                + "DISPO_VEICULO=?,"
                + "SEGURO_VEICULO=?,"
                + "NUM_APOLICE_VEICULO=?,"
                + "OBS_VEICULO=? where CD_VEICULO=?";

		try {
			PreparedStatement stmt = conexao.prepareStatement(sql);
			stmt.setString(1, veiculo.getMarca_veiculo());
			stmt.setString(2, veiculo.getModelo_veiculo());
			stmt.setString(3, veiculo.getCor_veiculo());
			stmt.setString(4, veiculo.getPlaca_veiculo());
                        stmt.setInt(5,veiculo.getHODOM_VEICULO());
                        stmt.setInt(6,veiculo.getAno_veiculo());
                        stmt.setInt(7,veiculo.getAno_modelo_veiculo());
                        stmt.setString(8,veiculo.getTipo_veiculo());
                        stmt.setString(9,veiculo.getDISPO_VEICULO());
                        stmt.setString(10,veiculo.getSeguro_veiculo());
			stmt.setString(11, veiculo.getNUM_APOLICE_VEICULO());
                        stmt.setString(12,veiculo.getObs_veiculo());
                        stmt.setInt(13,veiculo.getCD_VEICULO());
                        
			stmt.execute();
			stmt.close();
			JOptionPane.showMessageDialog(null, "Registro alterado com sucesso !");
		} catch (SQLException e) {
                    System.out.println(e);
			throw new RuntimeException(e);
		}
    
    }
    
    public void delete(Veiculo veiculo) {
	try {
            PreparedStatement stmt = conexao.prepareStatement("delete from VEICULO where CD_VEICULO=?");
            stmt.setInt(1, veiculo.getCD_VEICULO());
            stmt.execute();
            stmt.close();
            JOptionPane.showMessageDialog(null, "Registro excluído com sucesso !");
        } catch (SQLException e) {
            System.out.println(e);
            throw new RuntimeException(e);
        }
        
    }
            
    
}