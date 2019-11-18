/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banco;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Matheus
 */
public class ComprasDAO {
    
private Connection conexao;
    
    public ComprasDAO () {
        
        this.conexao = new ConnectionFactory().getConnection("root", "root1234");
    
    }
    
    public void insert(Compras compra){
        String sql = "insert into compras (CD_COMPRA, DT_COMPRA, NF_COMPRA, CHAVE_ACESSO_COMPRA, VALOR_COMPRA, CD_PECA_COMPRA) values (?,?,?,?,?,?)";
        
        try {
			PreparedStatement stmt = conexao.prepareStatement(sql);

			stmt.setString(1, Integer.toString(compra.getCd_compra()));
			//stmt.setDate(2, (Date) compras.getDT_COMPRA());
			stmt.setString(3, Integer.toString(compra.getNf_compra()));
			stmt.setString(4, Integer.toString(compra.getChave_acesso_compra()));
                        stmt.setString(5, Float.toString(compra.getValor_compra()));
                        stmt.setString(6, Integer.toString(compra.getCd_peca_compra()));
                        
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
    }
    
}
