/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

import java.sql.ResultSet;
import Banco.Veiculo;
import Banco.VeiculoDAO;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author matheusikenaga
 */
public class ConsultaVeiculo extends javax.swing.JFrame {

    /**
     * Creates new form ConsultaMotorista
     */
    private VeiculoDAO dao= new VeiculoDAO();
    //public ArrayList<Veiculo> list = new ArrayList<Veiculo>();
    
    /*
    
    public class Veiculo{
	private int CD_VEICULO;
	private String MARCA_VEICULO;
	private String MODELO_VEICULO;
	private String COR_VEICULO;
        private String PLACA_VEICULO;
        private int HODOM_VEICULO;
	private int ANO_VEICULO;
	private int ANO_MOD_VEICULO;
	private String TIPO_VEICULO;
        private String DISPO_VEICULO;
        private String SEGURO_VEICULO;
	private String NUM_APOLICE_VEICULO;	
	private String OBS_VEICULO;
    
    */
    
    public void AddRowToJTable(){
        DefaultTableModel model = new DefaultTableModel();
        Object[] columnsName = new Object [13];
        columnsName[0] = "Código";
        columnsName[1] = "Marca";
        columnsName[2] = "Modelo";
        columnsName[3] = "Cor";
        columnsName[4] = "Placa";
        columnsName[5] = "Hodometro";
        columnsName[6] = "Ano Fabricação";
        columnsName[7] = "Ano Modelo";
        columnsName[8] = "Tipo";
        columnsName[9] = "Disponibilidade";
        columnsName[10] = "Seguro";
        columnsName[11] = "Apolice";
        columnsName[12] = "Observações";
        
        model.setColumnIdentifiers(columnsName);
        
        ArrayList<Veiculo> list = dao.selectConsulta();
        
        Object rowData[] = new Object [13];
        for (int i = 0; i < dao.selectConsulta().size();i++) {
            rowData[0] = list.get(i).getCD_VEICULO();
            rowData[1] = list.get(i).getMarca_veiculo();
            rowData[2] = list.get(i).getModelo_veiculo();
            rowData[3] = list.get(i).getCor_veiculo();
            rowData[4] = list.get(i).getPlaca_veiculo();
            rowData[5] = list.get(i).getHODOM_VEICULO();
            rowData[6] = list.get(i).getAno_veiculo();
            rowData[7] = list.get(i).getAno_modelo_veiculo();
            rowData[8] = list.get(i).getTipo_veiculo();
            rowData[9] = list.get(i).getDISPO_VEICULO();
            rowData[10] = list.get(i).getSeguro_veiculo();
            rowData[11] = list.get(i).getNUM_APOLICE_VEICULO();
            rowData[12] = list.get(i).getObs_veiculo();
            model.addRow(rowData);
        }
    }
    
    
    public ConsultaVeiculo() {
        //this.Veiculo = new Veiculo();
        initComponents();
        AddRowToJTable();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel15 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel15.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel15.setText("Consulta de Veículos");

        DefaultTableModel model = new DefaultTableModel();
        Object[] columnsName = new Object [13];
        columnsName[0] = "Código";
        columnsName[1] = "Marca";
        columnsName[2] = "Modelo";
        columnsName[3] = "Cor";
        columnsName[4] = "Placa";
        columnsName[5] = "Hodometro";
        columnsName[6] = "Ano Fabricação";
        columnsName[7] = "Ano Modelo";
        columnsName[8] = "Tipo";
        columnsName[9] = "Disponibilidade";
        columnsName[10] = "Seguro";
        columnsName[11] = "Apolice";
        columnsName[12] = "Observações";

        model.setColumnIdentifiers(columnsName);

        ArrayList<Veiculo> list = dao.selectConsulta();

        Object rowData[] = new Object [13];
        for (int i = 0; i < dao.selectConsulta().size();i++) {
            rowData[0] = list.get(i).getCD_VEICULO();
            rowData[1] = list.get(i).getMarca_veiculo();
            rowData[2] = list.get(i).getModelo_veiculo();
            rowData[3] = list.get(i).getCor_veiculo();
            rowData[4] = list.get(i).getPlaca_veiculo();
            rowData[5] = list.get(i).getHODOM_VEICULO();
            rowData[6] = list.get(i).getAno_veiculo();
            rowData[7] = list.get(i).getAno_modelo_veiculo();
            rowData[8] = list.get(i).getTipo_veiculo();
            rowData[9] = list.get(i).getDISPO_VEICULO();
            rowData[10] = list.get(i).getSeguro_veiculo();
            rowData[11] = list.get(i).getNUM_APOLICE_VEICULO();
            rowData[12] = list.get(i).getObs_veiculo();
            model.addRow(rowData);
        }
        jTable1.setModel(model);
        jScrollPane2.getViewport().add(jTable1);
        jScrollPane2.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel15)
                .addGap(517, 517, 517))
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addComponent(jLabel15)
                .addGap(52, 52, 52)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 564, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel15;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
