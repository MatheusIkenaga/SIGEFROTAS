/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

import Banco.Motorista.MotoristaDAO;
import Banco.Veiculo.VeiculoDAO;
import Banco.Viagem.Viagem;
import Banco.Viagem.ViagemDAO;
import javax.swing.JOptionPane;

/**
 *
 * @author matheusikenaga
 */
public class CadastroViagem extends javax.swing.JFrame {

    VeiculoDAO veicDAO = new VeiculoDAO();
    MotoristaDAO motoDAO = new MotoristaDAO();
    ViagemDAO dao = new ViagemDAO();
    Viagem viagem = new Viagem();
    /**
     * Creates new form CadastroViagem
     */
    
    
    
    public CadastroViagem() {
        //this.setLocationRelativeTo(null);
        initComponents();
        this.setLocationRelativeTo(null);
        this.cbOrigem.setSelectedItem(null);
        this.cbDestino.setSelectedItem(null);
        this.cbTipoViagem.setSelectedItem(null);
        this.cbMotorista.setSelectedItem(null);
        this.cbVeiculo.setSelectedItem(null);
        veicDAO.preencheCB(cbVeiculo);
        motoDAO.preencheCB(cbMotorista);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        tbCidadeOrigem = new javax.swing.JTextField();
        tbCidadeDestino = new javax.swing.JTextField();
        tbValorViagem = new javax.swing.JTextField();
        tbDistanciaViagem = new javax.swing.JTextField();
        tbObsViagem = new javax.swing.JTextField();
        tbMotivoViagem = new javax.swing.JTextField();
        cbTipoViagem = new javax.swing.JComboBox<>();
        btLimpar = new javax.swing.JButton();
        btCanc = new javax.swing.JButton();
        btSave = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        cbVeiculo = new javax.swing.JComboBox<>();
        cbMotorista = new javax.swing.JComboBox<>();
        cbOrigem = new javax.swing.JComboBox<>();
        cbDestino = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        tbCodViagem = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setSize(new java.awt.Dimension(1280, 720));

        cbTipoViagem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chamado Técnico", "Manutencão Preventiva", "Outros" }));

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

        jLabel1.setText("Motorista");

        jLabel2.setText("Veículo");

        jLabel4.setText("UF Destino");

        jLabel5.setText("Cidade Destino");

        jLabel6.setText("UF Origem");

        jLabel7.setText("Cidade Origem");

        jLabel8.setText("Distância Viagem (KM)");

        jLabel9.setText("Tipo da Viagem");

        jLabel10.setText("Motivo da Viagem");

        jLabel11.setText("Valor da Viagem");

        jLabel12.setText("Observações");

        cbVeiculo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {""}));

        cbMotorista.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));

        cbOrigem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC - Acre", "AL - Alagoas", "AM - Amazonas", "AP - Amapá", "BA - Bahia", "CE - Ceará","DF - Distrito Federal","ES - Espírito Santo","GO - Goiás","MA - Maranhão","MG - Minas Gerais","MS - Mato Grosso do Sul","MT - Mato Grosso","PA - Pará","PB - Paraíba","PE - Penambuco","PI - Piauí","PR - Paraná","RJ - Rio de Janeiro","RN - Rio Grande do Norte","RO - Rondônia","RR - Roraima","RS - Rio Grande do Sul","SC - Santa Catarina","SE - Sergipe","SP - São Paulo","TO - Tocantins", }));
        cbOrigem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbOrigemActionPerformed(evt);
            }
        });

        cbDestino.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC - Acre", "AL - Alagoas", "AM - Amazonas", "AP - Amapá", "BA - Bahia", "CE - Ceará","DF - Distrito Federal","ES - Espírito Santo","GO - Goiás","MA - Maranhão","MG - Minas Gerais","MS - Mato Grosso do Sul","MT - Mato Grosso","PA - Pará","PB - Paraíba","PE - Penambuco","PI - Piauí","PR - Paraná","RJ - Rio de Janeiro","RN - Rio Grande do Norte","RO - Rondônia","RR - Roraima","RS - Rio Grande do Sul","SC - Santa Catarina","SE - Sergipe","SP - São Paulo","TO - Tocantins", }));
        cbDestino.setPreferredSize(new java.awt.Dimension(154, 25));
        cbDestino.setSize(new java.awt.Dimension(154, 25));

        jLabel13.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel13.setText("Cadastro de Viagem");

        tbCodViagem.setEnabled(false);

        jLabel3.setText("Código da Viagem");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(btLimpar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(511, 511, 511)
                        .addComponent(jLabel13))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(216, 216, 216)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(tbCidadeDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel5))
                                    .addGap(32, 32, 32)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4)
                                        .addComponent(cbDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(100, 100, 100)
                                    .addComponent(jLabel9)
                                    .addGap(203, 203, 203)
                                    .addComponent(jLabel10))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel11)
                                    .addGap(189, 189, 189)
                                    .addComponent(jLabel12))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(tbValorViagem, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(tbDistanciaViagem, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(80, 80, 80)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(cbTipoViagem, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(90, 90, 90)
                                            .addComponent(tbMotivoViagem, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(tbObsViagem, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(tbCodViagem))
                                    .addGap(37, 37, 37)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel1)
                                            .addGap(0, 0, Short.MAX_VALUE))
                                        .addComponent(cbMotorista, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(cbVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tbCidadeOrigem, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7))
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbOrigem, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))))))
                .addGap(61, 61, 61)
                .addComponent(btCanc)
                .addGap(6, 6, 6)
                .addComponent(btSave)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(jLabel13)
                .addGap(87, 87, 87)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(4, 4, 4))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(7, 7, 7)
                                .addComponent(tbCodViagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbMotorista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tbCidadeOrigem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbOrigem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tbCidadeDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tbDistanciaViagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbTipoViagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tbMotivoViagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel12)))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tbValorViagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tbObsViagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btLimpar)
                    .addComponent(btCanc)
                    .addComponent(btSave))
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed

        // Acao do Botao para limpar todos os campos da tela de cadastro
        this.cbMotorista.setSelectedItem(null);
        this.cbVeiculo.setSelectedItem(null);
        this.tbCodViagem.setText("");
        this.tbCidadeOrigem.setText("");
        this.tbCidadeDestino.setText("");
        this.cbOrigem.setSelectedItem(null);
        this.cbDestino.setSelectedItem(null);
        this.cbTipoViagem.setSelectedItem(null);
        this.tbObsViagem.setText("");
        this.tbDistanciaViagem.setText("");
        this.tbMotivoViagem.setText("");
        this.tbValorViagem.setText("");

    }//GEN-LAST:event_btLimparActionPerformed

    private void btCancActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        //new TelaPreCadastro().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btCancActionPerformed

    private void cbOrigemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbOrigemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbOrigemActionPerformed

    private void btSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSaveActionPerformed
        
        viagem.setORIGEM_VIAGEM(this.tbCidadeOrigem.getText());
        viagem.setEST_ORIGEM_VIAGEM(this.cbOrigem.getSelectedItem().toString());
        viagem.setDEST_VIAGEM(this.tbCidadeDestino.getText());
        viagem.setEST_DEST_VIAGEM(this.cbDestino.getSelectedItem().toString());
        viagem.setKM_VIAGEM(Float.parseFloat(this.tbDistanciaViagem.getText()));
        viagem.setTIPO_VIAGEM(this.cbTipoViagem.getSelectedItem().toString());
        viagem.setMOTIVO_VIAGEM(this.tbMotivoViagem.getText());
        viagem.setVALOR_VIAGEM(Float.parseFloat(this.tbValorViagem.getText()));
        viagem.setOBS_VIAGEM(this.tbObsViagem.getText());
        
        
        String cdMotViagem = this.cbMotorista.getSelectedItem().toString();
        int iend = cdMotViagem.indexOf("-");
        if (iend != -1){
        viagem.setCD_MOTORISTA_VIAGEM(Integer.parseInt(cdMotViagem.substring(0, iend)));
        }
        
        String cdVeicViagem = this.cbVeiculo.getSelectedItem().toString();
        int iend2 = cdVeicViagem.indexOf("-");
        if (iend2 != -1){
        viagem.setCD_VEICULO_VIAGEM(Integer.parseInt(cdVeicViagem.substring(0, iend2)));
        }
        dao.insert(viagem);
        

        // TODO add your handling code here:
    }//GEN-LAST:event_btSaveActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCanc;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btSave;
    private javax.swing.JComboBox<String> cbDestino;
    private javax.swing.JComboBox<String> cbMotorista;
    private javax.swing.JComboBox<String> cbOrigem;
    private javax.swing.JComboBox<String> cbTipoViagem;
    private javax.swing.JComboBox<String> cbVeiculo;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField tbCidadeDestino;
    private javax.swing.JTextField tbCidadeOrigem;
    private javax.swing.JTextField tbCodViagem;
    private javax.swing.JTextField tbDistanciaViagem;
    private javax.swing.JTextField tbMotivoViagem;
    private javax.swing.JTextField tbObsViagem;
    private javax.swing.JTextField tbValorViagem;
    // End of variables declaration//GEN-END:variables
}
