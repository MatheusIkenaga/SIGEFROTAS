//<<<<<<< HEAD:SIGEFROTAS/src/CadastroVeiculo.java
//=======
package Telas.Veiculo;
//>>>>>>> 7a189340bc241aaa76b9f069ffa4514956f47860:SIGEFROTAS/src/Telas/CadastroVeiculo.java

import Banco.Veiculo.Veiculo;
import Banco.Veiculo.VeiculoDAO;
import java.awt.Frame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Matheus 
 */
public class CadastroVeiculo extends javax.swing.JFrame {
    
    private VeiculoDAO dao= new VeiculoDAO();
    private Veiculo veiculo = new Veiculo();

    
    /**
     * Creates new form Cad_Veiculo
     */
    public CadastroVeiculo() {
        this.setLocationRelativeTo(null);
        initComponents();
        this.setLocationRelativeTo(null);
        this.cbAnoFabricacao.setSelectedItem(null);
        this.cbAnoModelo.setSelectedItem(null);
        this.cbTipoVeic.setSelectedItem(null);
        this.cbDispoVeic.setSelectedItem(null);
        this.cbSeguradoraVeic.setSelectedItem(null);
        this.setVisible(true);
        
    }
    
        public CadastroVeiculo(Veiculo veiculo){
        initComponents();

        this.setLocationRelativeTo(null);
        
        this.tbCodVeic.setText(Integer.toString(veiculo.getCD_VEICULO()));
        this.tbMarcaVeic.setText(veiculo.getMarca_veiculo());
        this.tbModeloVeic.setText(veiculo.getModelo_veiculo());
        this.tbCorVeic.setText(veiculo.getCor_veiculo());
        this.tbPlacaVeic.setText(veiculo.getPlaca_veiculo());
        this.tbHodometroVeic.setText(Integer.toString(veiculo.getHODOM_VEICULO()));
        this.cbAnoModelo.setSelectedItem(Integer.toString(veiculo.getAno_veiculo()));
        this.cbAnoFabricacao.setSelectedItem(Integer.toString(veiculo.getAno_modelo_veiculo()));
        this.cbTipoVeic.setSelectedItem(veiculo.getTipo_veiculo());
        this.cbDispoVeic.setSelectedItem(veiculo.getDISPO_VEICULO());
        this.cbSeguradoraVeic.setSelectedItem(veiculo.getSeguro_veiculo());
        this.tbNumApolice.setText(veiculo.getNUM_APOLICE_VEICULO());
        this.tbObsVeic.setText(veiculo.getObs_veiculo());
        
        if(veiculo.getVEICULO_PROPRIO().equals("Sim")){
                this.btVeiculoProprio.setSelected(true);
            }
        if(veiculo.getVEICULO_PROPRIO().equals("Não")){
                this.btVeiculoProprio.setSelected(false);
            }
        
        
        
        
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        tbCodVeic = new javax.swing.JTextField();
        tbMarcaVeic = new javax.swing.JTextField();
        tbCorVeic = new javax.swing.JTextField();
        tbPlacaVeic = new javax.swing.JTextField();
        tbHodometroVeic = new javax.swing.JTextField();
        tbNumApolice = new javax.swing.JTextField();
        tbObsVeic = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        cbAnoFabricacao = new javax.swing.JComboBox<>();
        cbAnoModelo = new javax.swing.JComboBox<>();
        cbTipoVeic = new javax.swing.JComboBox<>();
        cbDispoVeic = new javax.swing.JComboBox<>();
        cbSeguradoraVeic = new javax.swing.JComboBox<>();
        btSalvarVeic = new javax.swing.JButton();
        btCancelarVeic = new javax.swing.JButton();
        btLimparVeic = new javax.swing.JButton();
        tbModeloVeic = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        btVeiculoProprio = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setPreferredSize(new java.awt.Dimension(1280, 720));
        setSize(new java.awt.Dimension(1280, 720));
        getContentPane().setLayout(null);

        tbCodVeic.setEnabled(false);
        tbCodVeic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbCodVeicActionPerformed(evt);
            }
        });
        getContentPane().add(tbCodVeic);
        tbCodVeic.setBounds(51, 124, 200, 26);

        tbMarcaVeic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbMarcaVeicActionPerformed(evt);
            }
        });
        getContentPane().add(tbMarcaVeic);
        tbMarcaVeic.setBounds(51, 191, 486, 26);

        tbCorVeic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbCorVeicActionPerformed(evt);
            }
        });
        getContentPane().add(tbCorVeic);
        tbCorVeic.setBounds(51, 264, 486, 26);

        tbPlacaVeic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbPlacaVeicActionPerformed(evt);
            }
        });
        getContentPane().add(tbPlacaVeic);
        tbPlacaVeic.setBounds(689, 264, 212, 26);

        tbHodometroVeic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbHodometroVeicActionPerformed(evt);
            }
        });
        getContentPane().add(tbHodometroVeic);
        tbHodometroVeic.setBounds(1000, 264, 221, 26);

        tbNumApolice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbNumApoliceActionPerformed(evt);
            }
        });
        getContentPane().add(tbNumApolice);
        tbNumApolice.setBounds(1004, 444, 217, 26);

        tbObsVeic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbObsVeicActionPerformed(evt);
            }
        });
        getContentPane().add(tbObsVeic);
        tbObsVeic.setBounds(53, 531, 1168, 104);

        jLabel1.setText(" Código do Veículo");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(51, 104, 119, 16);

        jLabel2.setText(" Marca do Veículo");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(51, 171, 111, 16);

        jLabel3.setText(" Modelo do Veículo");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(689, 171, 120, 16);

        jLabel4.setText(" Cor do Veículo");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(51, 244, 96, 16);

        jLabel5.setText(" Placa do Veículo");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(689, 244, 106, 16);

        jLabel6.setText(" Hodômetro (KM)");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(1000, 244, 106, 16);

        jLabel7.setText(" Ano de Fabricação");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(51, 325, 119, 16);

        jLabel8.setText(" Ano do Modelo");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(689, 325, 99, 16);

        jLabel9.setText(" Tipo do Veículo");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(51, 424, 102, 16);

        jLabel10.setText(" Disponibilidade");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(322, 424, 103, 16);

        jLabel11.setText(" Seguradora");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(689, 424, 74, 16);

        jLabel12.setText(" Número da Apólice");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(1004, 424, 124, 16);

        jLabel13.setText(" Observações");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(53, 511, 84, 16);

        cbAnoFabricacao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020" }));
        cbAnoFabricacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbAnoFabricacaoActionPerformed(evt);
            }
        });
        getContentPane().add(cbAnoFabricacao);
        cbAnoFabricacao.setBounds(51, 345, 486, 27);

        cbAnoModelo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020" }));
        getContentPane().add(cbAnoModelo);
        cbAnoModelo.setBounds(689, 345, 532, 27);

        cbTipoVeic.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Motocicleta", "Automóvel", "Caminhão" }));
        getContentPane().add(cbTipoVeic);
        cbTipoVeic.setBounds(51, 444, 206, 27);

        cbDispoVeic.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Disponível", "Indisponível", "Em Viagem", "Em Manutenção" }));
        getContentPane().add(cbDispoVeic);
        cbDispoVeic.setBounds(322, 444, 215, 27);

        cbSeguradoraVeic.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Porto Seguro", "Azul", "Sulamérica" }));
        getContentPane().add(cbSeguradoraVeic);
        cbSeguradoraVeic.setBounds(689, 444, 223, 27);

        btSalvarVeic.setText("Salvar");
        btSalvarVeic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarVeicActionPerformed(evt);
            }
        });
        getContentPane().add(btSalvarVeic);
        btSalvarVeic.setBounds(1150, 653, 71, 29);

        btCancelarVeic.setText("Cancelar");
        btCancelarVeic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarVeicActionPerformed(evt);
            }
        });
        getContentPane().add(btCancelarVeic);
        btCancelarVeic.setBounds(1046, 653, 98, 29);

        btLimparVeic.setText("Limpar");
        btLimparVeic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparVeicActionPerformed(evt);
            }
        });
        getContentPane().add(btLimparVeic);
        btLimparVeic.setBounds(53, 653, 87, 29);

        tbModeloVeic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbModeloVeicActionPerformed(evt);
            }
        });
        getContentPane().add(tbModeloVeic);
        tbModeloVeic.setBounds(689, 191, 532, 26);

        jLabel15.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel15.setText("Cadastro de Veículo");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(490, 30, 233, 30);

        btVeiculoProprio.setText("Veículo Próprio");
        getContentPane().add(btVeiculoProprio);
        btVeiculoProprio.setBounds(1070, 100, 139, 29);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tbCodVeicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbCodVeicActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tbCodVeicActionPerformed

    private void tbMarcaVeicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbMarcaVeicActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tbMarcaVeicActionPerformed

    private void tbCorVeicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbCorVeicActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tbCorVeicActionPerformed

    private void tbPlacaVeicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbPlacaVeicActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tbPlacaVeicActionPerformed

    private void tbHodometroVeicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbHodometroVeicActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tbHodometroVeicActionPerformed

    private void cbAnoFabricacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbAnoFabricacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbAnoFabricacaoActionPerformed

    private void tbNumApoliceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbNumApoliceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tbNumApoliceActionPerformed

    private void btLimparVeicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparVeicActionPerformed
        // TODO add your handling code here:
        this.tbCodVeic.setText("");
        this.tbMarcaVeic.setText("");
        this.tbModeloVeic.setText("");
        this.tbCorVeic.setText ("");
        this.tbPlacaVeic.setText("");
        this.tbHodometroVeic.setText("");
        this.cbAnoFabricacao.setSelectedItem(null);
        this.cbAnoModelo.setSelectedItem(null);
        this.cbTipoVeic.setSelectedItem(null);
        this.cbDispoVeic.setSelectedItem(null);
        this.cbSeguradoraVeic.setSelectedItem(null);
        this.tbNumApolice.setText("");
        this.tbObsVeic.setText("");
        this.btVeiculoProprio.setSelected(false);
    }//GEN-LAST:event_btLimparVeicActionPerformed

    private void tbObsVeicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbObsVeicActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tbObsVeicActionPerformed

    private void tbModeloVeicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbModeloVeicActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tbModeloVeicActionPerformed

    private void btCancelarVeicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarVeicActionPerformed
        if(this.tbCodVeic.getText().isEmpty()){
        this.dispose();
        }else{
        new ConsultaVeiculo();
        this.dispose();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btCancelarVeicActionPerformed

    private void btSalvarVeicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarVeicActionPerformed
        
        //veiculo.setCD_VEICULO(Integer.parseInt(this.tbCodVeic.getText()));
        
        if(this.tbCodVeic.getText().isEmpty()){
            veiculo.setMarca_veiculo(this.tbMarcaVeic.getText());
            veiculo.setModelo_veiculo(this.tbModeloVeic.getText());
            veiculo.setCor_veiculo(this.tbCorVeic.getText ());
            veiculo.setPlaca_veiculo(this.tbPlacaVeic.getText());
            veiculo.setHODOM_VEICULO(Integer.parseInt(this.tbHodometroVeic.getText().toString()));
            veiculo.setAno_veiculo(Integer.parseInt(this.cbAnoFabricacao.getSelectedItem().toString()));
            veiculo.setAno_modelo_veiculo(Integer.parseInt(this.cbAnoModelo.getSelectedItem().toString()));
            veiculo.setTipo_veiculo(this.cbTipoVeic.getSelectedItem().toString());
            veiculo.setDISPO_VEICULO(this.cbDispoVeic.getSelectedItem().toString());
            veiculo.setSeguro_veiculo(this.cbSeguradoraVeic.getSelectedItem().toString());
            veiculo.setNUM_APOLICE_VEICULO(this.tbNumApolice.getText());
            veiculo.setObs_veiculo(this.tbObsVeic.getText());
            if(this.btVeiculoProprio.isSelected()){
                veiculo.setVEICULO_PROPRIO("Sim");
            }else{
                veiculo.setVEICULO_PROPRIO("Não");
            }
            dao.insert(veiculo);
        
            this.dispose();
            
        }else if(this.tbCodVeic.getText() != null){
            veiculo.setCD_VEICULO(Integer.parseInt(this.tbCodVeic.getText()));
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
            if(this.btVeiculoProprio.isSelected()){
                veiculo.setVEICULO_PROPRIO("Sim");
            }else{
                veiculo.setVEICULO_PROPRIO("Não");
            }
            dao.update(veiculo);
            
            new ConsultaVeiculo();
            this.dispose();
            
        }
        
        // TODO add your handling code here:
    }//GEN-LAST:event_btSalvarVeicActionPerformed

    /**
     * @param args the command line arguments
     */
    //public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
    
    /*
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CadastroVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    */
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        /*
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroVeiculo().setVisible(true);
            }
        });
    }
*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancelarVeic;
    private javax.swing.JButton btLimparVeic;
    private javax.swing.JButton btSalvarVeic;
    private javax.swing.JToggleButton btVeiculoProprio;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbAnoFabricacao;
    private javax.swing.JComboBox<String> cbAnoModelo;
    private javax.swing.JComboBox<String> cbDispoVeic;
    private javax.swing.JComboBox<String> cbSeguradoraVeic;
    private javax.swing.JComboBox<String> cbTipoVeic;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField tbCodVeic;
    private javax.swing.JTextField tbCorVeic;
    private javax.swing.JTextField tbHodometroVeic;
    private javax.swing.JTextField tbMarcaVeic;
    private javax.swing.JTextField tbModeloVeic;
    private javax.swing.JTextField tbNumApolice;
    private javax.swing.JTextField tbObsVeic;
    private javax.swing.JTextField tbPlacaVeic;
    // End of variables declaration//GEN-END:variables
}
