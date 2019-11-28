/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banco.Aluguel;

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
public class AluguelDAO {
    
private Connection conexao;
String dt;
    
    public AluguelDAO () {
        
        this.conexao = new ConnectionFactory().getConnection("root", "root1234");
    
    }
    
    public String selectMotAluguel(int cd){
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String resultado = null;
        
        try{
            
            stmt = this.conexao.prepareStatement("select m.cd_motorista, "
                    + "m.nm_motorista, m.cpf_motorista from ALUG_VEIC_VIAGEM v "
                    + "left join motorista m on m.cd_motorista = v.cd_motorista_viagem "
                    + "where v.CD_VIAGEM="+cd);
            rs = stmt.executeQuery();
            if(rs.next()){
            resultado = (rs.getString("CD_MOTORISTA")+"-"+rs.getString("NM_MOTORISTA")+" ("+rs.getString("CPF_MOTORISTA")+")");
            }
            rs.close();
            stmt.close();
            System.out.println(resultado);
        
        }catch(Exception e){
            
            JOptionPane.showMessageDialog(null,e);
        }
        return resultado;
        
    }
    
    public String selectVeicAluguel(int cd){
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String resultado = null;
        
        try{
            
            stmt = this.conexao.prepareStatement("select veic.cd_veiculo, "
                    + "veic.modelo_veiculo, veic.placa_veiculo from ALUG_VEIC_VIAGEM v "
                    + "left join veiculo veic on veic.cd_veiculo = v.cd_veiculo_viagem "
                    + "where v.cd_viagem="+cd);
            rs = stmt.executeQuery();
            if(rs.next()){
            resultado = (rs.getString("CD_VEICULO")+"- "+rs.getString("MODELO_VEICULO")+" ("+rs.getString("PLACA_VEICULO")+")");
            }
            rs.close();
            stmt.close();
            System.out.println(resultado);
        
        }catch(Exception e){
            
            JOptionPane.showMessageDialog(null,e);
        }
        return resultado;
        
    }
    
    /*
    select m.cd_motorista, m.nm_motorista, m.cpf_motorista
        from GER_FROTA_VIAGEM v 
        left join motorista m on m.cd_motorista = v.cd_motorista_viagem
        where v.CD_VIAGEM=6
    */
    
    public String selectAluguel(int cd, String retorno){
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String resultado = null;
        
        try{
            
            stmt = this.conexao.prepareStatement("select * from ALUG_VEIC_VIAGEM where CD_VIAGEM="+cd);
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
    
 /*INSERT INTO `GER_FROTAS`.`GER_FROTA_VIAGEM` 
(`ORIGEM_VIAGEM`, `EST_ORIGEM_VIAGEM`, `DEST_VIAGEM`, 
`EST_DEST_VIAGEM`, `KM_VIAGEM`, `TIPO_VIAGEM`, `MOTIVO_VIAGEM`
, `VALOR_VIAGEM`, `OBS_VIAGEM`, `CD_MOTORISTA_VIAGEM`, 
`CD_VEICULO_VIAGEM`) 
VALUES ('Espírito Santo', 'ES', 'Sao paulo', 'SP', 
'321', 'teste 2', 'eu quero', '321', 'obs', '5', '15');*/

    public void insert(Aluguel viagem){
        String sql = "insert into ALUG_VEIC_VIAGEM "
            //+ "(CD_VIAGEM, "
            + "(ORIGEM_VIAGEM, "
            + "EST_ORIGEM_VIAGEM, "
            + "DEST_VIAGEM, "
            + "EST_DEST_VIAGEM, "
            + "KM_VIAGEM, "
            + "TIPO_VIAGEM, "
            + "MOTIVO_VIAGEM, "
            + "VALOR_VIAGEM, "
            + "OBS_VIAGEM,"
            + "CD_MOTORISTA_VIAGEM,"
            + "CD_VEICULO_VIAGEM) "
            + "values (?,?,?,?,?,?,?,?,?,?,?)";
        
        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);

            stmt.setString(1, viagem.getORIGEM_VIAGEM());
            stmt.setString(2, viagem.getEST_ORIGEM_VIAGEM());
            stmt.setString(3, viagem.getDEST_VIAGEM());
            stmt.setString(4, viagem.getEST_DEST_VIAGEM());
            stmt.setFloat(5, viagem.getKM_VIAGEM());
            stmt.setString(6,viagem.getTIPO_VIAGEM());
            stmt.setString(7, viagem.getMOTIVO_VIAGEM());
            stmt.setFloat(8, viagem.getVALOR_VIAGEM());
            stmt.setString(9, viagem.getOBS_VIAGEM());
            stmt.setInt(10, viagem.getCD_MOTORISTA_VIAGEM());
            stmt.setInt(11, viagem.getCD_VEICULO_VIAGEM());
            
            stmt.execute();
            stmt.close();
            JOptionPane.showMessageDialog(null, "Gravado com sucesso ! ");
	} catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            throw new RuntimeException(e);
        }
    }    
    
    public List<Aluguel> selectConsulta(){
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            List<Aluguel> viagens = new ArrayList<Aluguel>();
            stmt = this.conexao.prepareStatement("select * from ALUG_VEIC_VIAGEM order by CD_VIAGEM");
				
            rs = stmt.executeQuery();
                                
                                
            while (rs.next()) {
		Aluguel viagem = new Aluguel();
                viagem.setCD_VIAGEM(rs.getInt("CD_VIAGEM"));
		viagem.setORIGEM_VIAGEM(rs.getString("ORIGEM_VIAGEM"));
		viagem.setEST_ORIGEM_VIAGEM(rs.getString("EST_ORIGEM_VIAGEM"));
                viagem.setDEST_VIAGEM(rs.getString("DEST_VIAGEM"));
                viagem.setEST_DEST_VIAGEM(rs.getString("EST_DEST_VIAGEM"));
                viagem.setKM_VIAGEM(rs.getFloat("KM_VIAGEM"));
                viagem.setTIPO_VIAGEM(rs.getString("TIPO_VIAGEM"));
                viagem.setMOTIVO_VIAGEM(rs.getString("MOTIVO_VIAGEM"));
                viagem.setVALOR_VIAGEM(rs.getFloat("VALOR_VIAGEM"));
                viagem.setOBS_VIAGEM(rs.getString("OBS_VIAGEM"));
                viagem.setCD_MOTORISTA_VIAGEM(rs.getInt("CD_MOTORISTA_VIAGEM"));
                viagem.setCD_VEICULO_VIAGEM(rs.getInt("CD_VEICULO_VIAGEM"));
                viagens.add(viagem);
            }
            rs.close();
            stmt.close();
                                
            return viagens;
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
            throw new RuntimeException(e);
        
        }
    }
    
    public void update(Aluguel viagem){
        String sql = "update ALUG_VEIC_VIAGEM set "
                + "ORIGEM_VIAGEM=?, "
                + "EST_ORIGEM_VIAGEM=?, "
                + "DEST_VIAGEM=? , "
                + "EST_DEST_VIAGEM=?,"
                + "KM_VIAGEM=?,"
                + "TIPO_VIAGEM=?,"
                + "MOTIVO_VIAGEM=?,"
                + "VALOR_VIAGEM=?,"
                + "OBS_VIAGEM=?,"
                + "CD_MOTORISTA_VIAGEM=?,"
                + "CD_VEICULO_VIAGEM=? where CD_VIAGEM=?";
        
        /*"insert into GER_FROTA_VIAGEM "
            //+ "(CD_VIAGEM, "
            + "(ORIGEM_VIAGEM, "
            + "EST_ORIGEM_VIAGEM, "
            + "DEST_VIAGEM, "
            + "EST_DEST_VIAGEM, "
            + "KM_VIAGEM, "
            + "TIPO_VIAGEM, "
            + "MOTIVO_VIAGEM, "
            + "VALOR_VIAGEM, "
            + "OBS_VIAGEM,"
            + "CD_MOTORISTA_VIAGEM,"
            + "CD_VEICULO_VIAGEM) "
            + "values (?,?,?,?,?,?,?,?,?,?,?)";
        stmt.setString(1, viagem.getORIGEM_VIAGEM());
            stmt.setString(2, viagem.getEST_ORIGEM_VIAGEM());
            stmt.setString(3, viagem.getDEST_VIAGEM());
            stmt.setString(4, viagem.getEST_DEST_VIAGEM());
            stmt.setFloat(5, viagem.getKM_VIAGEM());
            stmt.setString(6,viagem.getTIPO_VIAGEM());
            stmt.setString(7, viagem.getMOTIVO_VIAGEM());
            stmt.setFloat(8, viagem.getVALOR_VIAGEM());
            stmt.setString(9, viagem.getOBS_VIAGEM());
            stmt.setInt(10, viagem.getCD_MOTORISTA_VIAGEM());
            stmt.setInt(11, viagem.getCD_VEICULO_VIAGEM());*/

	try {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            
            stmt.setString(1, viagem.getORIGEM_VIAGEM());
            stmt.setString(2, viagem.getEST_ORIGEM_VIAGEM());
            stmt.setString(3, viagem.getDEST_VIAGEM());
            stmt.setString(4, viagem.getEST_DEST_VIAGEM());
            stmt.setFloat(5, viagem.getKM_VIAGEM());
            stmt.setString(6,viagem.getTIPO_VIAGEM());
            stmt.setString(7, viagem.getMOTIVO_VIAGEM());
            stmt.setFloat(8, viagem.getVALOR_VIAGEM());
            stmt.setString(9, viagem.getOBS_VIAGEM());
            stmt.setInt(10, viagem.getCD_MOTORISTA_VIAGEM());
            stmt.setInt(11, viagem.getCD_VEICULO_VIAGEM());
            stmt.setInt(12, viagem.getCD_VIAGEM());
            stmt.execute();
            stmt.close();
            JOptionPane.showMessageDialog(null, "Registro alterado com sucesso !");
	} catch (SQLException e) {
            throw new RuntimeException(e);
	}
    
    }

public void delete(Aluguel viagem) {
	try {
            PreparedStatement stmt = conexao.prepareStatement("delete from ALUG_VEIC_VIAGEM where CD_VIAGEM=?");
            stmt.setInt(1, viagem.getCD_VIAGEM());
            stmt.execute();
            stmt.close();
            JOptionPane.showMessageDialog(null, "Registro excluído com sucesso !");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        
    }
    
    
    
}
