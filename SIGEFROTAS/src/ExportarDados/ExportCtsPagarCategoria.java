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

public class ExportCtsPagarCategoria {
    
    private Connection conexao;
    public void ExportarCategorias () throws InterruptedException {
        
        JOptionPane.showMessageDialog(null, "Caso você possua um arquivo \"PlanilhaPagarCategoria\" na sua \n Pasta de Downloads, remova-o para gerar o relatório");
        WritableWorkbook wworkbook;
        try {
            wworkbook = Workbook.createWorkbook(new File("/Users/matheusikenaga/Downloads/PlanilhaPagarCategoria.xls"));
            this.conexao = new ConnectionFactory().getConnection("root", "root1234");
            PreparedStatement ps=null;
            ResultSet rs=null;
            
            
            String query="select * from CONTAS_PAGAR order by CATEGORIA DESC";
            ps= conexao.prepareStatement(query);
            System.out.println("Consulta no Banco:"+ps);
            rs=ps.executeQuery();
            WritableSheet wsheet = wworkbook.createSheet("PagarCategoria", 0);
            Label label = new Label(0, 2, "A label record");
            wsheet.addCell(label);
            int i=0;//Coluna
            int j=2;//Linha

            label = new Label(i++, 0, "Código");
            wsheet.addCell(label);
            label = new Label(i++, 0, "Total da Conta");
            wsheet.addCell(label);
            label = new Label(i++, 0, "Total Pago");
            wsheet.addCell(label);
            label = new Label(i++, 0, "Status");
            wsheet.addCell(label);
            label = new Label(i++, 0, "Data de Pagamento/Previsão");
            wsheet.addCell(label);
            label = new Label(i++, 0, "Categoria");
            wsheet.addCell(label);
            label = new Label(i++, 0, "Veículo");
            wsheet.addCell(label);
            label = new Label(i++, 0,"Observações");
            wsheet.addCell(label);
            
                
            
            while(rs.next()){
                i=0;
                label = new Label(i++, j, rs.getString("CD_CONTA"));
                wsheet.addCell(label);
                label = new Label(i++, j, rs.getString("TOTAL_CONTA"));
                wsheet.addCell(label);
                label = new Label(i++, j, rs.getString("TOTAL_PAGO"));
                wsheet.addCell(label);
                label = new Label(i++, j, rs.getString("STATUS_CONTA"));
                wsheet.addCell(label);
                label = new Label(i++, j, rs.getString("DT_PAGTO"));
                wsheet.addCell(label);
                label = new Label(i++, j, rs.getString("CATEGORIA"));
                wsheet.addCell(label);
                label = new Label(i++, j, selectVeicConta(rs.getInt("CD_CONTA")));
                wsheet.addCell(label);
                label = new Label(i++, j, rs.getString("OBS_CONTA"));
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
    
    public String selectVeicConta(int cd){
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String resultado = null;
        
        try{
            
            stmt = this.conexao.prepareStatement("select veic.cd_veiculo, "
                    + "veic.modelo_veiculo, veic.placa_veiculo from CONTAS_PAGAR v "
                    + "left join veiculo veic on veic.cd_veiculo = v.CD_VEIC_CONTA "
                    + "where v.cd_CONTA="+cd);
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
    
}
