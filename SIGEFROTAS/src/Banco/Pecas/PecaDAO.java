/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banco.Pecas;

import Banco.ConnectionFactory;
import java.sql.Connection;
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
public class PecaDAO {
    
    private Connection conexao;
    
    public PecaDAO () {
        
        this.conexao = new ConnectionFactory().getConnection("root", "root1234");
    
    }
    
    public void insert(Peca pecas){
        String sql = "insert into pecas  "
                + "(NOME_PECA, "
                + "QTD_PECA, "
                + "VALOR_PECA, "
                + "CD_VEIC_PECA) "
                + "values (?,?,?,?,?)";
        
        try {
			PreparedStatement stmt = conexao.prepareStatement(sql);
			stmt.setString(1, pecas.getNome_peca());
			stmt.setString(2, Integer.toString(pecas.getQtd_peca()));
			stmt.setString(3, Float.toString(pecas.getValor_peca()));
                        stmt.setString(4, Integer.toString(pecas.getCD_VEIC_PECA()));
                        
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
    }
    
    public List<Peca> selectConsulta(){
        PreparedStatement stmt = null;
	ResultSet rs = null;

	try {
            List<Peca> pecas = new ArrayList<Peca>();
            stmt = this.conexao.prepareStatement("select * from PECAS order by CD_PECA");
            rs = stmt.executeQuery();
            while (rs.next()) {
                Peca peca = new Peca();
                peca.setCd_peca(rs.getInt("CD_PECA"));
                peca.setNome_peca(rs.getString("NOME_PECA"));
                peca.setQtd_peca(rs.getInt("QTD_PECA"));
                peca.setValor_peca(rs.getFloat("VALOR_PECA"));
                peca.setCD_VEIC_PECA(rs.getInt("CD_VEIC_PECA"));
                
                pecas.add(peca);
            }
            rs.close();
            stmt.close();
            return pecas;
        }
        catch(SQLException e) {
            System.out.println(e);
            throw new RuntimeException();
        }
        
    }
    public void update(Peca peca){
        String sql = "update PECAS set "
                + "NOME_PECA=?, "
                + "QTD_PECA=?, "
                + "VALOR_PECA=? , "
                + "CD_VEIC_PECA=? where CD_PECA=?";
     try {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, peca.getNome_peca());
            stmt.setInt(2, peca.getQtd_peca());
            stmt.setFloat(3, peca.getValor_peca());
            stmt.setInt(4, peca.getCD_VEIC_PECA());
            stmt.setInt(5,peca.getCd_peca());
            stmt.execute();
            stmt.close();
            JOptionPane.showMessageDialog(null, "Registro alterado com sucesso !");
        } catch (SQLException e) {
            System.out.println(e);
            throw new RuntimeException(e);
        }
    }
    
    public void delete(Peca peca) {
	try {
            PreparedStatement stmt = conexao.prepareStatement("delete from PECAS where CD_PECA=?");
            stmt.setInt(1, peca.getCd_peca());
            stmt.execute();
            stmt.close();
            JOptionPane.showMessageDialog(null, "Registro excluído com sucesso !");
        } catch (SQLException e) {
            System.out.println(e);
            throw new RuntimeException(e);
        }
        
    }
}

