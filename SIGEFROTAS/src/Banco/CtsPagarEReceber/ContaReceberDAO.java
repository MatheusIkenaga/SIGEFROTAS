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
public class ContaReceberDAO {
    
private Connection conexao;
String dt;
    
    public ContaReceberDAO () {
        
        this.conexao = new ConnectionFactory().getConnection("root", "root1234");
    
    }
    
    public String selectVeicConta(int cd){
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String resultado = null;
        
        try{
            
            stmt = this.conexao.prepareStatement("select veic.cd_veiculo, "
                    + "veic.modelo_veiculo, veic.placa_veiculo from CONTAS_RECEBER v "
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
    
    public void insert(ContaReceber contaReceber){
        String sql = "insert into CONTAS_RECEBER "
            //+ "(CD_MOTORISTA, "
            + "(TOTAL_CONTA, "
            + "TOTAL_RECEBIDO, "
            + "STATUS_CONTA, "
            + "DT_RECEBIDO, "
            + "CATEGORIA, "
            + "CD_VEIC_CONTA, "
            + "OBS_CONTA) "
            + "values (?,?,?,?,?,?,?)";
        
        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);

            stmt.setFloat(1, contaReceber.getTOTAL_CONTA());
            stmt.setFloat(2, contaReceber.getTOTAL_RECEBIDO());
            stmt.setString(3, contaReceber.getSTATUS_CONTA());
            stmt.setString(4, contaReceber.getDT_RECEBIDO());//   OLHAR DATA
            stmt.setString(5, contaReceber.getCATEGORIA());
            stmt.setInt(6, contaReceber.getCD_VEIC_CONTA());
            stmt.setString(7,contaReceber.getOBS_CONTA());
            System.out.println(stmt);
            stmt.execute();
            stmt.close();
            JOptionPane.showMessageDialog(null, "Gravado com sucesso ! ");
	} catch (SQLException e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, e);
            throw new RuntimeException(e);
        }
    }    
    
    public List<ContaReceber> selectConsulta(){
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            List<ContaReceber> contasReceber = new ArrayList<ContaReceber>();
            stmt = this.conexao.prepareStatement("select * from CONTAS_RECEBER order by CD_CONTA");
				
            rs = stmt.executeQuery();
                                
                                
            while (rs.next()) {
		ContaReceber contaReceber = new ContaReceber();
                contaReceber.setCD_CONTA(rs.getInt("CD_CONTA"));
		contaReceber.setTOTAL_CONTA(rs.getFloat("TOTAL_CONTA"));
		contaReceber.setTOTAL_RECEBIDO(rs.getFloat("TOTAL_RECEBIDO"));
                contaReceber.setSTATUS_CONTA(rs.getString("STATUS_CONTA"));
                contaReceber.setDT_RECEBIDO(rs.getString("DT_RECEBIDO"));
                contaReceber.setCATEGORIA(rs.getString("CATEGORIA"));
                contaReceber.setCD_VEIC_CONTA(rs.getInt("CD_VEIC_CONTA"));
                contaReceber.setOBS_CONTA(rs.getString("OBS_CONTA"));
                contasReceber.add(contaReceber);
            }
            rs.close();
            stmt.close();
                                
            return contasReceber;
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
            throw new RuntimeException(e);
        
        }
    }
    
    public void update(ContaReceber contaReceber){
        String sql = "update CONTAS_RECEBER set "
                + "TOTAL_CONTA=?, "
                + "TOTAL_RECEBIDO=?, "
                + "STATUS_CONTA=? ,"
                + "DT_RECEBIDO=? ,"
                + "CATEGORIA=?,"
                + "CD_VEIC_CONTA=?,"
                + "OBS_CONTA=? where CD_CONTA=?";

	try {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            
            stmt.setFloat(1, contaReceber.getTOTAL_CONTA());
            stmt.setFloat(2, contaReceber.getTOTAL_RECEBIDO());
            stmt.setString(3, contaReceber.getSTATUS_CONTA());
            stmt.setString(4, contaReceber.getDT_RECEBIDO());
            stmt.setString(5, contaReceber.getCATEGORIA());
            stmt.setInt(6, contaReceber.getCD_VEIC_CONTA());
            stmt.setString(7, contaReceber.getOBS_CONTA());
            stmt.setInt(8, contaReceber.getCD_CONTA());
            stmt.execute();
            stmt.close();
            JOptionPane.showMessageDialog(null, "Registro alterado com sucesso !");
	} catch (SQLException e) {
            throw new RuntimeException(e);
	}
    
    }

public void delete(ContaPagar contaPagar) {
	try {
            PreparedStatement stmt = conexao.prepareStatement("delete from CONTAS_RECEBER where CD_CONTA=?");
            stmt.setInt(1, contaPagar.getCD_CONTA());
            stmt.execute();
            stmt.close();
            JOptionPane.showMessageDialog(null, "Registro excluído com sucesso !");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        
    }
    
    
    
}
