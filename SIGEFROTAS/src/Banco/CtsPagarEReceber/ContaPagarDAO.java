/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banco.CtsPagarEReceber;

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
public class ContaPagarDAO {
    
private Connection conexao;
String dt;
    
    public ContaPagarDAO () {
        
        this.conexao = new ConnectionFactory().getConnection("root", "root1234");
    
    }
    
    public String selectVeicConta(int cd){
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String resultado = null;
        
        try{
            
            stmt = this.conexao.prepareStatement("select veic.cd_veiculo, "
                    + "veic.modelo_veiculo, veic.placa_veiculo from CONTAS_PAGAR v "
                    + "left join veiculo veic on veic.cd_veiculo = v.cd_veic_conta "
                    + "where v.cd_conta="+ cd);
            rs = stmt.executeQuery();
            if(rs.next()){
            resultado = (rs.getString("CD_VEICULO")+"- "+rs.getString("MODELO_VEICULO")+" ("+rs.getString("PLACA_VEICULO")+")");
            }
            rs.close();
            stmt.close();
            System.out.println(resultado);
        
        }catch(Exception e){
            System.out.println(e);
            JOptionPane.showMessageDialog(null,e);
        }
        return resultado;
        
    }
    
    public void insert(ContaPagar contaPagar){
        String sql = "insert into CONTAS_PAGAR "
            //+ "(CD_MOTORISTA, "
            + "(TOTAL_CONTA, "
            + "TOTAL_PAGO, "
            + "STATUS_CONTA, "
            + "DT_PAGTO, "
            + "CATEGORIA, "
            + "CD_VEIC_CONTA, "
            + "OBS_CONTA) "
            + "values (?,?,?,?,?,?,?)";
        
        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);

            stmt.setFloat(1, contaPagar.getTOTAL_CONTA());
            stmt.setFloat(2, contaPagar.getTOTAL_PAGO());
            stmt.setString(3, contaPagar.getSTATUS_CONTA());
            stmt.setString(4, contaPagar.getDT_PAGTO());//   OLHAR DATA
            stmt.setString(5, contaPagar.getCATEGORIA());
            stmt.setInt(6, contaPagar.getCD_VEIC_CONTA());
            stmt.setString(7,contaPagar.getOBS_CONTA());
            stmt.execute();
            stmt.close();
            JOptionPane.showMessageDialog(null, "Gravado com sucesso ! ");
	} catch (SQLException e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, e);
            throw new RuntimeException(e);
        }
    }    
    
    public List<ContaPagar> selectConsulta(){
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            List<ContaPagar> contasPagar = new ArrayList<ContaPagar>();
            stmt = this.conexao.prepareStatement("select * from CONTAS_PAGAR order by CD_CONTA");
				
            rs = stmt.executeQuery();
                                
                                
            while (rs.next()) {
		ContaPagar contaPagar = new ContaPagar();
                contaPagar.setCD_CONTA(rs.getInt("CD_CONTA"));
		contaPagar.setTOTAL_CONTA(rs.getFloat("TOTAL_CONTA"));
		contaPagar.setTOTAL_PAGO(rs.getFloat("TOTAL_PAGO"));
                contaPagar.setSTATUS_CONTA(rs.getString("STATUS_CONTA"));
                contaPagar.setDT_PAGTO(rs.getString("DT_PAGTO"));
                contaPagar.setCATEGORIA(rs.getString("CATEGORIA"));
                contaPagar.setCD_VEIC_CONTA(rs.getInt("CD_VEIC_CONTA"));
                contaPagar.setOBS_CONTA(rs.getString("OBS_CONTA"));
                contaPagar.add(contasPagar);
            }
            rs.close();
            stmt.close();
                                
            return contasPagar;
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
            throw new RuntimeException(e);
        
        }
    }
    
    public void update(ContaPagar contaPagar){
        String sql = "update CONTAS_PAGAR set "
                + "TOTAL_CONTA=?, "
                + "TOTAL_PAGO=?, "
                + "STATUS_CONTA=? ,"
                + "DT_PAGTO=? ,"
                + "CATEGORIA=?,"
                + "CD_VEIC_CONTA=?,"
                + "OBS_CONTA=? where CD_CONTA=?";

	try {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            
            stmt.setFloat(1, contaPagar.getTOTAL_CONTA());
            stmt.setFloat(2, contaPagar.getTOTAL_PAGO());
            stmt.setString(3, contaPagar.getSTATUS_CONTA());
            stmt.setString(4, contaPagar.getDT_PAGTO());
            stmt.setString(5, contaPagar.getCATEGORIA());
            stmt.setInt(6, contaPagar.getCD_VEIC_CONTA());
            stmt.setString(7, contaPagar.getOBS_CONTA());
            stmt.setInt(8, contaPagar.getCD_CONTA());
            stmt.execute();
            stmt.close();
            JOptionPane.showMessageDialog(null, "Registro alterado com sucesso !");
	} catch (SQLException e) {
            throw new RuntimeException(e);
	}
    
    }

public void delete(ContaPagar contaPagar) {
	try {
            PreparedStatement stmt = conexao.prepareStatement("delete from CONTAS_PAGAR where CD_CONTA=?");
            stmt.setInt(1, contaPagar.getCD_CONTA());
            stmt.execute();
            stmt.close();
            JOptionPane.showMessageDialog(null, "Registro excluído com sucesso !");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        
    }
    
    
    
}
