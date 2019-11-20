/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banco;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Matheus
 */
public class MotoristaDAO {
    
private Connection conexao;
    
    public MotoristaDAO () {
        
        this.conexao = new ConnectionFactory().getConnection("root", "root1234");
    
    }
    
    public void insert(Motorista motorista){
        String sql = "insert into motorista "
                //+ "(CD_MOTORISTA, "
                + "(NM_MOTORISTA, "
                + "DT_NASC_MOTORISTA, "
                + "CPF_MOTORISTA, "
                + "RG_MOTORISTA, "
                + "CNH_MOTORISTA, "
                + "VAL_CNH_MOTORISTA, "
                + "OBS_MOTORISTA,"
                + "SOBRENOME_MOTORISTA,"
                + "SEXO_MOTORISTA)"
                + "values (?,?,?,?,?,?,?,?,?,?)";
        
        try {
			PreparedStatement stmt = conexao.prepareStatement(sql);

			stmt.setString(1, Integer.toString(motorista.getCD_MOTORISTA()));
			stmt.setString(2, motorista.getNm_motorista());
                        stmt.setString(3, motorista.getDT_NASC_MOTORISTA());
			stmt.setString(4, motorista.getCpf_motorista());
                        stmt.setString(5, motorista.getRg_motorista());
                        stmt.setString(6, motorista.getCnh_motorista());
			stmt.setString(7, motorista.getVAL_CNH_MOTORISTA());
                        stmt.setString(8, motorista.getObs_motorista());
                        stmt.setString(9, motorista.getSobrenome_motorista());
                        stmt.setString(10, Integer.toString(motorista.getSexo_motorista()));
      
                        
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, e);
                    throw new RuntimeException(e);
            }
    }
    
    /*
    public List<Motorista> select(){
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
			List<Contato> contatos = new ArrayList<Motorista>();
                        stmt = this.conexao.prepareStatement("select * from contato where nome=?");
				
				rs = stmt.executeQuery();
                                
                                while (rs.next()) {
					Motorista motorista = new Motorista();
					motorista.setCD_MOTORISTA(rs.getInt("cd"));
					motorista.setNm_motorista(rs.getString("nome"));
					motorista.setSobrenome_motorista(rs.getString("sobrenome"));
                                        
                                        
					motorista.setTelefone(rs.getInt("telefone"));
					motorista.setMensagem(rs.getString("mensagem"));
					motorista.setDataRegistro(rs.getDate("dataRegistro"));
                                        
                                        
					motorista.add(motorista);
				}
				rs.close();
				stmt.close();
                                
        }
        catch{
        
        }
    }

*/
    
    
    
}
