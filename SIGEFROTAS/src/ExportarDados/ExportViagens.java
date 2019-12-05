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

public class ExportViagens {
    
    private Connection conexao;
    public void ExportarViagens () throws InterruptedException {
        
        JOptionPane.showMessageDialog(null, "Caso você possua um arquivo \"PlanilhaViagens\" na sua \n Pasta de Downloads, remova-o para gerar o relatório");
        WritableWorkbook wworkbook;
        try {
            wworkbook = Workbook.createWorkbook(new File("/Users/matheusikenaga/Downloads/PlanilhaViagens.xls"));
            this.conexao = new ConnectionFactory().getConnection("root", "root1234");
            PreparedStatement ps=null;
            ResultSet rs=null;
            
            
            String query="select * from GER_FROTA_VIAGEM";
            ps= conexao.prepareStatement(query);
            System.out.println("Consulta no Banco:"+ps);
            rs=ps.executeQuery();
            WritableSheet wsheet = wworkbook.createSheet("Viagens", 0);
            Label label = new Label(0, 2, "A label record");
            wsheet.addCell(label);
            int i=0;//Coluna
            int j=2;//Linha
            
            /*
            columnsName[0] = "Código";
            columnsName[1] = "Motorista";
            columnsName[2] = "Veículo";
            columnsName[3] = "Origem";
            columnsName[4] = "UF Origem";
            columnsName[5] = "Destino";
            columnsName[6] = "UF Destino";
            columnsName[7] = "Distância";
            columnsName[8] = "Tipo";
            columnsName[9] = "Motivo";
            columnsName[10] = "Valor";
            columnsName[11] = "Observações";
            
            */
            
            label = new Label(i++, 0, "Código");
            wsheet.addCell(label);
            label = new Label(i++, 0, "Motorista");
            wsheet.addCell(label);
            label = new Label(i++, 0, "Veículo");
            wsheet.addCell(label);
            label = new Label(i++, 0, "Origem");
            wsheet.addCell(label);
            label = new Label(i++, 0, "UF Origem");
            wsheet.addCell(label);
            label = new Label(i++, 0, "Destino");
            wsheet.addCell(label);
            label = new Label(i++, 0, "UF Destino");
            wsheet.addCell(label);
            label = new Label(i++, 0,"Distância");
            wsheet.addCell(label);
            label = new Label(i++, 0, "Tipo");
            wsheet.addCell(label);
            label = new Label(i++, 0, "Motivo");
            wsheet.addCell(label);
            label = new Label(i++, 0, "Valor");
            wsheet.addCell(label);
            label = new Label(i++, 0, "Observações");
            wsheet.addCell(label);
            
                
            
            while(rs.next()){
                i=0;
                label = new Label(i++, j, rs.getString("CD_VIAGEM"));
                wsheet.addCell(label);
                label = new Label(i++, j, selectMotViagem(rs.getInt("CD_VIAGEM")));
                wsheet.addCell(label);
                label = new Label(i++, j, selectVeicViagem(rs.getInt("CD_VIAGEM")));
                wsheet.addCell(label);
                label = new Label(i++, j, rs.getString("ORIGEM_VIAGEM"));
                wsheet.addCell(label);
                label = new Label(i++, j, rs.getString("EST_ORIGEM_VIAGEM"));
                wsheet.addCell(label);
                label = new Label(i++, j, rs.getString("DEST_VIAGEM"));
                wsheet.addCell(label);
                label = new Label(i++, j, rs.getString("EST_DEST_VIAGEM"));
                wsheet.addCell(label);
                label = new Label(i++, j, rs.getString("KM_VIAGEM"));
                wsheet.addCell(label);
                label = new Label(i++, j, rs.getString("TIPO_VIAGEM"));
                wsheet.addCell(label);
                label = new Label(i++, j, rs.getString("MOTIVO_VIAGEM"));
                wsheet.addCell(label);
                label = new Label(i++, j, rs.getString("VALOR_VIAGEM"));
                wsheet.addCell(label);
                label = new Label(i++, j, rs.getString("OBS_VIAGEM"));
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
    public String selectMotViagem(int cd){
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String resultado = null;
        
        try{
            
            stmt = this.conexao.prepareStatement("select m.cd_motorista, "
                    + "m.nm_motorista, m.cpf_motorista from GER_FROTA_VIAGEM v "
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
    public String selectVeicViagem(int cd){
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String resultado = null;
        
        try{
            
            stmt = this.conexao.prepareStatement("select veic.cd_veiculo, "
                    + "veic.modelo_veiculo, veic.placa_veiculo from GER_FROTA_VIAGEM v "
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
    
}
