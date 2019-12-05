/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas.Peca;

import Banco.Pecas.Peca;
import Banco.Pecas.PecaDAO;
import Banco.Veiculo.VeiculoDAO;

/**
 *
 * @author matheusikenaga
 */
public class CadastroPeca extends javax.swing.JFrame {
    VeiculoDAO veicDAO = new VeiculoDAO();
    PecaDAO dao = new PecaDAO();
    Peca peca = new Peca();
    /**
     * Creates new form CadastroPeca
     */
    public CadastroPeca() {
        initComponents();
        this.setLocationRelativeTo(null);
        veicDAO.preencheCB(cbVeiculo);
    }
    public CadastroPeca(Peca peca) {
        initComponents();
        this.setLocationRelativeTo(null);
        veicDAO.preencheCB(cbVeiculo);
        this.tbCodPeca.setText(Integer.toString(peca.getCd_peca()));
        this.tbNomePeca.setText(peca.getNome_peca());
        this.tbQuantidadePeca.setText(Integer.toString(peca.getQtd_peca()));
        this.tbValorPeca.setText(Float.toString(peca.getValor_peca()));
        this.cbVeiculo.setSelectedItem(dao.selectVeicPeca(peca.getCd_peca()));
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

        jLabel11 = new javax.swing.JLabel();
        btLimpar = new javax.swing.JButton();
        btCanc = new javax.swing.JButton();
        btSave = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        tbQuantidadePeca = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tbValorPeca = new javax.swing.JTextField();
        tbNomePeca = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cbVeiculo = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        tbCodPeca = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setSize(new java.awt.Dimension(1280, 720));

        jLabel11.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel11.setText("Cadastro de Peças");

        btLimpar.setText("Limpar");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        btCanc.setText("Cancelar");
        btCanc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancActionPerformed(evt);
            }
        });

        btSave.setText("Salvar");
        btSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSaveActionPerformed(evt);
            }
        });

        tbQuantidadePeca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbQuantidadePecaActionPerformed(evt);
            }
        });

        jLabel4.setText("Valor da Peça");

        jLabel1.setText("Código da Peça");

        jLabel3.setText("Quantidade em Estoque");

        tbNomePeca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbNomePecaActionPerformed(evt);
            }
        });

        jLabel2.setText("Nome da Peça");

        cbVeiculo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {""}));

        jLabel6.setText("Veículo");

        tbCodPeca.setEnabled(false);
        tbCodPeca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbCodPecaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2)
                    .addComponent(tbCodPeca, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(cbVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(tbQuantidadePeca, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tbValorPeca, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)))
                    .addComponent(tbNomePeca))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tbCodPeca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tbNomePeca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tbValorPeca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tbQuantidadePeca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(541, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addGap(528, 528, 528))
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(btLimpar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btCanc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btSave)
                .addGap(23, 23, 23))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(jLabel11)
                .addGap(145, 145, 145)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(193, 193, 193)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCanc)
                    .addComponent(btSave)
                    .addComponent(btLimpar))
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tbCodPecaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbCodPecaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tbCodPecaActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        this.tbCodPeca.setText("");
        this.tbNomePeca.setText("");
        this.tbQuantidadePeca.setText("");
        this.tbValorPeca.setText("");
        this.cbVeiculo.setSelectedItem("");
        // Acao do Botao para limpar todos os campos da tela de cadastro
        

    }//GEN-LAST:event_btLimparActionPerformed

    private void btCancActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancActionPerformed
        if(this.tbCodPeca.getText().isEmpty()){
        this.dispose();
        }else{
        new ConsultaPeca();
        this.dispose();
        }
    }//GEN-LAST:event_btCancActionPerformed

    private void tbNomePecaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbNomePecaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tbNomePecaActionPerformed

    private void tbQuantidadePecaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbQuantidadePecaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tbQuantidadePecaActionPerformed

    private void btSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSaveActionPerformed
        if(this.tbCodPeca.getText().isEmpty()){
            peca.setNome_peca(this.tbNomePeca.getText());
            peca.setQtd_peca(Integer.parseInt(this.tbQuantidadePeca.getText()));
            peca.setValor_peca(Float.parseFloat(this.tbValorPeca.getText()));
            
            String cdVeicPeca = this.cbVeiculo.getSelectedItem().toString();
            int iend2 = cdVeicPeca.indexOf("-");
            if (iend2 != -1){
            peca.setCD_VEIC_PECA(Integer.parseInt(cdVeicPeca.substring(0, iend2)));
            }
            dao.insert(peca);
            this.dispose();
            
        }else{
            peca.setCd_peca(Integer.parseInt(this.tbCodPeca.getText()));
            peca.setNome_peca(this.tbNomePeca.getText());
            peca.setQtd_peca(Integer.parseInt(this.tbQuantidadePeca.getText()));
            peca.setValor_peca(Float.parseFloat(this.tbValorPeca.getText()));
            
            String cdVeicPeca = this.cbVeiculo.getSelectedItem().toString();
            int iend2 = cdVeicPeca.indexOf("-");
            if (iend2 != -1){
            peca.setCD_VEIC_PECA(Integer.parseInt(cdVeicPeca.substring(0, iend2)));
            }
            dao.update(peca);
            this.dispose();
            new ConsultaPeca();     
        }
    }//GEN-LAST:event_btSaveActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCanc;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btSave;
    private javax.swing.JComboBox<String> cbVeiculo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField tbCodPeca;
    private javax.swing.JTextField tbNomePeca;
    private javax.swing.JTextField tbQuantidadePeca;
    private javax.swing.JTextField tbValorPeca;
    // End of variables declaration//GEN-END:variables
}