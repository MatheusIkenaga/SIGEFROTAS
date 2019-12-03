/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExportarDados;

import Banco.ConnectionFactory;
import java.io.File;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
 

import jxl.Workbook; 
import jxl.write.*;

public class ExportVeiculos {
    
    private Connection conexao;
    public void ExportarVeiculos () throws InterruptedException {
        
        JOptionPane.showMessageDialog(null, "Caso você possua um arquivo \"PlanilhaVeiculos\" na sua \n Pasta de Downloads, remova-o para gerar o relatório");
        WritableWorkbook wworkbook;
        try {
            wworkbook = Workbook.createWorkbook(new File("/Users/matheusikenaga/Downloads/PlanilhaVeiculos.xls"));
            this.conexao = new ConnectionFactory().getConnection("root", "root1234");
            PreparedStatement ps=null;
            ResultSet rs=null;
            
            String query="select * from VEICULO";
            ps= conexao.prepareStatement(query);
            System.out.println("Consulta no Banco:"+ps);
            rs=ps.executeQuery();
            WritableSheet wsheet = wworkbook.createSheet("Veículos", 0);
            Label label = new Label(0, 2, "A label record");
            wsheet.addCell(label);
            int i=0;//Coluna
            int j=2;//Linha
            
            label = new Label(i++, 0, "Código");
            wsheet.addCell(label);
            label = new Label(i++, 0, "Marca");
            wsheet.addCell(label);
            label = new Label(i++, 0, "Modelo");
            wsheet.addCell(label);
            label = new Label(i++, 0, "Cor");
            wsheet.addCell(label);
            label = new Label(i++, 0, "Placa");
            wsheet.addCell(label);
            label = new Label(i++, 0,"Hodometro");
            wsheet.addCell(label);
            label = new Label(i++, 0, "Ano Fabricação");
            wsheet.addCell(label);
            label = new Label(i++, 0, "Ano Modelo");
            wsheet.addCell(label);
            label = new Label(i++, 0, "Tipo");
            wsheet.addCell(label);
            label = new Label(i++, 0, "Disponibilidade");
            wsheet.addCell(label);
            label = new Label(i++, 0, "Seguro");
            wsheet.addCell(label);
            label = new Label(i++, 0, "Número da Apolice");
            wsheet.addCell(label);
            label = new Label(i++, 0, "Obs");
            wsheet.addCell(label);
                
            
            while(rs.next()){
                i=0;
                label = new Label(i++, j, rs.getString("CD_VEICULO"));
                wsheet.addCell(label);
                label = new Label(i++, j, rs.getString("MARCA_VEICULO"));
                wsheet.addCell(label);
                label = new Label(i++, j, rs.getString("MODELO_VEICULO"));
                wsheet.addCell(label);
                label = new Label(i++, j, rs.getString("COR_VEICULO"));
                wsheet.addCell(label);
                label = new Label(i++, j, rs.getString("PLACA_VEICULO"));
                wsheet.addCell(label);
                label = new Label(i++, j, rs.getString("HODOM_VEICULO"));
                wsheet.addCell(label);
                label = new Label(i++, j, rs.getString("ANO_VEICULO"));
                wsheet.addCell(label);
                label = new Label(i++, j, rs.getString("ANO_MOD_VEICULO"));
                wsheet.addCell(label);
                label = new Label(i++, j, rs.getString("TIPO_VEICULO"));
                wsheet.addCell(label);
                label = new Label(i++, j, rs.getString("DISPO_VEICULO"));
                wsheet.addCell(label);
                label = new Label(i++, j, rs.getString("SEGURO_VEICULO"));
                wsheet.addCell(label);
                label = new Label(i++, j, rs.getString("NUM_APOLICE_VEICULO"));
                wsheet.addCell(label);
                label = new Label(i++, j, rs.getString("OBS_VEICULO"));
                wsheet.addCell(label);
                j++;
            }
            wworkbook.write();
            wworkbook.close();
            System.out.println("Finished");
            JOptionPane.showMessageDialog(null, "Relatório Gerado");
            
        
        } catch (Exception e) {
            System.out.println(e);
        
        }
    }
}
