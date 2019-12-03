/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas.Modulos;

import ExportarDados.ExportVeiculos;
import Telas.Viagem.CadastroViagem;
import Telas.Viagem.ConsultaViagem;
import java.awt.Frame;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author matheusikenaga
 */
public class Modulo2GerFrota extends javax.swing.JFrame {

    /**
     * Creates new form Modulo2
     */
    public Modulo2GerFrota() {
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
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btConsultViagem = new javax.swing.JButton();
        btInsViagem = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

        jPanel4.setBackground(new java.awt.Color(51, 0, 153));
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 266, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(346, Short.MAX_VALUE))
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

        jLabel3.setText("Cadastro Viagem");

        btConsultViagem.setText("Consultar");
        btConsultViagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsultViagemActionPerformed(evt);
            }
        });

        btInsViagem.setText("Incluir");
        btInsViagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btInsViagemActionPerformed(evt);
            }
        });

        jButton1.setText("Exportar Veículos");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1)
                    .addComponent(jLabel3))
                .addGap(136, 136, 136)
                .addComponent(btInsViagem)
                .addGap(118, 118, 118)
                .addComponent(btConsultViagem)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel3))
                    .addComponent(btInsViagem)
                    .addComponent(btConsultViagem))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(48, 48, 48))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1292, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 148, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(276, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btInsViagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInsViagemActionPerformed
        new CadastroViagem().setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_btInsViagemActionPerformed

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

    private void btConsultViagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultViagemActionPerformed
        new ConsultaViagem();
        // TODO add your handling code here:
    }//GEN-LAST:event_btConsultViagemActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            new ExportVeiculos().ExportarVeiculos();
            // TODO add your handling code here:
        } catch (InterruptedException ex) {
            Logger.getLogger(Modulo2GerFrota.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btConsultViagem;
    private javax.swing.JButton btInsViagem;
    private javax.swing.JButton btModCadastros;
    private javax.swing.JButton btModComprasEAbast;
    private javax.swing.JButton btModComprasEAbast1;
    private javax.swing.JButton btModFinancas;
    private javax.swing.JButton btModGerFrota;
    private javax.swing.JButton btModLocacao;
    private javax.swing.JButton btSIGEGFROTAS;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
