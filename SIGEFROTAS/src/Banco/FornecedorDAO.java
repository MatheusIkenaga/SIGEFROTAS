/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banco;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Matheus
 */
public class FornecedorDAO {
    
    private Connection conexao;
    
    public FornecedorDAO () {
        
        this.conexao = new ConnectionFactory().getConnection("root", "root1234");
    
    }
    
    public void insert(FornecedorDAO fornecedor){
        String sql = "insert into fornecedor (CD_FORNECEDOR, END_FORNECEDOR, OBS_FORNECEDOR)";
        
        try {
			PreparedStatement stmt = conexao.prepareStatement(sql);

			stmt.setString(1, fornecedor.getCD_FORNECEDOR());
			stmt.setString(2, fornecedor.getEND_FORNECEDOR());
			stmt.setString(3, fornecedor.getOBS_FORNECEDOR());
                        
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
    }
    
}
