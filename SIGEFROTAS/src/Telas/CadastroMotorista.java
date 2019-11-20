package Telas;

import Banco.Motorista;
import Banco.MotoristaDAO;
import java.awt.Frame;
import java.text.SimpleDateFormat;  
import java.util.Date;  
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
 *
 * @author matheusikenaga
 */
public class CadastroMotorista extends javax.swing.JFrame {
    
    private MotoristaDAO dao= new MotoristaDAO();
    private Motorista motorista = new Motorista();
    

    /**
     * Creates new form CadastroMotorista
     */
    public CadastroMotorista() {
        initComponents();
        this.setLocationRelativeTo(null);
        //this.setExtendedState(Frame.MAXIMIZED_BOTH);
        this.setVisible(true);
        this.cbSexo.setSelectedItem(null);
        this.cbAno.setSelectedItem(2019);

        preencheCbAno(cbAno);
    }
    
    public void preencheCbAno(JComboBox cb){
        int i = 2019;
        while(i>1930){
            cb.addItem(i);
            i--;
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tbCodMototista = new javax.swing.JTextField();
        tbNomeCadMot = new javax.swing.JTextField();
        tbSobrenomeCadMot = new javax.swing.JTextField();
        tbCpfCadMot = new javax.swing.JTextField();
        tbRG = new javax.swing.JTextField();
        tbNumCnh = new javax.swing.JTextField();
        tbVencCnh = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cbSexo = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        tbObs = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        btSave = new javax.swing.JButton();
        btCanc = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
        cbDia = new javax.swing.JComboBox<>();
        cbMes = new javax.swing.JComboBox<>();
        cbAno = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tbCodMototista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbCodMototistaActionPerformed(evt);
            }
        });

        tbSobrenomeCadMot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbSobrenomeCadMotActionPerformed(evt);
            }
        });

        jLabel1.setText("Código do Motorista");

        jLabel2.setText("Nome");

        jLabel3.setText("Sobrenome");

        jLabel4.setText(" CPF");

        jLabel5.setText(" RG");

        jLabel6.setText("Data de Nascimento");

        jLabel7.setText("  Número da CNH");

        jLabel8.setText("Vencimento CNH");

        jLabel9.setText("Sexo");

        cbSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Feminino"}));
        cbSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSexoActionPerformed(evt);
            }
        });

        jLabel10.setText("Observações");

        jLabel11.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel11.setText("Cadastro de Motoristas");

        btSave.setText("Salvar");
        btSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSaveActionPerformed(evt);
            }
        });

        btCanc.setText("Cancelar");
        btCanc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancActionPerformed(evt);
            }
        });

        btLimpar.setText("Limpar");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        cbDia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01","02","03","04","05","06","07","08","09","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31" }));
        cbDia.setSelectedItem("DIA");
        cbDia.setToolTipText("Dia");
        cbDia.setName("DIA"); // NOI18N

        cbMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01","02","03","04","05","06","07","08","09","10","11","12" }));
        cbMes.setToolTipText("Mês");

        cbAno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));
        cbAno.setToolTipText("Ano");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tbCpfCadMot, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1)
                                    .addComponent(tbCodMototista, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 234, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(cbSexo, 0, 278, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tbRG)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel7)
                                            .addComponent(tbNumCnh, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addComponent(tbNomeCadMot))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tbVencCnh)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 588, Short.MAX_VALUE))
                            .addComponent(tbSobrenomeCadMot)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cbDia, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cbMes, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cbAno, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(tbObs)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(btLimpar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btCanc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btSave)))
                .addGap(16, 16, 16))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tbCodMototista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tbNomeCadMot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tbSobrenomeCadMot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tbCpfCadMot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tbRG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 19, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tbNumCnh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tbVencCnh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tbObs, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 110, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCanc)
                    .addComponent(btSave)
                    .addComponent(btLimpar))
                .addGap(18, 18, 18))
        );

        cbDia.getAccessibleContext().setAccessibleName("DIA");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tbCodMototistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbCodMototistaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tbCodMototistaActionPerformed

    private void cbSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbSexoActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        
        // Acao do Botao para limpar todos os campos da tela de cadastro
        this.tbCodMototista.setText("");
        this.tbNomeCadMot.setText("");
        this.tbNumCnh.setText("");
        this.tbVencCnh.setText("");
        //this.tbDatanasc.setText("");
        this.tbCpfCadMot.setText("");
        this.tbRG.setText("");
        this.cbSexo.setSelectedItem(null);
        this.tbObs.setText("");
        this.tbSobrenomeCadMot.setText("");
        this.cbAno.setSelectedItem(null);
        
    }//GEN-LAST:event_btLimparActionPerformed

    private void btCancActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        //new TelaPreCadastro().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btCancActionPerformed

    private void tbSobrenomeCadMotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbSobrenomeCadMotActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tbSobrenomeCadMotActionPerformed

    private void btSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSaveActionPerformed
       
        SimpleDateFormat formatDT = new SimpleDateFormat("dd/MM/yyyy");
        
        // SERVE PARA VALIDAR SE A DATA ESTÁ SENDO SALVA CORRETAMENTE NA VARIAVEL sDataNasc
        /*       
        String sDataNasc = (this.cbDia.getSelectedItem().toString() + "/" +
                             this.cbMes.getSelectedItem().toString() + "/" +
                             this.cbAno.getSelectedItem().toString());
        JOptionPane.showMessageDialog(null,sDataNasc);
        */
        
        motorista.setNm_motorista(this.tbNomeCadMot.getText());
        motorista.setCnh_motorista (this.tbNumCnh.getText());

//CORRIGIR
        //motorista.setVAL_CNH_MOTORISTA(SimpleDateFormat("dd/MM/yyyy").parse(this.tbVencCnh.getText()));
        
        motorista.setDT_NASC_MOTORISTA(this.cbDia.getSelectedItem().toString() + "/" +
                             this.cbMes.getSelectedItem().toString() + "/" +
                             this.cbAno.getSelectedItem().toString());

        
        
        motorista.setCpf_motorista(this.tbCpfCadMot.getText());
        motorista.setRg_motorista(this.tbRG.getText());
        motorista.setSexo_motorista(Integer.parseInt(this.cbSexo.getSelectedItem().toString()));
        motorista.setObs_motorista(this.tbObs.getText());
        motorista.setSobrenome_motorista(this.tbSobrenomeCadMot.getText());
        dao.insert(motorista);
        this.dispose();
        
        
        /*
        //veiculo.setCD_VEICULO(Integer.parseInt(this.tbCodVeic.getText()));
        veiculo.setMarca_veiculo(this.tbMarcaVeic.getText());
        veiculo.setModelo_veiculo(this.tbModeloVeic.getText());
        veiculo.setCor_veiculo(this.tbCorVeic.getText ());
        veiculo.setPlaca_veiculo(this.tbPlacaVeic.getText());
        veiculo.setHODOM_VEICULO(Integer.parseInt(this.tbHodometroVeic.getText()));
        veiculo.setAno_veiculo(Integer.parseInt(this.cbAnoFabricacao.getSelectedItem().toString()));
        veiculo.setAno_modelo_veiculo(Integer.parseInt(this.cbAnoModelo.getSelectedItem().toString()));
        veiculo.setTipo_veiculo(this.cbTipoVeic.getSelectedItem().toString());
        veiculo.setDISPO_VEICULO(this.cbDispoVeic.getSelectedItem().toString());
        veiculo.setSeguro_veiculo(this.cbSeguradoraVeic.getSelectedItem().toString());
        veiculo.setNUM_APOLICE_VEICULO(this.tbNumApolice.getText());
        veiculo.setObs_veiculo(this.tbObsVeic.getText());
        dao.insert(veiculo);
        */
        
    }//GEN-LAST:event_btSaveActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCanc;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btSave;
    private javax.swing.JComboBox<String> cbAno;
    private javax.swing.JComboBox<String> cbDia;
    private javax.swing.JComboBox<String> cbMes;
    private javax.swing.JComboBox<String> cbSexo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField tbCodMototista;
    private javax.swing.JTextField tbCpfCadMot;
    private javax.swing.JTextField tbNomeCadMot;
    private javax.swing.JTextField tbNumCnh;
    private javax.swing.JTextField tbObs;
    private javax.swing.JTextField tbRG;
    private javax.swing.JTextField tbSobrenomeCadMot;
    private javax.swing.JTextField tbVencCnh;
    // End of variables declaration//GEN-END:variables

    private Object SimpleDateFormat(String ddMMyyyy) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
