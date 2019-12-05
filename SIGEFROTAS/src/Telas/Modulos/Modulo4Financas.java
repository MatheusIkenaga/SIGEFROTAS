/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas.Modulos;

import Telas.CtsPagarEReceber.CadastroCtsPagar;
import Telas.CtsPagarEReceber.CadastroCtsReceber;
import Telas.CtsPagarEReceber.ConsultaCtsPagar;
import Telas.CtsPagarEReceber.ConsultaCtsReceber;
import java.awt.Frame;

/**
 *
 * @author matheusikenaga
 */
public class Modulo4Financas extends javax.swing.JFrame {

    /**
     * Creates new form Modulo4
     */
    public Modulo4Financas() {
        initComponents();
        this.setExtendedState(Frame.MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        btSIGEGFROTAS = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btModComprasEAbast = new javax.swing.JButton();
        btModFinancas = new javax.swing.JButton();
        btModLocacao = new javax.swing.JButton();
        btModGerFrota = new javax.swing.JButton();
        btModCadastros = new javax.swing.JButton();
        btModComprasEAbast1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btConsultCtsPagar = new javax.swing.JButton();
        btInsCtsPagar = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        btInsCtsReceber = new javax.swing.JButton();
        btConsultCtsReceber = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setAlignmentX(0.0F);
        jPanel2.setAlignmentY(0.0F);
        jPanel2.setPreferredSize(new java.awt.Dimension(1280, 119));
        jPanel2.setSize(new java.awt.Dimension(1920, 119));

        btSIGEGFROTAS.setIcon(new javax.swing.ImageIcon("/Users/matheusikenaga/NetBeansProjects/SIGEFROTAS/SIGEFROTAS/imgJAVA/sige logo 88x88.png")); // NOI18N
        btSIGEGFROTAS.setToolTipText("Voltar para Tela Inicial");
        btSIGEGFROTAS.setBorderPainted(false);
        btSIGEGFROTAS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSIGEGFROTASActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));

        btModComprasEAbast.setIcon(new javax.swing.ImageIcon("/Users/matheusikenaga/NetBeansProjects/SIGEFROTAS/SIGEFROTAS/imgJAVA/img painel/compras-abast.png")); // NOI18N
        btModComprasEAbast.setToolTipText("Compras e Abastecimento");
        btModComprasEAbast.setMaximumSize(new java.awt.Dimension(89, 89));
        btModComprasEAbast.setMinimumSize(new java.awt.Dimension(89, 89));
        btModComprasEAbast.setPreferredSize(new java.awt.Dimension(89, 89));
        btModComprasEAbast.setSize(new java.awt.Dimension(89, 89));
        btModComprasEAbast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btModComprasEAbastActionPerformed(evt);
            }
        });

        btModFinancas.setIcon(new javax.swing.ImageIcon("/Users/matheusikenaga/NetBeansProjects/SIGEFROTAS/SIGEFROTAS/imgJAVA/img painel/financeiro.png")); // NOI18N
        btModFinancas.setToolTipText("Finanças");
        btModFinancas.setMaximumSize(new java.awt.Dimension(89, 89));
        btModFinancas.setMinimumSize(new java.awt.Dimension(89, 89));
        btModFinancas.setPreferredSize(new java.awt.Dimension(89, 89));
        btModFinancas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btModFinancasActionPerformed(evt);
            }
        });

        btModLocacao.setIcon(new javax.swing.ImageIcon("/Users/matheusikenaga/NetBeansProjects/SIGEFROTAS/SIGEFROTAS/imgJAVA/img painel/locacao.png")); // NOI18N
        btModLocacao.setToolTipText("Locação de Veículo");
        btModLocacao.setPreferredSize(new java.awt.Dimension(89, 89));
        btModLocacao.setSize(new java.awt.Dimension(89, 89));
        btModLocacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btModLocacaoActionPerformed(evt);
            }
        });

        btModGerFrota.setIcon(new javax.swing.ImageIcon("/Users/matheusikenaga/NetBeansProjects/SIGEFROTAS/SIGEFROTAS/imgJAVA/img painel/gerfrotras.png")); // NOI18N
        btModGerFrota.setToolTipText("Gerenciamento de Frotas");
        btModGerFrota.setPreferredSize(new java.awt.Dimension(89, 89));
        btModGerFrota.setSize(new java.awt.Dimension(89, 89));
        btModGerFrota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btModGerFrotaActionPerformed(evt);
            }
        });

        btModCadastros.setIcon(new javax.swing.ImageIcon("/Users/matheusikenaga/NetBeansProjects/SIGEFROTAS/SIGEFROTAS/imgJAVA/img painel/cadastros.png")); // NOI18N
        btModCadastros.setToolTipText("Cadastros");
        btModCadastros.setPreferredSize(new java.awt.Dimension(89, 89));
        btModCadastros.setSize(new java.awt.Dimension(89, 89));
        btModCadastros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btModCadastrosActionPerformed(evt);
            }
        });

        btModComprasEAbast1.setIcon(new javax.swing.ImageIcon("/Users/matheusikenaga/NetBeansProjects/SIGEFROTAS/SIGEFROTAS/imgJAVA/img painel/manutencao.png")); // NOI18N
        btModComprasEAbast1.setToolTipText("Manutenção");
        btModComprasEAbast1.setMaximumSize(new java.awt.Dimension(89, 89));
        btModComprasEAbast1.setMinimumSize(new java.awt.Dimension(89, 89));
        btModComprasEAbast1.setPreferredSize(new java.awt.Dimension(89, 89));
        btModComprasEAbast1.setSize(new java.awt.Dimension(89, 89));
        btModComprasEAbast1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btModComprasEAbast1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btModCadastros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btModGerFrota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btModLocacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btModFinancas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btModComprasEAbast, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btModComprasEAbast1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btModComprasEAbast1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btModCadastros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btModGerFrota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btModLocacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btModFinancas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btModComprasEAbast, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(102, 0, 102));
        jPanel4.setSize(new java.awt.Dimension(0, 9));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 9, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(btSIGEGFROTAS)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 260, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(340, Short.MAX_VALUE))
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btSIGEGFROTAS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(97, 97, 97))
        );

        jLabel3.setText("Contas a Pagar");

        btConsultCtsPagar.setText("Consultar");
        btConsultCtsPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsultCtsPagarActionPerformed(evt);
            }
        });

        btInsCtsPagar.setText("Incluir");
        btInsCtsPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btInsCtsPagarActionPerformed(evt);
            }
        });

        jLabel11.setText("Contas a Receber");

        btInsCtsReceber.setText("Incluir");
        btInsCtsReceber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btInsCtsReceberActionPerformed(evt);
            }
        });

        btConsultCtsReceber.setText("Consultar");
        btConsultCtsReceber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsultCtsReceberActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel11))
                .addGap(121, 121, 121)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btInsCtsPagar)
                    .addComponent(btInsCtsReceber))
                .addGap(118, 118, 118)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btConsultCtsReceber)
                    .addComponent(btConsultCtsPagar))
                .addGap(21, 21, 21))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel3))
                    .addComponent(btInsCtsPagar)
                    .addComponent(btConsultCtsPagar))
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel11))
                    .addComponent(btInsCtsReceber)
                    .addComponent(btConsultCtsReceber))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 148, Short.MAX_VALUE)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(340, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btSIGEGFROTASActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSIGEGFROTASActionPerformed
        new TelaInicial().setVisible(true);
        this.dispose();

        // TODO add your handling code here:
    }//GEN-LAST:event_btSIGEGFROTASActionPerformed

    private void btModComprasEAbastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btModComprasEAbastActionPerformed
        new Modulo5ComprasEAbast().setVisible(true);
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_btModComprasEAbastActionPerformed

    private void btModFinancasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btModFinancasActionPerformed
        new Modulo4Financas().setVisible(true);
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_btModFinancasActionPerformed

    private void btModLocacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btModLocacaoActionPerformed
        new Modulo3Locacao().setVisible(true);
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_btModLocacaoActionPerformed

    private void btModGerFrotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btModGerFrotaActionPerformed
        new Modulo2GerFrota().setVisible(true);
        this.dispose();

        // TODO add your handling code here:
    }//GEN-LAST:event_btModGerFrotaActionPerformed

    private void btModCadastrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btModCadastrosActionPerformed
        new Modulo1Cadastros().setVisible(true);
        this.dispose();

        // TODO add your handling code here:
    }//GEN-LAST:event_btModCadastrosActionPerformed

    private void btModComprasEAbast1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btModComprasEAbast1ActionPerformed
        new Modulo6Manut().setVisible(true);
        this.dispose();

        // TODO add your handling code here:
    }//GEN-LAST:event_btModComprasEAbast1ActionPerformed

    private void btConsultCtsPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultCtsPagarActionPerformed
        new ConsultaCtsPagar().setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_btConsultCtsPagarActionPerformed

    private void btInsCtsPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInsCtsPagarActionPerformed
        new CadastroCtsPagar();
        // TODO add your handling code here:
    }//GEN-LAST:event_btInsCtsPagarActionPerformed

    private void btInsCtsReceberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInsCtsReceberActionPerformed
        new CadastroCtsReceber().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_btInsCtsReceberActionPerformed

    private void btConsultCtsReceberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultCtsReceberActionPerformed
        new ConsultaCtsReceber().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_btConsultCtsReceberActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btConsultAluguel;
    private javax.swing.JButton btConsultAluguel1;
    private javax.swing.JButton btConsultAluguel2;
    private javax.swing.JButton btConsultAluguel3;
    private javax.swing.JButton btConsultAluguel4;
    private javax.swing.JButton btConsultAluguel5;
    private javax.swing.JButton btConsultAluguel6;
    private javax.swing.JButton btConsultCtsPagar;
    private javax.swing.JButton btConsultCtsReceber;
    private javax.swing.JButton btInsAluguel;
    private javax.swing.JButton btInsAluguel1;
    private javax.swing.JButton btInsAluguel2;
    private javax.swing.JButton btInsAluguel3;
    private javax.swing.JButton btInsAluguel4;
    private javax.swing.JButton btInsAluguel5;
    private javax.swing.JButton btInsAluguel6;
    private javax.swing.JButton btInsCtsPagar;
    private javax.swing.JButton btInsCtsReceber;
    private javax.swing.JButton btModCadastros;
    private javax.swing.JButton btModComprasEAbast;
    private javax.swing.JButton btModComprasEAbast1;
    private javax.swing.JButton btModFinancas;
    private javax.swing.JButton btModGerFrota;
    private javax.swing.JButton btModLocacao;
    private javax.swing.JButton btSIGEGFROTAS;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    // End of variables declaration//GEN-END:variables
}
