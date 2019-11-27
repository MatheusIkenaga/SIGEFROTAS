/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

import Banco.Motorista;
import Banco.MotoristaDAO;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author matheusikenaga
 */
public class ConsultaMotorista extends javax.swing.JFrame {
    private MotoristaDAO dao= new MotoristaDAO();
    
    
        public void AddRowToJTable(){
        DefaultTableModel model = new DefaultTableModel();
        
        jTable1.setDefaultEditor(Object.class, null);
        
        Object[] columnsName = new Object [10];
        columnsName[0] = "Código";
        columnsName[1] = "Nome";
        columnsName[2] = "Sobrenome";
        columnsName[3] = "CPF";
        columnsName[4] = "RG";
        columnsName[5] = "Data de Nascimento";
        columnsName[6] = "Sexo";
        columnsName[7] = "Número da CNH";
        columnsName[8] = "Validade da CNH";
        columnsName[9] = "Observações";
        
        model.setColumnIdentifiers(columnsName);
        
        List<Motorista> list = dao.selectConsulta();
        
        Object rowData[] = new Object [10];
        for (int i = 0; i < dao.selectConsulta().size();i++) {
            rowData[0] = list.get(i).getCD_MOTORISTA();
            rowData[1] = list.get(i).getNm_motorista();
            rowData[2] = list.get(i).getTELEFONE_motorista();
            rowData[3] = list.get(i).getCpf_motorista();
            rowData[4] = list.get(i).getRg_motorista();
            //1997-08-21
            String diaNasc = list.get(i).getDT_NASC_MOTORISTA().substring(8,9);
            String mesNasc = list.get(i).getDT_NASC_MOTORISTA().substring(5,6);
            String anoNasc = list.get(i).getDT_NASC_MOTORISTA().substring(0,3);
            
            rowData[5] = diaNasc+"/"+mesNasc+"/"+anoNasc;
            rowData[6] = list.get(i).getSX_MOTORISTA();
            rowData[7] = list.get(i).getCnh_motorista();
            
            String diaCNH = list.get(i).getVAL_CNH_MOTORISTA().substring(8,9);
            String mesCNH = list.get(i).getVAL_CNH_MOTORISTA().substring(5,6);
            String anoCNH = list.get(i).getVAL_CNH_MOTORISTA().substring(0,3);
            
            rowData[8] = diaCNH+"/"+mesCNH+"/"+anoCNH;
            rowData[9] = list.get(i).getObs_motorista();
            model.addRow(rowData);
            
        }
    }

    /**
     * Creates new form ConsultaMotorista
     */
    public ConsultaMotorista() {
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
        btEditar = new javax.swing.JButton();
        btVoltar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel15.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel15.setText("Consulta de Motoristas");

        DefaultTableModel model = new DefaultTableModel();

        jTable1.setDefaultEditor(Object.class, null);

        Object[] columnsName = new Object [10];
        columnsName[0] = "Código";
        columnsName[1] = "Nome";
        columnsName[2] = "Telefone";
        columnsName[3] = "CPF";
        columnsName[4] = "RG";
        columnsName[5] = "Data de Nascimento";
        columnsName[6] = "Sexo";
        columnsName[7] = "Número da CNH";
        columnsName[8] = "Validade da CNH";
        columnsName[9] = "Observações";

        model.setColumnIdentifiers(columnsName);

        List<Motorista> list = dao.selectConsulta();

        Object rowData[] = new Object [10];
        for (int i = 0; i < dao.selectConsulta().size();i++) {
            rowData[0] = list.get(i).getCD_MOTORISTA();
            rowData[1] = list.get(i).getNm_motorista();
            rowData[2] = list.get(i).getTELEFONE_motorista();
            rowData[3] = list.get(i).getCpf_motorista();
            rowData[4] = list.get(i).getRg_motorista();
            //1997-08-21
            String diaNasc = list.get(i).getDT_NASC_MOTORISTA().substring(8,10);
            String mesNasc = list.get(i).getDT_NASC_MOTORISTA().substring(5,7);
            String anoNasc = list.get(i).getDT_NASC_MOTORISTA().substring(0,4);

            rowData[5] = diaNasc+"/"+mesNasc+"/"+anoNasc;
            rowData[6] = list.get(i).getSX_MOTORISTA();
            rowData[7] = list.get(i).getCnh_motorista();

            String diaCNH = list.get(i).getVAL_CNH_MOTORISTA().substring(8,10);
            String mesCNH = list.get(i).getVAL_CNH_MOTORISTA().substring(5,7);
            String anoCNH = list.get(i).getVAL_CNH_MOTORISTA().substring(0,4);

            rowData[8] = diaCNH+"/"+mesCNH+"/"+anoCNH;
            rowData[9] = list.get(i).getObs_motorista();
            model.addRow(rowData);

        }
        jTable1.setModel(model);
        jScrollPane2.getViewport().add(jTable1);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        btEditar.setText("Editar Registro");
        btEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarActionPerformed(evt);
            }
        });

        btVoltar.setText("Voltar");
        btVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarActionPerformed(evt);
            }
        });

        btExcluir.setText("Excluir Registro");
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btVoltar)
                        .addGap(24, 24, 24)
                        .addComponent(btEditar))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1209, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addComponent(jLabel15)
                .addGap(52, 52, 52)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 533, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btEditar)
                    .addComponent(btVoltar)
                    .addComponent(btExcluir))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1MouseClicked

    private void btEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarActionPerformed

        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        int linhaSelecionadaIndex = jTable1.getSelectedRow();

        Motorista motoristaalterar = new Motorista();

	motoristaalterar.setCD_MOTORISTA(Integer.parseInt(model.getValueAt(linhaSelecionadaIndex,0).toString()));
	motoristaalterar.setNm_motorista(model.getValueAt(linhaSelecionadaIndex,1).toString());
	motoristaalterar.setTELEFONE_motorista(model.getValueAt(linhaSelecionadaIndex,2).toString());
        motoristaalterar.setCpf_motorista(model.getValueAt(linhaSelecionadaIndex,3).toString());
        motoristaalterar.setRg_motorista(model.getValueAt(linhaSelecionadaIndex,4).toString());
        motoristaalterar.setDT_NASC_MOTORISTA(model.getValueAt(linhaSelecionadaIndex,5).toString());
        motoristaalterar.setSX_MOTORISTA(model.getValueAt(linhaSelecionadaIndex,6).toString());
        motoristaalterar.setCnh_motorista(model.getValueAt(linhaSelecionadaIndex,7).toString());
        motoristaalterar.setVAL_CNH_MOTORISTA(model.getValueAt(linhaSelecionadaIndex,8).toString());
        motoristaalterar.setObs_motorista(model.getValueAt(linhaSelecionadaIndex,9).toString());
        
        new CadastroMotorista(motoristaalterar);
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_btEditarActionPerformed

    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_btVoltarActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        int botaoDialogo = JOptionPane.YES_NO_OPTION;
        JOptionPane.showConfirmDialog(null,"Você tem certeza? Essa operação pode ser PERMANENTE!","EXCLUIR VEICULO", botaoDialogo);
        if(botaoDialogo == JOptionPane.YES_OPTION){
            DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
            int linhaSelecionadaIndex = jTable1.getSelectedRow();

            Motorista motoristaexcluir = new Motorista();

            motoristaexcluir.setCD_MOTORISTA(Integer.parseInt(model.getValueAt(linhaSelecionadaIndex,0).toString()));
            motoristaexcluir.setNm_motorista(model.getValueAt(linhaSelecionadaIndex,1).toString());
            motoristaexcluir.setTELEFONE_motorista(model.getValueAt(linhaSelecionadaIndex,2).toString());
            motoristaexcluir.setCpf_motorista(model.getValueAt(linhaSelecionadaIndex,3).toString());
            motoristaexcluir.setRg_motorista(model.getValueAt(linhaSelecionadaIndex,4).toString());
            motoristaexcluir.setDT_NASC_MOTORISTA(model.getValueAt(linhaSelecionadaIndex,5).toString());
            motoristaexcluir.setSX_MOTORISTA(model.getValueAt(linhaSelecionadaIndex,6).toString());
            motoristaexcluir.setCnh_motorista(model.getValueAt(linhaSelecionadaIndex,7).toString());
            motoristaexcluir.setVAL_CNH_MOTORISTA(model.getValueAt(linhaSelecionadaIndex,8).toString());
            motoristaexcluir.setObs_motorista(model.getValueAt(linhaSelecionadaIndex,9).toString());

            dao.delete(motoristaexcluir);
            this.dispose();
            new ConsultaMotorista();

        }
        if(botaoDialogo == JOptionPane.NO_OPTION){
            remove(botaoDialogo);
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_btExcluirActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btEditar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btVoltar;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}