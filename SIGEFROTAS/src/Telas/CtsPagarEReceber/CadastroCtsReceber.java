/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Telas.CtsPagarEReceber;

import Banco.CtsPagarEReceber.ContaReceber;
import Banco.CtsPagarEReceber.ContaReceberDAO;
import Banco.Veiculo.VeiculoDAO;
import java.awt.event.ItemEvent;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author matheusikenaga
 */
public class CadastroCtsReceber extends javax.swing.JFrame {

    VeiculoDAO veicDAO = new VeiculoDAO();
    ContaReceber conta = new ContaReceber();
    ContaReceberDAO dao = new ContaReceberDAO();
    /** Creates new form CadastroCtsReceber */
    public CadastroCtsReceber() {
        initComponents();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        cbCategoria.setSelectedItem("");
        veicDAO.preencheCBAluguel(cbVeiculo);
        cbVeiculo.setSelectedItem("");
        this.dcPagto.setDateFormatString("dd/MM/yyyy");
        this.tbStatus.setText("Em aberto");
        this.lblData.setText("Previsão de Recebimento");
        this.tbTotalPago.setText("0");
    }

    public CadastroCtsReceber(ContaReceber conta){
        initComponents();
        veicDAO.preencheCBAluguel(cbVeiculo);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.dcPagto.setDateFormatString("dd/MM/yyyy");
        
        this.tbCodCtsReceber.setText(Integer.toString(conta.getCD_CONTA()));
        this.tbTotalConta.setText(Float.toString(conta.getTOTAL_CONTA()));
        this.tbTotalPago.setText(Float.toString(conta.getTOTAL_RECEBIDO()));
        this.tbStatus.setText(conta.getSTATUS_CONTA());
        
        
        String dtSetConta = (conta.getDT_RECEBIDO().substring(6, 10) + "-"+
                             conta.getDT_RECEBIDO().substring(3,5) + "-"+
                             conta.getDT_RECEBIDO().substring(0,2));
        try{
            Date dtCta = new SimpleDateFormat("yyyy-MM-dd").parse(dtSetConta);
            this.dcPagto.setDate(dtCta);
            this.dcPagto.setDateFormatString("dd/MM/yyyy");
        }catch(ParseException ex) {
            Logger.getLogger(CadastroCtsPagar.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        this.cbCategoria.setSelectedItem(conta.getCATEGORIA());
        this.cbVeiculo.setSelectedItem(dao.selectVeicConta(conta.getCD_CONTA()));
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel11 = new javax.swing.JLabel();
        cbCategoria = new javax.swing.JComboBox<>();
        tbTotalConta = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cbVeiculo = new javax.swing.JComboBox<>();
        lbVeiculo = new javax.swing.JLabel();
        tbTotalPago = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btPagarAgora = new javax.swing.JButton();
        btReverterPagto = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        tbCodCtsReceber = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        tbStatus = new javax.swing.JTextField();
        btLimpar = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        dcPagto = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        lblData = new javax.swing.JLabel();
        btBaixaParcial = new javax.swing.JButton();
        tbPagtoParcial = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        tbObs = new javax.swing.JTextField();
        btSave = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setSize(new java.awt.Dimension(1280, 720));

        jLabel11.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel11.setText("Cadastro de Conta a Receber");

        cbCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "","Aluguel", "Mensalidade", "Outros"}));
        cbCategoria.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbCategoriaItemStateChanged(evt);
            }
        });

        tbTotalConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbTotalContaActionPerformed(evt);
            }
        });

        jLabel1.setText("Categoria");

        jLabel2.setText("Valor total da Conta");

        cbVeiculo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));

        lbVeiculo.setText("Veículo");

        tbTotalPago.setEnabled(false);
        tbTotalPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbTotalPagoActionPerformed(evt);
            }
        });

        jLabel4.setText("Total Recebido");

        btPagarAgora.setText("Receber Agora");
        btPagarAgora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPagarAgoraActionPerformed(evt);
            }
        });

        btReverterPagto.setText("Reverter Recebimento");

        jLabel6.setText("Código");

        tbCodCtsReceber.setEnabled(false);

        jLabel8.setText("Status:");

        tbStatus.setEnabled(false);

        btLimpar.setText("Limpar");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        btCancelar.setText("Cancelar");
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jLabel5.setText("Registrar Recebimento");

        lblData.setText("Data do Recebimento");

        btBaixaParcial.setText("Registrar Baixa Parcial");
        btBaixaParcial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBaixaParcialActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5)
                    .addComponent(tbPagtoParcial)
                    .addComponent(btBaixaParcial, javax.swing.GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE)
                    .addComponent(lblData)
                    .addComponent(dcPagto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tbPagtoParcial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblData)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dcPagto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(btBaixaParcial)
                .addGap(16, 16, 16))
        );

        jLabel9.setText("Observações");

        btSave.setText("Salvar");
        btSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(167, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tbCodCtsReceber, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel2)
                                            .addComponent(tbTotalConta)
                                            .addComponent(tbTotalPago, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE))
                                        .addGap(78, 78, 78)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(lbVeiculo)
                                            .addComponent(cbVeiculo, 0, 267, Short.MAX_VALUE)
                                            .addComponent(jLabel1)
                                            .addComponent(cbCategoria, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel9)
                                    .addComponent(tbObs))
                                .addGap(80, 80, 80)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(tbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(146, 146, 146)
                                .addComponent(btPagarAgora, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(117, 117, 117)
                                .addComponent(btReverterPagto, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(471, 471, 471)
                        .addComponent(jLabel11)
                        .addGap(0, 338, Short.MAX_VALUE)))
                .addContainerGap(134, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(btLimpar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btCancelar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btSave)
                .addGap(36, 36, 36))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(jLabel11)
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8)
                    .addComponent(tbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tbCodCtsReceber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tbTotalConta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(19, 19, 19)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tbTotalPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lbVeiculo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tbObs, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btPagarAgora)
                    .addComponent(btReverterPagto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 121, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btLimpar)
                    .addComponent(btCancelar)
                    .addComponent(btSave))
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbCategoriaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbCategoriaItemStateChanged

    }//GEN-LAST:event_cbCategoriaItemStateChanged

    private void tbTotalContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbTotalContaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tbTotalContaActionPerformed

    private void tbTotalPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbTotalPagoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tbTotalPagoActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        this.tbTotalConta.setText("0");
        this.tbTotalPago.setText("0");
        this.tbStatus.setText("Em Aberto");
        this.tbPagtoParcial.setText("");
        this.tbObs.setText("");
        this.cbCategoria.setSelectedItem("");
        this.cbVeiculo.setSelectedItem("");
        // TODO add your handling code here:

    }//GEN-LAST:event_btLimparActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        if(this.tbCodCtsReceber.getText().isEmpty()){
            this.dispose();
        }else{
            //new ConsultaCtsReceber();
            this.dispose();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btCancelarActionPerformed

    private void btPagarAgoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPagarAgoraActionPerformed
        this.tbTotalPago.setText(this.tbTotalConta.getText());
        Date date=java.util.Calendar.getInstance().getTime();
        this.dcPagto.setDate(date);
        this.dcPagto.setDateFormatString("dd/MM/yyyy");
        this.lblData.setText("Data do Recebimento");
        this.tbStatus.setText("Recebido");
// TODO add your handling code here:
    }//GEN-LAST:event_btPagarAgoraActionPerformed

    private void btBaixaParcialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBaixaParcialActionPerformed
        Date datee = this.dcPagto.getDate();
        if(datee == null){
            JOptionPane.showMessageDialog(null, "Preencha a Data");
        }else{
            this.tbTotalPago.setText(this.tbPagtoParcial.getText());
            if(Float.parseFloat(this.tbPagtoParcial.getText())>Float.parseFloat(this.tbTotalConta.getText())){
                JOptionPane.showMessageDialog(null, "Valor Inválido");
            }
            if(Float.parseFloat(this.tbPagtoParcial.getText()) == Float.parseFloat(this.tbTotalConta.getText())){
                this.tbStatus.setText("Recebido");
                this.lblData.setText("Data do Recebimento");
            }
            if(Float.parseFloat(this.tbPagtoParcial.getText())<Float.parseFloat(this.tbTotalConta.getText())){
                this.tbStatus.setText("Recebido Parcialmente");
                this.lblData.setText("Data do Recebimento");
                this.tbObs.setText("Resta receber R$ "+ (Float.parseFloat(this.tbTotalConta.getText())- Float.parseFloat(this.tbPagtoParcial.getText())));
            
            }
        }
    }//GEN-LAST:event_btBaixaParcialActionPerformed

    private void btSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSaveActionPerformed
        //***********VALIDANDO SE TA TUDO PREENCHIDO**************
        Date datee = this.dcPagto.getDate();
        if(datee == null){
            JOptionPane.showMessageDialog(null, "Preencha a Data");
        }
        if(this.cbCategoria.getSelectedItem().toString().equals("")){
            JOptionPane.showMessageDialog(null, "Preencha a Categoria");
        }
        if(this.cbVeiculo.getSelectedItem().toString().equals("")){
            JOptionPane.showMessageDialog(null, "Preencha o Veículo");
        }
        if(this.tbTotalConta.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Preencha o valor total da conta");
        }
        if(datee != null&&
            this.cbCategoria.getSelectedItem().toString() != ""&&
            this.cbVeiculo.getSelectedItem().toString() !=""&&
            this.tbTotalConta.getText() != null){
            try{
                //******************************Significa NOVO cadastro***************
                if(this.tbCodCtsReceber.getText().isEmpty()){

                    DateFormat df = new SimpleDateFormat("yyyy/MM/dd");
                    conta.setTOTAL_CONTA(Float.parseFloat(this.tbTotalConta.getText()));
                    conta.setTOTAL_RECEBIDO(Float.parseFloat(this.tbTotalPago.getText()));
                    conta.setSTATUS_CONTA(this.tbStatus.getText());
                    conta.setDT_RECEBIDO(df.format(this.dcPagto.getDate()));
                    conta.setCATEGORIA(this.cbCategoria.getSelectedItem().toString());
                    //Pega só o Código do Veiculo e passa para a Conta
                    String cdVeicViagem = this.cbVeiculo.getSelectedItem().toString();
                    int iend = cdVeicViagem.indexOf("-");
                    if (iend != -1){
                        conta.setCD_VEIC_CONTA(Integer.parseInt(cdVeicViagem.substring(0, iend)));
                    }
                    conta.setOBS_CONTA(this.tbObs.getText());
                    dao.insert(conta);
                    this.dispose();
                }else{
                    // *******************Significa EDICAO de cadastro*****************************
                    conta.setCD_CONTA(Integer.parseInt(this.tbCodCtsReceber.getText()));
                    DateFormat df = new SimpleDateFormat("yyyy/MM/dd");
                    conta.setTOTAL_CONTA(Float.parseFloat(this.tbTotalConta.getText()));
                    conta.setTOTAL_RECEBIDO(Float.parseFloat(this.tbTotalPago.getText()));
                    conta.setSTATUS_CONTA(this.tbStatus.getText());
                    conta.setDT_RECEBIDO(df.format(this.dcPagto.getDate()));
                    conta.setCATEGORIA(this.cbCategoria.getSelectedItem().toString());
                    //Pega só o Código do Veiculo e passa para a Conta
                    String cdVeicViagem = this.cbVeiculo.getSelectedItem().toString();
                    int iend = cdVeicViagem.indexOf("-");
                    if (iend != -1){
                        conta.setCD_VEIC_CONTA(Integer.parseInt(cdVeicViagem.substring(0, iend)));
                    }
                    conta.setOBS_CONTA(this.tbObs.getText());
                    dao.update(conta);
                    //new ConsultarContaReceber();
                    this.dispose();

                }
            }catch(Exception e){
                System.out.println(e);
            }
        }

    }//GEN-LAST:event_btSaveActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBaixaParcial;
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btPagarAgora;
    private javax.swing.JButton btReverterPagto;
    private javax.swing.JButton btSave;
    private javax.swing.JComboBox<String> cbCategoria;
    private javax.swing.JComboBox<String> cbVeiculo;
    private com.toedter.calendar.JDateChooser dcPagto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbVeiculo;
    private javax.swing.JLabel lblData;
    private javax.swing.JTextField tbCodCtsReceber;
    private javax.swing.JTextField tbObs;
    private javax.swing.JTextField tbPagtoParcial;
    private javax.swing.JTextField tbStatus;
    private javax.swing.JTextField tbTotalConta;
    private javax.swing.JTextField tbTotalPago;
    // End of variables declaration//GEN-END:variables

}
