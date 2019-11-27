/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banco.Viagem;

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
public class ViagemDAO {
    
private Connection conexao;
String dt;
    
    public ViagemDAO () {
        
        this.conexao = new ConnectionFactory().getConnection("root", "root1234");
    
    }
    
 /*INSERT INTO `GER_FROTAS`.`GER_FROTA_VIAGEM` 
(`ORIGEM_VIAGEM`, `EST_ORIGEM_VIAGEM`, `DEST_VIAGEM`, 
`EST_DEST_VIAGEM`, `KM_VIAGEM`, `TIPO_VIAGEM`, `MOTIVO_VIAGEM`
, `VALOR_VIAGEM`, `OBS_VIAGEM`, `CD_MOTORISTA_VIAGEM`, 
`CD_VEICULO_VIAGEM`) 
VALUES ('Espírito Santo', 'ES', 'Sao paulo', 'SP', 
'321', 'teste 2', 'eu quero', '321', 'obs', '5', '15');*/

    public void insert(Viagem viagem){
        String sql = "insert into GER_FROTA_VIAGEM "
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
    
    public List<Viagem> selectConsulta(){
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            List<Viagem> viagens = new ArrayList<Viagem>();
            stmt = this.conexao.prepareStatement("select * from GER_FROTA_VIAGEM order by CD_VIAGEM");
				
            rs = stmt.executeQuery();
                                
                                
            while (rs.next()) {
		Viagem viagem = new Viagem();
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
    
    public void update(Viagem viagem){
        String sql = "update GER_FROTA_VIAGEM set "
                + "ORIGEM_VIAGEM=?, "
                + "EST_ORIGEM_VIAGEM=?, "
                + "DEST_VIAGEM=? , "
                + "EST_DEST_VIAGEM=?,"
                + "KM_VIAGEM=?,"
                + "TIPO_VIAGEM=?,"
                + "MOTIVO_VIAGEM=?,"
                + "VALOR_VIAGEM=?,"
                + "OBS_VIAGEM=?"
                + "CD_MOTORISTA_VIAGEM=?"
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

public void delete(Viagem viagem) {
	try {
            PreparedStatement stmt = conexao.prepareStatement("delete from GER_FROTA_VIAGEM where CD_VIAGEM=?");
            stmt.setInt(1, viagem.getCD_VIAGEM());
            stmt.execute();
            stmt.close();
            JOptionPane.showMessageDialog(null, "Registro excluído com sucesso !");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        
    }
    
    
    
}
