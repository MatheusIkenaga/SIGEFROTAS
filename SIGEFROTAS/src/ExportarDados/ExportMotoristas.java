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

public class ExportMotoristas {
    
    private Connection conexao;
    public void ExportarMotoristas () throws InterruptedException {
        
        JOptionPane.showMessageDialog(null, "Caso você possua um arquivo \"PlanilhaMotoristas\" na sua \n Pasta de Downloads, remova-o para gerar o relatório");
        WritableWorkbook wworkbook;
        try {
            wworkbook = Workbook.createWorkbook(new File("/Users/matheusikenaga/Downloads/PlanilhaMotoristas.xls"));
            this.conexao = new ConnectionFactory().getConnection("root", "root1234");
            PreparedStatement ps=null;
            ResultSet rs=null;
            
            String query="select * from Motorista";
            ps= conexao.prepareStatement(query);
            System.out.println("Consulta no Banco:"+ps);
            rs=ps.executeQuery();
            WritableSheet wsheet = wworkbook.createSheet("Motoristas", 0);
            Label label = new Label(0, 2, "A label record");
            wsheet.addCell(label);
            int i=0;//Coluna
            int j=2;//Linha
            
            label = new Label(i++, 0, "Código");
            wsheet.addCell(label);
            label = new Label(i++, 0, "Nome");
            wsheet.addCell(label);
            label = new Label(i++, 0, "Telefone");
            wsheet.addCell(label);
            label = new Label(i++, 0, "CPF");
            wsheet.addCell(label);
            label = new Label(i++, 0, "RG");
            wsheet.addCell(label);
            label = new Label(i++, 0,"Data de Nascimento");
            wsheet.addCell(label);
            label = new Label(i++, 0, "Sexo");
            wsheet.addCell(label);
            label = new Label(i++, 0, "CNH");
            wsheet.addCell(label);
            label = new Label(i++, 0, "Validade da CNH");
            wsheet.addCell(label);
            label = new Label(i++, 0, "Observações");
            wsheet.addCell(label);
           
                
            
            while(rs.next()){
                i=0;
                label = new Label(i++, j, rs.getString("CD_MOTORISTA"));
                wsheet.addCell(label);
                label = new Label(i++, j, rs.getString("NM_MOTORISTA"));
                wsheet.addCell(label);
                label = new Label(i++, j, rs.getString("TEL_MOTORISTA"));
                wsheet.addCell(label);
                label = new Label(i++, j, rs.getString("CPF_MOTORISTA"));
                wsheet.addCell(label);
                label = new Label(i++, j, rs.getString("RG_MOTORISTA"));
                wsheet.addCell(label);
                
                String diaNasc = rs.getString("DT_NASC_MOTORISTA").substring(8,10);
                String mesNasc = rs.getString("DT_NASC_MOTORISTA").substring(5,7);
                String anoNasc = rs.getString("DT_NASC_MOTORISTA").substring(0,4);
                
                label = new Label(i++, j, (diaNasc+"/"+mesNasc+"/"+anoNasc));
                wsheet.addCell(label);
                label = new Label(i++, j, rs.getString("SX_MOTORISTA"));
                wsheet.addCell(label);
                label = new Label(i++, j, rs.getString("CNH_MOTORISTA"));
                wsheet.addCell(label);
                
                String diaCnh = rs.getString("VAL_CNH_MOTORISTA").substring(8,10);
                String mesCnh = rs.getString("VAL_CNH_MOTORISTA").substring(5,7);
                String anoCnh = rs.getString("VAL_CNH_MOTORISTA").substring(0,4);
                
                label = new Label(i++, j, (diaCnh+"/"+mesCnh+"/"+anoCnh));
                wsheet.addCell(label);
                label = new Label(i++, j, rs.getString("OBS_MOTORISTA"));
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
