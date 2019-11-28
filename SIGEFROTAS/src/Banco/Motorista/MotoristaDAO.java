/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banco.Motorista;

import Banco.ConnectionFactory;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author Matheus
 */
public class MotoristaDAO {
    
private Connection conexao;
String dt;
    
    public MotoristaDAO () {
        
        this.conexao = new ConnectionFactory().getConnection("root", "root1234");
    
    }
    
    
    
    public String selectViagem(int cd, String retorno){
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String resultado = null;
        
        try{
            
            stmt = this.conexao.prepareStatement("select * from MOTORISTA where CD_MOTORISTA="+cd);
            rs = stmt.executeQuery();
            if(rs.next()){
            resultado = (rs.getString(retorno));
            }
            rs.close();
            stmt.close();
        
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        return resultado;
        
    }
    
    
    
    public void preencheCB(JComboBox cb){
        try{
            String sql= "select * from MOTORISTA order by NM_MOTORISTA";
            PreparedStatement stmt = conexao.prepareStatement(sql);
            ResultSet rs=stmt.executeQuery();
            
            while(rs.next()){
                String resultado = (rs.getString("CD_MOTORISTA")+"-"+ rs.getString("NM_MOTORISTA")+" ("+rs.getString("CPF_MOTORISTA")+")");
                cb.addItem(resultado);
            }
                
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }
    
    
    public void insert(Motorista motorista){
        String sql = "insert into MOTORISTA "
            //+ "(CD_MOTORISTA, "
            + "(NM_MOTORISTA, "
            + "TEL_MOTORISTA, "
            + "CPF_MOTORISTA, "
            + "RG_MOTORISTA, "
            + "DT_NASC_MOTORISTA, "
            + "SX_MOTORISTA, "
            + "CNH_MOTORISTA, "
            + "VAL_CNH_MOTORISTA, "
            + "OBS_MOTORISTA) "
            + "values (?,?,?,?,?,?,?,?,?)";
        
        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);

            stmt.setString(1, motorista.getNm_motorista());
            stmt.setString(2, motorista.getTELEFONE_motorista());
            stmt.setString(3, motorista.getCpf_motorista());
            stmt.setString(4, motorista.getRg_motorista());
            stmt.setString(5, motorista.getDT_NASC_MOTORISTA());
            stmt.setString(6,motorista.getSX_MOTORISTA());
            stmt.setString(7, motorista.getCnh_motorista());
            stmt.setString(8, motorista.getVAL_CNH_MOTORISTA());
            stmt.setString(9, motorista.getObs_motorista());
            stmt.execute();
            stmt.close();
            JOptionPane.showMessageDialog(null, "Gravado com sucesso ! ");
	} catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            throw new RuntimeException(e);
        }
    }    
    
    public List<Motorista> selectConsulta(){
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            List<Motorista> motoristas = new ArrayList<Motorista>();
            stmt = this.conexao.prepareStatement("select * from MOTORISTA order by CD_MOTORISTA");
				
            rs = stmt.executeQuery();
                                
                                
            while (rs.next()) {
		Motorista motorista = new Motorista();
                motorista.setCD_MOTORISTA(rs.getInt("CD_MOTORISTA"));
		motorista.setNm_motorista(rs.getString("NM_MOTORISTA"));
		motorista.setTELEFONE_motorista(rs.getString("TEL_MOTORISTA"));
                motorista.setCpf_motorista(rs.getString("CPF_MOTORISTA"));
                motorista.setRg_motorista(rs.getString("RG_MOTORISTA"));
                motorista.setDT_NASC_MOTORISTA(rs.getString("DT_NASC_MOTORISTA"));
                motorista.setSX_MOTORISTA(rs.getString("SX_MOTORISTA"));
                motorista.setCnh_motorista(rs.getString("CNH_MOTORISTA"));
                motorista.setVAL_CNH_MOTORISTA(rs.getString("VAL_CNH_MOTORISTA"));
                motorista.setObs_motorista(rs.getString("OBS_MOTORISTA"));
                motoristas.add(motorista);
            }
            rs.close();
            stmt.close();
                                
            return motoristas;
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
            throw new RuntimeException(e);
        
        }
    }
    
    public void update(Motorista motorista){
        String sql = "update MOTORISTA set "
                + "NM_MOTORISTA=?, "
                + "TEL_MOTORISTA=?, "
                + "CPF_MOTORISTA=? , "
                + "RG_MOTORISTA=?,"
                + "DT_NASC_MOTORISTA=?,"
                + "SX_MOTORISTA=?,"
                + "CNH_MOTORISTA=?,"
                + "VAL_CNH_MOTORISTA=?,"
                + "OBS_MOTORISTA=? where CD_MOTORISTA=?";

	try {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            
            stmt.setString(1, motorista.getNm_motorista());
            stmt.setString(2, motorista.getTELEFONE_motorista());
            stmt.setString(3, motorista.getCpf_motorista());
            stmt.setString(4, motorista.getRg_motorista());
            stmt.setString(5, motorista.getDT_NASC_MOTORISTA());
            stmt.setString(6,motorista.getSX_MOTORISTA());
            stmt.setString(7, motorista.getCnh_motorista());
            stmt.setString(8, motorista.getVAL_CNH_MOTORISTA());
            stmt.setString(9, motorista.getObs_motorista());
            stmt.setInt(10, motorista.getCD_MOTORISTA());
            stmt.execute();
            stmt.close();
            JOptionPane.showMessageDialog(null, "Registro alterado com sucesso !");
	} catch (SQLException e) {
            throw new RuntimeException(e);
	}
    
    }

public void delete(Motorista motorista) {
	try {
            PreparedStatement stmt = conexao.prepareStatement("delete from MOTORISTA where CD_MOTORISTA=?");
            stmt.setInt(1, motorista.getCD_MOTORISTA());
            stmt.execute();
            stmt.close();
            JOptionPane.showMessageDialog(null, "Registro excluído com sucesso !");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        
    }
    
    
    
}
